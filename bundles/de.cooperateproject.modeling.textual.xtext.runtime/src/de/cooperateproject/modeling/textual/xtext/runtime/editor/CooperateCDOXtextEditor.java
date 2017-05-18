package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.ILock;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.contexts.IContextActivation;
import org.eclipse.ui.contexts.IContextService;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.service.OperationCanceledError;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.common.collect.Sets;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.runtime.editor.errorindicator.ErrorIndicatorContext;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolution;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionProvider;
import de.cooperateproject.ui.preferences.ErrorIndicatorSettings;
import de.cooperateproject.ui.preferences.PreferenceHandler;
import net.winklerweb.cdoxtext.runtime.CDOXtextEditor;
import net.winklerweb.cdoxtext.runtime.ICDOResourceStateCalculator;

public class CooperateCDOXtextEditor extends CDOXtextEditor {

    private static class PostProcessorHandler implements SaveablePostProcessingSupport {

        private final Set<SavePostProcessor> processors = Sets.newHashSet();

        @Override
        public void register(SavePostProcessor postProcessor) {
            processors.add(postProcessor);
        }

        @Override
        public void unregister(SavePostProcessor postProcessor) {
            processors.remove(postProcessor);
        }

        private void executePostProcessors() throws Exception {
            for (SavePostProcessor processor : processors) {
                processor.processAfterSafe();
            }
        }

    }

    public static final String CONTEXT_ID = "de.cooperateproject.modeling.textual.xtext.runtime.CooperateCDOXtextEditor";
    private final PostProcessorHandler postProcessorHandler = new PostProcessorHandler();
    private final ErrorIndicatorContext errorSignalContext = new ErrorIndicatorContext();
    private IContextActivation contextActivation;
    private static final Logger LOGGER = Logger.getLogger(CooperateCDOXtextEditor.class);
    private static ILock lock = Job.getJobManager().newLock();

    @Inject
    private IResourceValidator resourceValidator;

    @Inject
    private IAutomatedIssueResolutionProvider automatedIssueResolutionProvider;

    @Inject
    private ICDOResourceStateCalculator resourceStateCalculator;

    @Override
    protected void handleCursorPositionChanged() {
        super.handleCursorPositionChanged();
        IXtextDocument document = getDocument();
        CooperateXtextDocument cooperateXtextDocument = document.getAdapter(CooperateXtextDocument.class);
        if (cooperateXtextDocument.getResource() == null) {
            return;
        }
        ErrorIndicatorSettings signalType = PreferenceHandler.INSTANCE.getErrorIndicatorSetting();
        EList<Diagnostic> errors = cooperateXtextDocument.getResource().getErrors();

        errorSignalContext.createSignal(errors, getCursorPosition(), signalType);
    }

    @Override
    public void doSave(IProgressMonitor progressMonitor) {
        CooperateXtextDocument cooperateXtextDocument = getDocument().getAdapter(CooperateXtextDocument.class);
        if (containsSyntaxErrors(cooperateXtextDocument)) {
            openErrorDialog("Save Error", "Can't save because of syntax errors.");
            return;
        }
        performPreSaveActions();
        IStatus status = scheduleValidation(cooperateXtextDocument);
        if (status.isOK()) {
            if (!getAllIssues(cooperateXtextDocument).isEmpty()) {
                openErrorDialog("Save Error", "Can't save because of semantic errors.");
                return;
            }
            Job job = new Job("Save") {
                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    SubMonitor subMonitor = SubMonitor.convert(monitor, 100);
                    Display.getDefault().syncExec(new Runnable() {

                        @Override
                        public void run() {
                            try {
                                lock.acquire();
                                subMonitor.setTaskName("Saving diagram.");
                                saveDocument(subMonitor.split(100));
                            } finally {
                                lock.release();
                            }
                        }
                    });
                    return Status.OK_STATUS;
                }
            };
            job.setUser(true);
            job.schedule();
            try {
                job.join();
            } catch (InterruptedException e) {
                LOGGER.error("Error during save operation.", e);
                return;
            }
        } else if (status.matches(IStatus.CANCEL)) {
            openErrorDialog("Wait for validation", "Wait for Validation to finish before saving!");
            return;
        }
    }

    private boolean containsSyntaxErrors(CooperateXtextDocument document) {
        List<Issue> detectedIssues = getAllIssues(document);
        Collection<String> syntaxErrorCodes = Sets.newHashSet(
                org.eclipse.xtext.diagnostics.Diagnostic.SYNTAX_DIAGNOSTIC,
                org.eclipse.xtext.diagnostics.Diagnostic.SYNTAX_DIAGNOSTIC_WITH_RANGE);
        return detectedIssues.stream().anyMatch(i -> syntaxErrorCodes.contains(i.getCode()));
    }

    private List<Issue> getAllIssues(CooperateXtextDocument document) throws OperationCanceledError {
        List<Issue> detectedIssues = resourceValidator.validate(document.getResource(), CheckMode.ALL,
                CancelIndicator.NullImpl);
        return detectedIssues;
    }

    private void performPreSaveActions() {
        performValidationIssueFixing();
    }

    private void performValidationIssueFixing() {
        if (automatedIssueResolutionProvider == null) {
            return;
        }

        CooperateXtextDocument cooperateXtextDocument = getDocument().getAdapter(CooperateXtextDocument.class);

        TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE
                .createEditingDomain(cooperateXtextDocument.getResource().getResourceSet());
        try {
            performIssueValidationFixingTransactional(domain, cooperateXtextDocument.getResource());
        } finally {
            domain.dispose();
        }

    }

    private void performIssueValidationFixingTransactional(TransactionalEditingDomain domain, Resource documentResource)
            throws OperationCanceledError {

        final Collection<Issue> detectedIssues = new ArrayList<>();
        domain.getCommandStack().execute(new RecordingCommand(domain) {

            @Override
            protected void doExecute() {
                Collection<IAutomatedIssueResolution> issueResolutions = Collections.emptyList();
                do {
                    issueResolutions.forEach(i -> i.resolve());
                    if (documentResource instanceof DerivedStateAwareResource) {
                        resourceStateCalculator.simulateReloadingResource(documentResource);
                        resourceStateCalculator.calculateState(documentResource);
                    }
                    detectedIssues.clear();
                    detectedIssues.addAll(
                            resourceValidator.validate(documentResource, CheckMode.ALL, CancelIndicator.NullImpl));
                    issueResolutions = automatedIssueResolutionProvider.get(documentResource, detectedIssues);
                } while (issueResolutions.stream().anyMatch(IAutomatedIssueResolution::resolvePossible));
            }
        });

        if (detectedIssues.stream().anyMatch(automatedIssueResolutionProvider::hasResolution)) {
            domain.getCommandStack().undo();
        }

    }

    private void saveDocument(IProgressMonitor progressMonitor) {
        SubMonitor subMonitor = SubMonitor.convert(progressMonitor, 100);
        if (getDocument() != null) {
            saveAllAssociated(getDocument());
        }
        super.doSave(subMonitor.split(100));
        try {
            postProcessorHandler.executePostProcessors();
        } catch (Exception e) {
            throw new RuntimeException("Error during post processing.", e);
        }
    }

    private IStatus scheduleValidation(CooperateXtextDocument cooperateXtextDocument) {
        Job validationJob = cooperateXtextDocument.getValidationJob();
        validationJob.schedule();
        try {
            validationJob.join();
        } catch (InterruptedException e) {
            LOGGER.trace("Error during validation.", e);
        }
        return validationJob.getResult();
    }

    private void openErrorDialog(String title, String body) {
        MessageDialog dialog = new MessageDialog(Display.getCurrent().getActiveShell(), title, null, body,
                MessageDialog.ERROR, new String[] { "OK" }, 0);
        dialog.open();
    }

    private void saveAllAssociated(IXtextDocument iXtextDocument) {
        CooperateXtextDocument cooperateXtextDocument = getDocument().getAdapter(CooperateXtextDocument.class);
        if (cooperateXtextDocument != null) {
            saveAllAssociated(cooperateXtextDocument);
        }
    }

    private void saveAllAssociated(CooperateXtextDocument document) {
        ResourceSet rs = document.getResource().getResourceSet();
        List<Resource> resourcesToBeSaved = rs.getResources().stream().filter(r -> r != document.getResource())
                .filter(r -> !r.isTrackingModification() || r.isModified()).collect(Collectors.toList());

        for (Resource r : resourcesToBeSaved) {
            try {
                r.save(Collections.emptyMap());
            } catch (IOException e) {
                throw new RuntimeException("Error during save of associated resources.", e);
            }
        }
    }

    @SuppressWarnings("rawtypes")
    public Object getAdapter(Class requestedClass) {
        if (SaveablePostProcessingSupport.class.isAssignableFrom(requestedClass)) {
            return postProcessorHandler;
        }
        return super.getAdapter(requestedClass);
    }

    @Override
    public void createPartControl(Composite parent) {
        super.createPartControl(parent);
        contextActivation = getSite().getService(IContextService.class).activateContext(CONTEXT_ID);
    }

    @Override
    public void dispose() {
        getSite().getService(IContextService.class).deactivateContext(contextActivation);
        super.dispose();
    }

}
