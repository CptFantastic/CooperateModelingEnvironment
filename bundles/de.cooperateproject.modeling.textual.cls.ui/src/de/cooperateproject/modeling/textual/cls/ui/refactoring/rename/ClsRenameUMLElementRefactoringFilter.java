/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.cls.ui.refactoring.rename;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.Element;

import com.google.common.collect.Sets;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.IRenameUMLElementRefactoringFilter;

/**
 * Element filter for {@link UMLReferencingElement} elements that shall not be usable in the according rename
 * refactoring.
 */
public class ClsRenameUMLElementRefactoringFilter implements IRenameUMLElementRefactoringFilter {

    private static final Collection<EClass> BLOCKED_ECLASSES = Sets.newHashSet(ClsPackage.Literals.IMPLEMENTATION);

    @Override
    public boolean prohibitRefactoring(UMLReferencingElement<? extends Element> element) {
        return BLOCKED_ECLASSES.contains(element.eClass());
    }

}