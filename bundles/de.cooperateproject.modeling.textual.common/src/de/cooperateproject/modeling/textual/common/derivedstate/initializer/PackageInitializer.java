package de.cooperateproject.modeling.textual.common.derivedstate.initializer;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Model;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * Initializer for root packages.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.INITIALIZATION)
public class PackageInitializer extends AtomicDerivedStateProcessorBase<PackageBase<PackageBase<?>>> {

    public PackageInitializer() {
        super((Class<PackageBase<PackageBase<?>>>) (Class<?>) PackageBase.class);
    }

    @Override
    protected void applyTyped(PackageBase<PackageBase<?>> object) {
        handle(object);
    }

    @Override
    public Collection<Class<? extends EObject>> getRequirements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

    private static void handle(NamedElement object) {
        Optional.of(object).filter(UMLReferencingElement.class::isInstance).map(UMLReferencingElement.class::cast)
                .map(UMLReferencingElement::getReferencedElement).filter(Model.class::isInstance)
                .filter(o -> o.eContainer() == null).ifPresent(o -> object.unsetName());
    }

}
