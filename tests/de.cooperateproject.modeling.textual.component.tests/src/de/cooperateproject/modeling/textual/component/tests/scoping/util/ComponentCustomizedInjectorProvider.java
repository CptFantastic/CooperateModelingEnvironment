package de.cooperateproject.modeling.textual.component.tests.scoping.util;

import de.cooperateproject.modeling.textual.component.ComponentRuntimeModule;
import de.cooperateproject.modeling.textual.component.tests.ComponentInjectorProvider;

public class ComponentCustomizedInjectorProvider extends ComponentInjectorProvider {

    public static class DefaultProvider extends ComponentCustomizedInjectorProvider {

        public DefaultProvider() {
            super(ComponentCustomizedRuntimeModule.class);
        }

    }

    private final ComponentRuntimeModule module;

    public ComponentCustomizedInjectorProvider(ComponentRuntimeModule module) {
        this.module = module;
    }

    public ComponentCustomizedInjectorProvider(Class<? extends ComponentRuntimeModule> moduleClass) {
        try {
            this.module = moduleClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected ComponentRuntimeModule createRuntimeModule() {
        return module;
    }

}
