/**
 */
package de.cooperateproject.modeling.textual.component.cmp.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement;

import de.cooperateproject.modeling.textual.component.cmp.Attribute;
import de.cooperateproject.modeling.textual.component.cmp.CmpPackage;
import de.cooperateproject.modeling.textual.component.cmp.Connector;
import de.cooperateproject.modeling.textual.component.cmp.InterfaceProvidingRequiringEntity;
import de.cooperateproject.modeling.textual.component.cmp.InterfaceRelation;
import de.cooperateproject.modeling.textual.component.cmp.Port;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.ComponentImpl#getInterfaceRelation <em>Interface Relation</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.ComponentImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.ComponentImpl#getPort <em>Port</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.ComponentImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.ComponentImpl#getPackagedElements <em>Packaged Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ClassifierImpl<Component> implements de.cooperateproject.modeling.textual.component.cmp.Component {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComponentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CmpPackage.Literals.COMPONENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<InterfaceRelation> getInterfaceRelation() {
        return (EList<InterfaceRelation>)eDynamicGet(CmpPackage.COMPONENT__INTERFACE_RELATION, CmpPackage.Literals.INTERFACE_PROVIDING_REQUIRING_ENTITY__INTERFACE_RELATION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Attribute> getAttributes() {
        return (EList<Attribute>)eDynamicGet(CmpPackage.COMPONENT__ATTRIBUTES, CmpPackage.Literals.COMPONENT__ATTRIBUTES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Port> getPort() {
        return (EList<Port>)eDynamicGet(CmpPackage.COMPONENT__PORT, CmpPackage.Literals.COMPONENT__PORT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Connector> getConnectors() {
        return (EList<Connector>)eDynamicGet(CmpPackage.COMPONENT__CONNECTORS, CmpPackage.Literals.COMPONENT__CONNECTORS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<PackageableElement> getPackagedElements() {
        return (EList<PackageableElement>)eDynamicGet(CmpPackage.COMPONENT__PACKAGED_ELEMENTS, CmpPackage.Literals.COMPONENT__PACKAGED_ELEMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CmpPackage.COMPONENT__INTERFACE_RELATION:
                return ((InternalEList<?>)getInterfaceRelation()).basicRemove(otherEnd, msgs);
            case CmpPackage.COMPONENT__ATTRIBUTES:
                return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
            case CmpPackage.COMPONENT__PORT:
                return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
            case CmpPackage.COMPONENT__CONNECTORS:
                return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
            case CmpPackage.COMPONENT__PACKAGED_ELEMENTS:
                return ((InternalEList<?>)getPackagedElements()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CmpPackage.COMPONENT__INTERFACE_RELATION:
                return getInterfaceRelation();
            case CmpPackage.COMPONENT__ATTRIBUTES:
                return getAttributes();
            case CmpPackage.COMPONENT__PORT:
                return getPort();
            case CmpPackage.COMPONENT__CONNECTORS:
                return getConnectors();
            case CmpPackage.COMPONENT__PACKAGED_ELEMENTS:
                return getPackagedElements();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case CmpPackage.COMPONENT__INTERFACE_RELATION:
                getInterfaceRelation().clear();
                getInterfaceRelation().addAll((Collection<? extends InterfaceRelation>)newValue);
                return;
            case CmpPackage.COMPONENT__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends Attribute>)newValue);
                return;
            case CmpPackage.COMPONENT__PORT:
                getPort().clear();
                getPort().addAll((Collection<? extends Port>)newValue);
                return;
            case CmpPackage.COMPONENT__CONNECTORS:
                getConnectors().clear();
                getConnectors().addAll((Collection<? extends Connector>)newValue);
                return;
            case CmpPackage.COMPONENT__PACKAGED_ELEMENTS:
                getPackagedElements().clear();
                getPackagedElements().addAll((Collection<? extends PackageableElement>)newValue);
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
            case CmpPackage.COMPONENT__INTERFACE_RELATION:
                getInterfaceRelation().clear();
                return;
            case CmpPackage.COMPONENT__ATTRIBUTES:
                getAttributes().clear();
                return;
            case CmpPackage.COMPONENT__PORT:
                getPort().clear();
                return;
            case CmpPackage.COMPONENT__CONNECTORS:
                getConnectors().clear();
                return;
            case CmpPackage.COMPONENT__PACKAGED_ELEMENTS:
                getPackagedElements().clear();
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
            case CmpPackage.COMPONENT__INTERFACE_RELATION:
                return !getInterfaceRelation().isEmpty();
            case CmpPackage.COMPONENT__ATTRIBUTES:
                return !getAttributes().isEmpty();
            case CmpPackage.COMPONENT__PORT:
                return !getPort().isEmpty();
            case CmpPackage.COMPONENT__CONNECTORS:
                return !getConnectors().isEmpty();
            case CmpPackage.COMPONENT__PACKAGED_ELEMENTS:
                return !getPackagedElements().isEmpty();
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
        if (baseClass == InterfaceProvidingRequiringEntity.class) {
            switch (derivedFeatureID) {
                case CmpPackage.COMPONENT__INTERFACE_RELATION: return CmpPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__INTERFACE_RELATION;
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
        if (baseClass == InterfaceProvidingRequiringEntity.class) {
            switch (baseFeatureID) {
                case CmpPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__INTERFACE_RELATION: return CmpPackage.COMPONENT__INTERFACE_RELATION;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ComponentImpl
