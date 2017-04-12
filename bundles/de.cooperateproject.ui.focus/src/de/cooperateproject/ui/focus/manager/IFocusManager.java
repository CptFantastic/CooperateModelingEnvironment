package de.cooperateproject.ui.focus.manager;

import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.uml2.uml.Element;

import de.cooperateproject.modeling.common.types.DiagramTypes;

public interface IFocusManager {

    /**
     * Sets the focus to the given element in the opened Xtext or Papyrus editor.
     * 
     * @param element
     *            the element which should get the focus
     */
    void setFocusedElement(EObject element);

    /**
     * Extracts the current element focus of the editor.
     * 
     * @return the focused element
     */
    Optional<Element> getFocusedElement();

    IEditorPart getEditorPart();

    IFile getCooperateLauncherFile();

    Optional<CDOView> getCDOView();

    Optional<DiagramTypes> getDiagramType();
}