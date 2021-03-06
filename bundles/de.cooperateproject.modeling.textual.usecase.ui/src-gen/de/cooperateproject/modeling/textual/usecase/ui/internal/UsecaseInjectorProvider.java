/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.usecase.ui.internal;

import com.google.inject.Inject;
import com.google.inject.Injector;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.IInjectorProvider;
import org.eclipse.emf.ecore.EPackage;

/**
 * Language-specific injector provider.
 */
public class UsecaseInjectorProvider implements IInjectorProvider {

    @Inject
    private Injector injector;

    @Override
    public EPackage getEPackage() {
        return UsecasePackage.eINSTANCE;
    }

    @Override
    public Injector getInjector() {
        return injector;
    }

}
