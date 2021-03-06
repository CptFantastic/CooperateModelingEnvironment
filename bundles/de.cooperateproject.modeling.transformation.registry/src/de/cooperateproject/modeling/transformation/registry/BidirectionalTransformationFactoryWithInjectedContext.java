package de.cooperateproject.modeling.transformation.registry;

import de.cooperateproject.modeling.graphical.common.conventions.NotationDiagramTypes;
import de.cooperateproject.modeling.transformation.common.ITransformationContext;
import de.cooperateproject.modeling.transformation.common.ITransformationContextProvider;
import de.cooperateproject.modeling.transformation.common.impl.BidirectionalTransformationFactoryBase;

public class BidirectionalTransformationFactoryWithInjectedContext extends BidirectionalTransformationFactoryBase
        implements InjectTransformationContext {
    private static class InjectedTransformationContextProvider
            implements ITransformationContextProvider, InjectTransformationContext {
        private ITransformationContext currentContext;

        @Override
        public void setTransformationContext(ITransformationContext context) {
            this.currentContext = context;
        }

        @Override
        public ITransformationContext getTransformationContext() {
            return currentContext;
        }

    }

    public BidirectionalTransformationFactoryWithInjectedContext(NotationDiagramTypes diagramType,
            String graphicalFileExtension, String textualFileExtension) {
        super(diagramType, graphicalFileExtension, textualFileExtension, new InjectedTransformationContextProvider());
    }

    @Override
    public void setTransformationContext(ITransformationContext context) {
        ((InjectTransformationContext) this.transformationContextProvider).setTransformationContext(context);
    }

}
