package de.cooperateproject.modeling.textual.common.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.Element

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import org.eclipse.emf.ecore.EObject

class CommonUMLReferencingElementMissingElementResolvableChecker implements IResolvableChecker<UMLReferencingElement<Element>> {
	
	override isResolvable(UMLReferencingElement<Element> element) {
	   element.isResolvableInternal
	}

	private def dispatch isResolvableInternal(Comment comment) {
		comment.commentedElement.hasReferencedElement
	}
	
	private def dispatch isResolvableInternal(PackageImport pkgImport) {
		val importedPackage = pkgImport.eGet(TextualCommonsPackage.Literals.PACKAGE_IMPORT__IMPORTED_PACKAGE) as EObject
		pkgImport.importingPackage.hasReferencedElement && importedPackage !== null && !importedPackage.eIsProxy
	}
}
