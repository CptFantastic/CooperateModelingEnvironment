package de.cooperateproject.modeling.textual.cls.ui.refactoring.rename;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;

import de.cooperateproject.modeling.textual.xtext.runtime.editor.IReloadingEditor;

public class EditorReloadingChange extends Change {

    private final IReloadingEditor editor;

    public EditorReloadingChange(IReloadingEditor editor) {
        super();
        this.editor = editor;
    }

    @Override
    public String getName() {
        return "Reload editor contents";
    }

    @Override
    public void initializeValidationData(IProgressMonitor pm) {
        return;
    }

    @Override
    public RefactoringStatus isValid(IProgressMonitor pm) throws CoreException, OperationCanceledException {
        return new RefactoringStatus();
    }

    @Override
    public Change perform(IProgressMonitor pm) throws CoreException {
        try {
            pm.beginTask("Reloading editor contents", 0);
            editor.getEditorSite().getShell().getDisplay().syncExec(() -> editor.reloadDocumentContent());
            return new EditorReloadingChange(editor);
        } finally {
            pm.done();
        }
    }

    @Override
    public Object getModifiedElement() {
        return null;
    }

}
