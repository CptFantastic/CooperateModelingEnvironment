/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls.ui.outline

import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.Connector
import de.cooperateproject.modeling.textual.cls.cls.Package
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode
import de.cooperateproject.modeling.textual.common.outline.CooperateOutlineTreeProvider
import de.cooperateproject.modeling.textual.common.outline.UMLImage
import de.cooperateproject.modeling.textual.cls.cls.Classifier

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#outline
 */
class ClsOutlineTreeProvider extends CooperateOutlineTreeProvider {

	dispatch def createChildren(IOutlineNode parentNode, ClassDiagram root) {
		if (root.rootPackage === null) {
			return
		}
		createNode(parentNode, root.rootPackage)
	}

	dispatch def createChildren(IOutlineNode parentNode, Package pkg) {
		createFeatureNode(parentNode, pkg, TextualCommonsPackage.Literals.PACKAGE_BASE__PACKAGES, UMLImage.PACKAGE.image,
			getStyledString("Packages", pkg.packages.size), false)
		createFeatureNode(parentNode, pkg, TextualCommonsPackage.Literals.PACKAGE_BASE__PACKAGE_IMPORTS,
			UMLImage.PACKAGE_IMPORT.image, getStyledString("Imports", pkg.packageImports.size), false)
		createFeatureNode(parentNode, pkg, ClsPackage.Literals.PACKAGE__CLASSIFIERS, UMLImage.CLASS.image,
			getStyledString("Classifiers", pkg.classifiers.size), false)
		createFeatureNode(parentNode, pkg, ClsPackage.Literals.PACKAGE__CONNECTORS, UMLImage.ASSOCIATION.image,
			getStyledString("Connectors", pkg.connectors.size), false)
	}

	dispatch def createChildren(IOutlineNode parentNode, XtextAssociation asc) {
		asc.memberEndTypes.forEach[t|createEObjectNode(parentNode, t)];
		_createChildren(parentNode, asc as Commentable<?>)
	}
	
	dispatch def createChildren(IOutlineNode parentNode, Classifier classifier) {
		classifier.members.forEach[t|createEObjectNode(parentNode, t)];
		_createChildren(parentNode, classifier as Commentable<?>)
	}
	
	protected def dispatch createNode(EStructuralFeatureNode parentNode, Connector c) {
		createConnectorNode(parentNode, c)
	}
	protected def dispatch createNode(IOutlineNode parentNode, Package element) {
	    if (element.owningPackage === null) {
	       createEObjectNode(parentNode, element.referencedElement)
	    } else {
	       createEObjectNode(parentNode, element)
	    }
	}

	def createConnectorNode(EStructuralFeatureNode node, Connector connector) {
		createEObjectNode(node, connector)
		return
	}

}
