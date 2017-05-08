package de.cooperateproject.ui.editors.launcher;

import java.io.IOException;
import java.net.URI;
import java.util.Optional;

import org.eclipse.core.filesystem.URIUtil;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncher;
import de.cooperateproject.ui.editors.launcher.extensions.IEditorLauncherFactory;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;

public class EditorLauncher implements org.eclipse.ui.IEditorLauncher {

    private static final Logger LOGGER = LoggerFactory.getLogger(EditorLauncher.class);

    @Override
    public void open(IPath file) {
        // check if launcher is applicable for file type
        if (!LauncherModelHelper.FILE_EXTENSION.equals(file.getFileExtension())) {
            return;
        }

        // find workspace file
        URI fileURI = URIUtil.toURI(file);
        IFile[] foundResources = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(fileURI);
        if (foundResources == null || foundResources.length != 1) {
            return;
        }
        IFile launcherFile = foundResources[0];

        // determine preferred editor type
        Optional<EditorType> preferredEditorType = getPreferredEditorType();
        if (!preferredEditorType.isPresent()) {
            return;
        }

        // open the editor
        try {
            Optional<IEditorLauncherFactory> editorLauncherFactory = EditorLauncherRegistry.getInstance()
                    .getFactory(preferredEditorType.get());
            if (!editorLauncherFactory.isPresent()) {
                throw new PartInitException("No editor available for that type.");
            }
            Optional<IEditorPart> existingEditor = editorLauncherFactory.get().findExistingEditor(launcherFile,
                    preferredEditorType.get());
            if (existingEditor.isPresent()) {
                existingEditor.get().setFocus();
            } else {
                IEditorLauncher launcher = editorLauncherFactory.get().create(launcherFile, preferredEditorType.get());
                launcher.openEditor();
            }
        } catch (IOException e) {
            LOGGER.error("Could not read launcher file.", e);
        } catch (ConcreteSyntaxTypeNotAvailableException e) {
            LOGGER.warn("The selected editor type is not available for this model.", e);
            // TODO maybe display warning to user
        } catch (PartInitException e) {
            LOGGER.error("Error during initialization of editor.", e);
        }

    }

    private Optional<EditorType> getPreferredEditorType() {
        MessageDialog dlg = new MessageDialog(Display.getCurrent().getActiveShell(), "Editor Type Selection", null,
                "Which editor type do you prefer?", MessageDialog.QUESTION_WITH_CANCEL,
                new String[] { "Textual", "Graphical", "Cancel" }, 0);
        int result = dlg.open();
        switch (result) {
        case 1:
            return Optional.ofNullable(EditorType.GRAPHICAL);
        case 0:
            return Optional.ofNullable(EditorType.TEXTUAL);
        default:
            return Optional.empty();
        }
    }

}
