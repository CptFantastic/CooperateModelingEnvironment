/*
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.cls.ui.internal;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import de.cooperateproject.modeling.textual.cls.ClsRuntimeModule;
import de.cooperateproject.modeling.textual.cls.ui.ClsUiModule;
import java.util.Collections;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ClsActivator extends AbstractUIPlugin {

	public static final String DE_COOPERATEPROJECT_MODELING_TEXTUAL_CLS_CLS = "de.cooperateproject.modeling.textual.cls.Cls";
	
	private static final Logger logger = LoggerFactory.getLogger(ClsActivator.class);
	
	private static ClsActivator INSTANCE;
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.clear();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static ClsActivator getInstance() {
		return INSTANCE;
	}
	
	public Injector getInjector(String language) {
		synchronized (injectors) {
			Injector injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = createInjector(language));
			}
			return injector;
		}
	}
	
	protected Injector createInjector(String language) {
		try {
			Module runtimeModule = getRuntimeModule(language);
			Module sharedStateModule = getSharedStateModule();
			Module uiModule = getUiModule(language);
			Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			logger.error("Failed to create injector for " + language);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}
	
	protected Module getRuntimeModule(String grammar) {
		if (DE_COOPERATEPROJECT_MODELING_TEXTUAL_CLS_CLS.equals(grammar)) {
			return new ClsRuntimeModule();
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getUiModule(String grammar) {
		if (DE_COOPERATEPROJECT_MODELING_TEXTUAL_CLS_CLS.equals(grammar)) {
			return new ClsUiModule(this);
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
}
