package de.cooperateproject.modeling.textual.component.tests.formatter

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.component.tests.scoping.util.ComponentCustomizedInjectorProvider
import java.io.File
import org.apache.commons.io.FileUtils
import org.apache.commons.io.IOUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.serializer.ISerializer
import org.junit.Test

import static org.junit.Assert.*
import de.cooperateproject.modeling.textual.component.tests.AbstractComponentTest


@InjectWith(ComponentCustomizedInjectorProvider.DefaultProvider)
class FormatterTest extends AbstractComponentTest {

	static val TEST_FOLDER = "testmodels/formatting/"

	@Inject extension ISerializer

	@Test
	def testMinimalModel() {
		"minimal.cmp".test
	}
	
	@Test
	def testExtendedModel() {
		"extended.cmp".test
	}
	
	@Test
	def testMinimalClassifiers() {
		"minimal_classifiers.cmp".test
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

