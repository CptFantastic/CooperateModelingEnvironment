package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage;

public class GraphicalToTextualComponentTest extends DirectionalTransformationTestBase {

    private static final URI TRANSFORMATION_URI = createTransformationURI("Graphical_to_Textual_for_Component.qvto");

    static {
        CmpPackage.eINSTANCE.eClass();
    }

    public GraphicalToTextualComponentTest() {
        super(TRANSFORMATION_URI, "notation", "xmi");
    }

    @Test
    public void testMinimal() throws Exception {
        testRegular("ComponentMinimal");
    }

    @Test
    public void testMinimalIncremental() throws Exception {
        testIncremental("ComponentMinimal");
    }

    @Test
    public void testSingleComponent() throws Exception {
        testRegular("ComponentDiagramSingleComponent");
    }

    @Test
    public void testSingleInterface() throws Exception {
        testRegular("ComponentDiagramSingleInterface");
    }

    @Test
    public void testInnerClassifiers() throws Exception {
        testRegular("ComponentDiagramInnerClassifiers");
    }

    @Test
    public void testInterfaceAttribute() throws Exception {
        testRegular("ComponentDiagramInterfaceAttribute");
    }

    @Test
    public void testInterfaceMembers() throws Exception {
        setDebugSerializationDir(new File("D:\\Debug\\G2T_Normal"));
        testRegular("ComponentDiagramInterfaceMembers");
    }
}
