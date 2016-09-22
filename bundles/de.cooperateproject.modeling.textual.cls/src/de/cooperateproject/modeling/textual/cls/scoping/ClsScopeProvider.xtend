/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls.scoping

import com.google.common.base.Predicate
import de.cooperateproject.modeling.textual.cls.cls.Association
import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties
import de.cooperateproject.modeling.textual.cls.cls.Attribute
import de.cooperateproject.modeling.textual.cls.cls.Class
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.CommentLink
import de.cooperateproject.modeling.textual.cls.cls.Commentable
import de.cooperateproject.modeling.textual.cls.cls.Connector
import de.cooperateproject.modeling.textual.cls.cls.MemberEnd
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.cls.cls.MultiAssociation
import de.cooperateproject.modeling.textual.cls.cls.NamedElementAliased
import de.cooperateproject.modeling.textual.cls.cls.Parameter
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference
import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.Switch
import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.Comment
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.FilteringScope
import org.eclipse.uml2.uml.NamedElement

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 * 
 */
class ClsScopeProvider extends AbstractDeclarativeScopeProvider {

	override getScope(EObject context, EReference reference) {
		val baseScope = super.getScope(context, reference)
		val Switch<IScope> scopeSwitch = new UMLReferencingScopeSwitch(baseScope, reference)
		return scopeSwitch.doSwitch(context)
	}

	static class UMLReferencingScopeSwitch extends ClsSwitch<IScope> {
		val IScope baseScope
		val EReference reference

		new(IScope scope, EReference reference) {
			this.baseScope = scope
			this.reference = reference
		}

		override caseAttribute(Attribute attribute) {
			if (reference == ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement) {
				return UMLPackage.Literals.PROPERTY.filterScope(attribute.owner.referencedElement)
			
			}
		}

		override caseClass(Class clazz) {
			if (reference == ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement) {
				return UMLPackage.Literals.CLASS.filterScope			
			}
		}

		override caseMethod(Method method) {
			if (reference == ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement) {
				return UMLPackage.Literals.OPERATION.filterScope(method.owner.referencedElement)
			}
		}

		override caseParameter(Parameter param) {
			if (reference == ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement) {
				return UMLPackage.Literals.PARAMETER.filterScope(param.owner.referencedElement)
			}
		}

		override caseConnector(Connector object) {
			if (reference == ClsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement) {
				return UMLPackage.Literals.RELATIONSHIP.filterScope			
			}
		}
		
		override caseAssociation(Association association) {
			if (reference == ClsPackage.Literals.COMMENTABLE__COMMENT) {
				return UMLPackage.Literals.COMMENT.filterScope([(EObjectOrProxy as Comment).annotatedElements.contains(association.referencedElement)])
			}
		}
		
		override caseCommentLink(CommentLink commentLink) {
			if (reference == ClsPackage.Literals.COMMENTABLE__COMMENT) {
				if (commentLink.left instanceof UMLTypeReference) {
					val annotatedType = (commentLink.left as UMLTypeReference).type
					return UMLPackage.Literals.COMMENT.filterScope([(EObjectOrProxy as Comment).annotatedElements.contains(annotatedType)])
				}
			}
		}

		override caseCommentable(Commentable commentable) {
			if (reference == ClsPackage.Literals.COMMENTABLE__COMMENT) {
				return UMLPackage.Literals.COMMENT.filterScope
			}
		}
		
		override caseAssociationProperties(AssociationProperties properties) {
			if (#{ClsPackage.Literals.ASSOCIATION_PROPERTIES__PROPERTY_LEFT, ClsPackage.Literals.ASSOCIATION_PROPERTIES__PROPERTY_RIGHT}.contains(reference)) {
				val association = properties.association
				var Classifier wantedType
				if (ClsPackage.Literals.ASSOCIATION_PROPERTIES__PROPERTY_LEFT == reference) {
					wantedType = association?.left?.type as Classifier
				} else if (ClsPackage.Literals.ASSOCIATION_PROPERTIES__PROPERTY_RIGHT == reference) {
					wantedType = association?.right?.type as Classifier
				} else {
					return null
				}
				val wantedTypeFinal = wantedType
				return UMLPackage.Literals.PROPERTY.filterScope[association.referencedElement.memberEnds.contains(EObjectOrProxy) && (EObjectOrProxy as Property).type.equals(wantedTypeFinal)]
			}
		}
		
		override caseMemberEnd(MemberEnd memberEnd) {
			if (reference == ClsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT) {
				return UMLPackage.Literals.PROPERTY.filterScope[(EObjectOrProxy as Property).type == memberEnd.type.type]
			}
		}
		
		override caseUMLTypeReference(UMLTypeReference typeRef) {
			if (reference == ClsPackage.Literals.UML_TYPE_REFERENCE__TYPE) {
				val container = typeRef.eContainer
				if (container instanceof MemberEnd) {
					return UMLPackage.Literals.CLASSIFIER.filterScope.filterScopeIgnoreType(UMLPackage.Literals.ASSOCIATION)
				}
			}
		}
		
		override caseMultiAssociation(MultiAssociation multiAssociation) {
			if (reference == ClsPackage.Literals.UML_TYPE_REFERENCE__TYPE) {
				return UMLPackage.Literals.CLASSIFIER.filterScope.filterScopeIgnoreType(UMLPackage.Literals.ASSOCIATION)
			}
		}
		
		override <T extends org.eclipse.uml2.uml.NamedElement> caseNamedElementAliased(NamedElementAliased<T> namedElementAliased) {
			if (reference == ClsPackage.Literals.NAMED_ELEMENT_ALIASED__ALIAS_EXPRESSION) {
				return UMLPackage.Literals.STRING_EXPRESSION.filterScope(namedElementAliased.referencedElement)
			}
		}

		override defaultCase(EObject o) {
			return baseScope
		}
		
		private def filterScope(EClass clazz) {
			return new FilteringScope(baseScope, [EcoreUtil2.isAssignableFrom(clazz, EObjectOrProxy.eClass)])
		}

		private def filterScope(EClass clazz, EObject container) {
			return clazz.filterScope(#{container});
		}
		
		private def filterScope(EClass clazz, Set<EObject> container) {
			val filteredContainers = container.filter[c | c != null]
			return clazz.filterScope([d | filteredContainers.exists[c | c.equals(d.EObjectOrProxy.eContainer)]])
		}
		
		private def filterScope(EClass clazz, Predicate<IEObjectDescription> condition) {
			return clazz.filterScope.filterScope(condition)
		}
		
		private def filterScope(IScope scope, Predicate<IEObjectDescription> condition) {
			return new FilteringScope(scope, condition)
		}
		
		private def filterScopeIgnoreType(IScope scope, EClass ignoredType) {
			return scope.filterScope[d | !EcoreUtil2.isAssignableFrom(ignoredType, d.EObjectOrProxy.eClass)];
		}
	}

}
