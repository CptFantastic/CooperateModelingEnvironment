package de.cooperateproject.modeling.textual.cls.tests.formatter

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.cls.tests.scoping.util.ClsCustomizedInjectorProvider
import java.io.File
import org.apache.commons.io.FileUtils
import org.apache.commons.io.IOUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.serializer.ISerializer
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(ClsCustomizedInjectorProvider.DefaultProvider)
class FormatterTest {

	static val TEST_FOLDER = "testmodels/formatting/"

	@Inject extension ISerializer
	var ResourceSet rs;

	@Before
	def void setup() {
		rs = new ResourceSetImpl
		UMLResourcesUtil.init(rs);
	}

	@After
	def void tearDown() {
		if (rs != null) {
			rs.resources.forEach[r|r.unload]
		}
		rs = null
	}

	@Test
	def testMinimalModel() {
		"minimal.cls".test
	}
	
	@Test
	def testClasses() {
		"classifiers.cls".test
	}
	
	@Test
	def testConnectors() {
		"connectors.cls".test
	}
	
	@Test
	def testPackages() {
		"packages.cls".test
	}
	
	private def test(String modelName) {
		val path = modelName.getRelativePath
		val expected = path.readText
		val actual = path.readModel.serialize(SaveOptions.newBuilder.format.options)
		assertEqualsNormalized(expected, actual)
	}	

	private def readModel(String path) {
		val r = rs.createResource(URI.createURI(path))
		val is = IOUtils.toInputStream(path.readText.uglify)
		try {
			r.load(is, SaveOptions.newBuilder.options.toOptionsMap);
			return r.contents.get(0)			
		} finally {
			IOUtils.closeQuietly(is);
		}
	}

	private static def getRelativePath(String modelName) {
		return TEST_FOLDER + modelName
	}

	private static def assertEqualsNormalized(String expected, String actual) {
		val normalizedActual = actual.normalize
		val normalizedExpected = expected.normalize
		assertEquals(normalizedExpected, normalizedActual)
	}

	private static def normalize(String text) {
		return text.replaceAll("\\r\\n", "\n").replaceAll("\\n", String.format("%n"))
	}

	private static def readText(String path) {
		return FileUtils.readFileToString(new File(path));
	}

	private static def uglify(String text) {
		return text.replaceAll("\\s+", " ")
	}
}
