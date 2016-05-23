package de.cooperateproject.ui.papyrus.editorlauncher;

import java.io.IOException;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.explorer.repositories.CDORepository;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.services.openelement.service.OpenElementService;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import de.cooperateproject.ui.cdo.sessions.RepositoryManager;
import de.cooperateproject.ui.editors.launcher.extensions.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.editors.launcher.extensions.EditorLauncher;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;

public class PapyrusCDOLauncher extends EditorLauncher {

	private static final String EDITOR_ID_GRAPHICAL = "org.eclipse.papyrus.infra.core.papyrusEditor";
	private Optional<CDOCheckoutHandler> checkoutHandler = null;

	public PapyrusCDOLauncher(IFile launcherFile, EditorType editorType)
			throws IOException, ConcreteSyntaxTypeNotAvailableException {
		super(launcherFile, editorType);
	}

	@Override
	protected IEditorPart doOpenEditor() throws PartInitException {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		checkoutHandler = createCDOCheckoutHandler();
		IEditorInput editorInput = createEditorInput();
		IEditorPart editorPart = IDE.openEditor(page, editorInput, EDITOR_ID_GRAPHICAL);
		selectAppropriateModel(editorPart);
		return editorPart;
	}

	@Override
	protected void editorClosed(IWorkbenchPage p) {
		if (checkoutHandler.isPresent()) {
			checkoutHandler.get().delete();
		}
		super.editorClosed(p);
	}

	private void selectAppropriateModel(IEditorPart editorPart) throws PartInitException {
		try {
			ServicesRegistry servicesRegistry = editorPart.getAdapter(ServicesRegistry.class);
			if (servicesRegistry == null) {
				return;
			}
			servicesRegistry.startRegistry();
			EObject rootObject = getConcreteSyntaxModel().getRootElement();
			if (checkoutHandler.isPresent()) {
				final EObject checkedOutRootObject = checkoutHandler.get().getObject(rootObject);
				final CDOObject checkedOutCDObject = CDOUtil.getCDOObject(checkedOutRootObject);

				IPageManager pageManager = servicesRegistry.getService(IPageManager.class);
				Optional<CDOObject> pagedElement = pageManager.allPages().stream().filter(p -> p instanceof EObject)
						.map(p -> (EObject) p).map(CDOUtil::getCDOObject)
						.filter(o -> checkedOutCDObject.cdoID().equals(o.cdoID())).findFirst();

				if (pagedElement.isPresent()) {
					rootObject = pagedElement.get();
				} else {
					rootObject = checkedOutRootObject;
				}
			}

			OpenElementService openElementService = servicesRegistry.getService(OpenElementService.class);
			openElementService.openElement(rootObject);
		} catch (ServiceException e) {
			throw new PartInitException("Could not select the correct diagram.", e);
		}
	}

	private Optional<CDOCheckoutHandler> createCDOCheckoutHandler() {
		EObject rootElement = getConcreteSyntaxModel().getRootElement();
		if (rootElement.eResource() instanceof CDOResource) {
			Optional<CDORepository> repo = getRepository();
			if (repo.isPresent()) {
				return Optional.of(new CDOCheckoutHandler(repo.get()));
			}
		}
		return Optional.empty();
	}

	private IEditorInput createEditorInput() {
		EObject rootElement = getConcreteSyntaxModel().getRootElement();

		Resource r = createPlainResource(rootElement);
		if (rootElement.eResource() instanceof CDOResource) {
			r = createCDOResource(rootElement);
		}

		URI originalUri = r.getURI();
		String[] segments = originalUri.segments();
		String modelName = segments[segments.length - 1];
		String resourceExtension = originalUri.fileExtension();
		String plainName = modelName.replaceFirst("\\." + resourceExtension + "$", "");
		String launcherName = plainName + ".di";
		segments[segments.length - 1] = launcherName;
		URI uriToLaunch = URI.createHierarchicalURI(originalUri.scheme(), originalUri.authority(), originalUri.device(),
				segments, originalUri.query(), originalUri.fragment());
		return new URIEditorInput(uriToLaunch);
	}

	private Resource createPlainResource(EObject rootElement) {
		return rootElement.eResource();
	}

	private Resource createCDOResource(EObject rootelement) {
		CDOResource cdoResource = (CDOResource) rootelement.eResource();
		return (CDOResource) checkoutHandler.get().getObject(cdoResource.cdoID());
	}

	private Optional<CDORepository> getRepository() {
		return RepositoryManager.getInstance().getRepository(getCDOSession());
	}

}