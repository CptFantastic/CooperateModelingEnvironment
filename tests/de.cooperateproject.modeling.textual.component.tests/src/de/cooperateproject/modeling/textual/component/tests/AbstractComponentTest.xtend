package de.cooperateproject.modeling.textual.component.tests

import org.eclipse.emf.ecore.resource.ResourceSet
import org.junit.Before
import org.junit.After
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.XtextRunner

@RunWith(XtextRunner)
public abstract class AbstractComponentTest {
	var protected ResourceSet rs;

	@Before
	def void setup() {
		rs = new ResourceSetImpl
		UMLResourcesUtil.init(rs);
	}

	@After
	def void tearDown() {
		if (rs !== null) {
			rs.resources.forEach[r|r.unload]
		}
		rs = null
	}
}
