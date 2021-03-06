package de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.internal;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.ltk.ui.refactoring.UserInputWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * Wizard page that asks for the new name of an UML element.
 */
public class RenameUMLElementRefactoringWizardUserPage extends UserInputWizardPage {

    private final boolean nameMightBeEmpty;
    private final IObservableValue<String> validationErrorMessage;
    private final IObservableValue<String> newName;
    private final IObservableValue<String> newAlias;
    private boolean aliasIsAvailable;

    /**
     * Instantiates the wizard page.
     * 
     * @param newName
     *            The object that will receive the new name specified by the user.
     * @param nameMightBeEmpty
     */
    public RenameUMLElementRefactoringWizardUserPage(IObservableValue<String> newName,
            IObservableValue<String> newAlias, boolean nameMightBeEmpty, boolean aliasIsAvailable) {
        super("Refactoring input data");
        this.nameMightBeEmpty = nameMightBeEmpty;
        this.aliasIsAvailable = aliasIsAvailable;
        this.newName = newName;
        this.newAlias = newAlias;
        this.validationErrorMessage = new WritableValue<>();
        validationErrorMessage.addValueChangeListener(event -> handleValidationErrorMessage(event.diff.getNewValue()));
    }

    @Override
    public void createControl(Composite parent) {
        setControl(new RenameUMLElementRefactoringWizardUserPageComposite(parent, SWT.FILL, newName, newAlias,
                validationErrorMessage, nameMightBeEmpty, aliasIsAvailable));
    }

    @Override
    public boolean isPageComplete() {
        return getErrorMessage() == null && super.isPageComplete();
    }

    private void handleValidationErrorMessage(String message) {
        if (StringUtils.isBlank(message)) {
            setErrorMessage(null);
        } else {
            setErrorMessage(message);
        }
    }
}
