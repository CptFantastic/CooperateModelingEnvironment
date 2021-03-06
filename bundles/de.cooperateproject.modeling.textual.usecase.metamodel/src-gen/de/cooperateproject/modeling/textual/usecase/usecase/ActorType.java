/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Actor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage#getActorType()
 * @model
 * @generated
 */
public enum ActorType implements Enumerator {
    /**
     * The '<em><b>UNDEFINED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNDEFINED_VALUE
     * @generated
     * @ordered
     */
    UNDEFINED(0, "UNDEFINED", "UNDEFINED"),

    /**
     * The '<em><b>HUMAN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HUMAN_VALUE
     * @generated
     * @ordered
     */
    HUMAN(1, "HUMAN", "HUMAN"),

    /**
     * The '<em><b>MACHINE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MACHINE_VALUE
     * @generated
     * @ordered
     */
    MACHINE(2, "MACHINE", "MACHINE");

    /**
     * The '<em><b>UNDEFINED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UNDEFINED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNDEFINED
     * @model
     * @generated
     * @ordered
     */
    public static final int UNDEFINED_VALUE = 0;

    /**
     * The '<em><b>HUMAN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>HUMAN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HUMAN
     * @model
     * @generated
     * @ordered
     */
    public static final int HUMAN_VALUE = 1;

    /**
     * The '<em><b>MACHINE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MACHINE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MACHINE
     * @model
     * @generated
     * @ordered
     */
    public static final int MACHINE_VALUE = 2;

    /**
     * An array of all the '<em><b>Actor Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ActorType[] VALUES_ARRAY =
        new ActorType[] {
            UNDEFINED,
            HUMAN,
            MACHINE,
        };

    /**
     * A public read-only list of all the '<em><b>Actor Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ActorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Actor Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ActorType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ActorType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Actor Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ActorType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ActorType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Actor Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ActorType get(int value) {
        switch (value) {
            case UNDEFINED_VALUE: return UNDEFINED;
            case HUMAN_VALUE: return HUMAN;
            case MACHINE_VALUE: return MACHINE;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private ActorType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //ActorType
