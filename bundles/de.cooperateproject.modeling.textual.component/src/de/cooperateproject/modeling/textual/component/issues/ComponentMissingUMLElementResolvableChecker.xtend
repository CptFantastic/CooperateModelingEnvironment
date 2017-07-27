package de.cooperateproject.modeling.textual.component.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.component.metamodel.component.Component
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Package

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class ComponentMissingUMLElementResolvableChecker implements IResolvableChecker<UMLReferencingElement<Element>> {
	
	override isResolvable(UMLReferencingElement<Element> element) {
		element.resolvePossible
	}
	
	private def dispatch resolvePossible(UMLReferencingElement element) {
	    return false;
	}
	
	private def dispatch resolvePossible(Component element) {
		if (!element.hasValidParent(TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT)) {
			return false;
		}
		val parent = element.eContainer as UMLReferencingElement<Element>
		return parent.hasReferencedElementOfType(Package) || parent.hasReferencedElementOfType(Class)
	}
	
}