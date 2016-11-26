/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls.validation

import de.cooperateproject.modeling.textual.cls.cls.Association
import de.cooperateproject.modeling.textual.cls.cls.Attribute
import de.cooperateproject.modeling.textual.cls.cls.Class
import de.cooperateproject.modeling.textual.cls.cls.Classifier
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.Commentable
import de.cooperateproject.modeling.textual.cls.cls.DataTypeReference
import de.cooperateproject.modeling.textual.cls.cls.Generalization
import de.cooperateproject.modeling.textual.cls.cls.Implementation
import de.cooperateproject.modeling.textual.cls.cls.Interface
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.cls.cls.Package
import de.cooperateproject.modeling.textual.cls.cls.PackageImport
import de.cooperateproject.modeling.textual.cls.cls.Property
import de.cooperateproject.modeling.textual.cls.cls.TypeReference
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.TypedElement
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ClsValidator extends AbstractClsValidator {

	public static val NO_CLASS_REFERENCE = 'no_class_reference'
	public static val NO_INTERFACE_REFERENCE = 'no_interface_reference'
	public static val NO_PACKAGE_REFERENCE = 'no_package_reference'
	public static val NO_IMPORT_REFERENCE = 'no_import_reference'
	public static val NO_PROPERTY_REFERENCE = 'no_property_reference'
	public static val WRONG_PROPERTY_TYPE = 'wrong_property_type'
	public static val NO_OPERATION_REFERENCE = 'no_operation_reference'
	public static val NO_ASSOCIATION_REFERENCE = 'no_association_reference'
	public static val NO_GENERALIZATION_REFERENCE = 'no_generalization_reference'
	public static val NO_REALIZATION_REFERENCE = 'no_realization_reference'
	public static val NO_ALIAS_NAME = 'no_alias_name'
	public static val WRONG_ALIAS_NAME = 'wrong_alias_name'
	public static val NO_COMMENT_REFERENCE = 'no_comment_reference'

	@Check
	def checkAliasExpression(Classifier classifier) {
		val model = classifier.referencedElement.model
		val refNode = classifier.extractRefNode(ClsPackage.eINSTANCE.namedElementAliased_AliasExpression)
		
		if (model != null && refNode != null) {
			val modelAlias = classifier.referencedElement.nameExpression
			val aliasString = refNode.text ?: "aliasString"
			val textModelAlias = classifier.alias
			if (modelAlias == null)
				error("No alias '" + aliasString + "' found", ClsPackage.eINSTANCE.namedElementAliased_AliasExpression,
					NO_ALIAS_NAME, {
						aliasString
					})
			else if (modelAlias.name != textModelAlias) {
				error("Inconsistent alias '" + aliasString + "' found",
					ClsPackage.eINSTANCE.namedElementAliased_AliasExpression, WRONG_ALIAS_NAME, {
						aliasString
					})

			}
		}
		 
	}


	@Check
	def checkIfAssociationExists(Association association) {
		if (association.referencedElement.model == null) {
			val refNode = association.extractRefNode(ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement)
			val propertyNameLeft = association.properties?.extractRefNode(ClsPackage.eINSTANCE.associationProperties_PropertyLeft)?.text ?: ""
			val propertyNameRight = association.properties?.extractRefNode(ClsPackage.eINSTANCE.associationProperties_PropertyRight)?.text ?: ""
			val associationName = refNode.text ?: "associationName"
			val String[] issueData = #[associationName, propertyNameLeft, propertyNameRight]
			error("No Referenced UML-Association Element", ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement,
				NO_ASSOCIATION_REFERENCE, issueData)
		}
	}
	
	@Check
	def checkIfGeneralizationExists(Generalization generalization) {
		if (generalization.referencedElement == null) {
			error("No Referenced UML-Generalization Element", ClsPackage.eINSTANCE.generalization_ReferencedElement,
				NO_GENERALIZATION_REFERENCE)
		}
	}
	
	@Check
	def checkIfRealizationExists(Implementation realization) {
		if (realization.referencedElement == null) {
			error("No Referenced UML-InterfaceRealization Element", ClsPackage.eINSTANCE.implementation_ReferencedElement,
				NO_REALIZATION_REFERENCE)
		}
	}
	 

	@Check
	def checkIfClassExists(Class classifier) {
		if (classifier.referencedElement.model == null) {
			val refNode = classifier.extractRefNode(ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement)
			val classifierName = refNode.text ?: "className"
			error("Couldn't find UML-Class '" + classifierName + "' in model", ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement,
				NO_CLASS_REFERENCE, {classifierName})
		}
	}

	@Check
	def checkIfInterfaceExists(Interface classifier) {
		if (classifier.referencedElement.model == null) {
			val refNode = classifier.extractRefNode(ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement)
			val classifierName = refNode.text ?: "interfaceName"
			error("Couldn't find UML-Interface '" + classifierName + "' in model", ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement,
				NO_INTERFACE_REFERENCE, {classifierName})
		}
	}
	
	@Check
	def checkIfPackageExists(Package pack) {
		if (pack.referencedElement.model == null) {
			val refNode = pack.extractRefNode(ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement)
			val packageName = refNode.text ?: "packageName"
			error("Couldn't find UML-Package '" + packageName + "' in model", ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement,
				NO_PACKAGE_REFERENCE, {packageName})
		}
	}
	
	@Check
	def checkIfPackageImportExists(PackageImport imported) {
		if (imported.referencedElement.model == null) {
			val refNode = imported.extractRefNode(ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement)
			val packageName = refNode.text ?: "packageName"
			error("Couldn't find  PackageImport for '" + packageName + "' in model", ClsPackage.eINSTANCE.packageImport_ReferencedElement,
				NO_IMPORT_REFERENCE, {packageName})
		}
	}

	@Check
	def checkIfPropertyExists(Attribute attribute) {
		if (attribute.referencedElement.model == null) {
			val refNode = attribute.extractRefNode(ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement)
			val attributeName = refNode.text ?: "attributeName"
			error("No Referenced UML-Property", ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement,
				NO_PROPERTY_REFERENCE, {attributeName})
		} 
	}
	
	@Check
	def checkCorrectPropertyType(Property<? extends NamedElement> property) {
		val model = property.referencedElement.model
		val refNode = property.extractRefNode(ClsPackage.eINSTANCE.property_Type)
		val typeName = refNode.text ?: "typeName"
		
		if (model != null && !property.hasCorrectType) {
			error("Inconsistent Type detected", ClsPackage.eINSTANCE.property_Type, WRONG_PROPERTY_TYPE, {typeName})
		}
	}
	
	@Check
	def checkIfOperationExists(Method method) {
		if (method.referencedElement.model == null) {
			error("No Referenced UML-Operation", ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement,
				NO_OPERATION_REFERENCE)
		}
	}
	
	@Check
	def checkIfCommentExists(Commentable commentable) {
		if (commentable.comment.model == null) {
			error("No Referenced UML-Comment", ClsPackage.eINSTANCE.commentable_Comment, NO_COMMENT_REFERENCE)
		}
	}
	
	private static def extractRefNode(EObject element, EReference ref) {
		 NodeModelUtils.findNodesForFeature(element, ref).head
	}
	
	private static def hasCorrectType(Property<? extends NamedElement> property) {
		val umlReferencedElement = property.referencedElement
		var Type umlType = null
		if (umlReferencedElement instanceof TypedElement) {
			umlType = umlReferencedElement.type
		} else if (umlReferencedElement instanceof Operation) {
			umlType = umlReferencedElement.type
		}
		return property.type.matches(umlType)
	}
	
	private static def matches(TypeReference clsType, Type umlType) {
			if (clsType instanceof DataTypeReference) {
				var type = clsType.type
				var refType = TypeConverter.getPrimitive(umlType)
				return type.equals(refType)
			} else if (clsType instanceof UMLTypeReference) {
				var type = clsType.type
				return type.name.equals(umlType.name)
			} else if (clsType == null) {
				return umlType == null
			}
			return true
	}

}
