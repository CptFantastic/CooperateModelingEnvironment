/*
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.component

import com.google.inject.Binder
import com.google.inject.name.Names
import de.cooperateproject.modeling.textual.common.naming.CommonQualifiedNameProvider
import de.cooperateproject.modeling.textual.common.scoping.CooperateImportedNamespaceAwareLocalScopeProvider
import de.cooperateproject.modeling.textual.common.services.BasicCooperateTransientValueService
import de.cooperateproject.modeling.textual.component.services.ComponentDerivedStateComputerSorter
import de.cooperateproject.modeling.textual.component.services.ComponentValueConverter
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateModuleMixin
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateComputerSorter
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.InitializingStateAwareResource
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateGlobalScopeProvider
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider
import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.TransientStatusProviderModuleMixin
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.serializer.sequencer.ITransientValueService

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ComponentRuntimeModule extends AbstractComponentRuntimeModule implements DerivedStateModuleMixin, TransientStatusProviderModuleMixin {
	
	override bindITransientValueService() {
		 BasicCooperateTransientValueService
	}
	
	def configureITransientValueService(Binder binder) {
		binder.bind(ITransientValueService).to(BasicCooperateTransientValueService)
	}
	
    override configureIScopeProviderDelegate(Binder binder) {
        binder.bind(IScopeProvider)
                .annotatedWith(Names
                        .named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
                .to(CooperateImportedNamespaceAwareLocalScopeProvider);
    }
    
    override Class<? extends XtextResource> bindXtextResource() {
		return InitializingStateAwareResource;
	}
	
	def Class<? extends IGlobalScopeTypeQueryProvider> bindIGlobalScopeTypeQueryProvider() {
		return CooperateGlobalScopeProvider
	}
	
	override bindIValueConverterService() {
        return ComponentValueConverter;
    }
	
	def Class<? extends IDerivedStateComputerSorter> bindIDerivedStateComputerSorter() {
		return ComponentDerivedStateComputerSorter
	}
	
	override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return CommonQualifiedNameProvider;
	}
	
}
