/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls.ui.outline

import com.google.common.base.Predicate
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.Connector
import de.cooperateproject.modeling.textual.cls.cls.Package
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation
import de.cooperateproject.modeling.textual.cls.ui.labeling.UMLImage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import java.util.Collection
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.jface.viewers.StyledString
import org.eclipse.swt.graphics.Image
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#outline
 */
class ClsOutlineTreeProvider extends DefaultOutlineTreeProvider {

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
	
	dispatch def createChildren(IOutlineNode parentNode, Commentable<?> commentable) {
		if (!commentable.comments.isEmpty) {
			val comment = commentable.comments.findFirst[true]
			createEObjectNode(parentNode, comment , UMLImage.COMMENT.image, textDispatcher.invoke(comment), true)
		}
	}

	protected def dispatch createNode(EStructuralFeatureNode parentNode, Connector c) {
		createConnectorNode(parentNode, c)
	}

	def createConnectorNode(EStructuralFeatureNode node, Connector connector) {
		createEObjectNode(node, connector)
		return
	}

	private def getStyledString(String name, int counter) {
		var styledLabel = new StyledString()
		styledLabel.append(name)
		styledLabel.append(new StyledString(" : " + counter, StyledString::DECORATIONS_STYLER))
		return styledLabel
	}

	private def <T extends EObject> createFeatureNode(IOutlineNode parentNode, T parent, EReference ref, Image img,
		StyledString text, boolean isLeaf) {
		val result = parent.eGet(ref);
		if (result instanceof Collection<?>) {
			createFeatureNode(parentNode, parent, ref, img, text, isLeaf, [!result.empty])
		} else if (result !== null) {
			createFeatureNode(parentNode, parent, ref, img, text, isLeaf, [true])
		}
	}

	private def <T extends EObject> createFeatureNode(IOutlineNode parentNode, T parent, EReference ref, Image img,
		StyledString text, boolean isLeaf, Predicate<T> pred) {
		if (pred.apply(parent)) {
			createEStructuralFeatureNode(parentNode, parent, ref, img, text, isLeaf)
		}
	}

}
