package de.cooperateproject.modeling.transformation.common.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.cooperateproject.modeling.common.types.ConcreteSyntaxTypes;
import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.modeling.transformation.common.ITransformationContext;
import de.cooperateproject.modeling.transformation.common.TransformationCharacteristic;

public class TextToGraphicsTransformation extends TransformationBase {

    public TextToGraphicsTransformation(DiagramTypes diagramType, String fileExtension,
            ITransformationContext transformationContext, ResourceSet rs, URI source, URI target) {
        this(diagramType, fileExtension, transformationContext, rs, source, target, Collections.emptySet());
    }

    public TextToGraphicsTransformation(DiagramTypes diagramType, String fileExtension,
            ITransformationContext transformationContext, ResourceSet rs, URI source,
            SortedSet<URI> supplementarySourceURIs, URI target, SortedSet<URI> supplementaryTargetURIs) {
        this(diagramType, fileExtension, transformationContext, rs, source, supplementarySourceURIs, target,
                supplementaryTargetURIs, Collections.emptySet());
    }

    public TextToGraphicsTransformation(DiagramTypes diagramType, String fileExtension,
            ITransformationContext transformationContext, ResourceSet rs, URI source, URI target,
            Collection<PostProcessor> postProcessors) {
        this(diagramType, fileExtension, transformationContext, rs, source, Collections.emptySortedSet(), target,
                Collections.emptySortedSet(), postProcessors);
    }

    public TextToGraphicsTransformation(DiagramTypes diagramType, String fileExtension,
            ITransformationContext transformationContext, ResourceSet rs, URI source,
            SortedSet<URI> supplementarySourceURIs, URI target, SortedSet<URI> supplementaryTargetURIs,
            Collection<PostProcessor> postProcessors) {
        super(createCharacteristics(diagramType), rs, transformationContext, source, supplementarySourceURIs, target,
                supplementaryTargetURIs, postProcessors);
    }

    @Override
    protected URI getGraphicalModelURI(URI from, URI to) {
        return to;
    }

    private static TransformationCharacteristic createCharacteristics(DiagramTypes diagramType) {
        return new TransformationCharacteristic(diagramType, ConcreteSyntaxTypes.TEXTUAL,
                ConcreteSyntaxTypes.GRAPHICAL);
    }
}
