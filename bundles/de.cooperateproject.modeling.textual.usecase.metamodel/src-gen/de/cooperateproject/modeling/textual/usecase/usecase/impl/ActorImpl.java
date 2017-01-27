/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
import de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier;
import de.cooperateproject.modeling.textual.usecase.usecase.Commentable;
import de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
import de.cooperateproject.modeling.textual.usecase.usecase.Visibility;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ActorImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ActorImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ActorImpl#isAbstract <em>Abstract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends AliasedElementImpl implements Actor {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.UNDEFINED;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsecasePackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Actor getReferencedElement() {
		return (org.eclipse.uml2.uml.Actor)eDynamicGet(UsecasePackage.ACTOR__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Actor basicGetReferencedElement() {
		return (org.eclipse.uml2.uml.Actor)eDynamicGet(UsecasePackage.ACTOR__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedElement(org.eclipse.uml2.uml.Actor newReferencedElement) {
		eDynamicSet(UsecasePackage.ACTOR__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return (Visibility)eDynamicGet(UsecasePackage.ACTOR__VISIBILITY, UsecasePackage.Literals.ACTOR__VISIBILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		eDynamicSet(UsecasePackage.ACTOR__VISIBILITY, UsecasePackage.Literals.ACTOR__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return (Boolean)eDynamicGet(UsecasePackage.ACTOR__ABSTRACT, UsecasePackage.Literals.ACTOR__ABSTRACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		eDynamicSet(UsecasePackage.ACTOR__ABSTRACT, UsecasePackage.Literals.ACTOR__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsecasePackage.ACTOR__REFERENCED_ELEMENT:
				if (resolve) return getReferencedElement();
				return basicGetReferencedElement();
			case UsecasePackage.ACTOR__VISIBILITY:
				return getVisibility();
			case UsecasePackage.ACTOR__ABSTRACT:
				return isAbstract();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsecasePackage.ACTOR__REFERENCED_ELEMENT:
				setReferencedElement((org.eclipse.uml2.uml.Actor)newValue);
				return;
			case UsecasePackage.ACTOR__VISIBILITY:
				setVisibility((Visibility)newValue);
				return;
			case UsecasePackage.ACTOR__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UsecasePackage.ACTOR__REFERENCED_ELEMENT:
				setReferencedElement((org.eclipse.uml2.uml.Actor)null);
				return;
			case UsecasePackage.ACTOR__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UsecasePackage.ACTOR__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UsecasePackage.ACTOR__REFERENCED_ELEMENT:
				return basicGetReferencedElement() != null;
			case UsecasePackage.ACTOR__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case UsecasePackage.ACTOR__ABSTRACT:
				return isAbstract() != ABSTRACT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Commentable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == BehavioredClassifier.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UMLReferencingElement.class) {
			switch (derivedFeatureID) {
				case UsecasePackage.ACTOR__REFERENCED_ELEMENT: return UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Commentable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == BehavioredClassifier.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UMLReferencingElement.class) {
			switch (baseFeatureID) {
				case UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return UsecasePackage.ACTOR__REFERENCED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActorImpl