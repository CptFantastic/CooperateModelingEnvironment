/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls.formatting2;

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.cls.cls.Attribute
import de.cooperateproject.modeling.textual.cls.cls.Class
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram
import de.cooperateproject.modeling.textual.cls.cls.Classifier
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.Connector
import de.cooperateproject.modeling.textual.cls.cls.Generalization
import de.cooperateproject.modeling.textual.cls.cls.Implementation
import de.cooperateproject.modeling.textual.cls.cls.Interface
import de.cooperateproject.modeling.textual.cls.cls.Member
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.cls.cls.Package
import de.cooperateproject.modeling.textual.cls.cls.Parameter
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation
import de.cooperateproject.modeling.textual.cls.services.ClsGrammarAccess
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.formatting2.AbstractFormatter2

class ClsFormatter extends AbstractFormatter2 {
	
	@Inject extension ClsGrammarAccess

	def dispatch void format(ClassDiagram classdiagram, extension IFormattableDocument document) {
		classdiagram.regionFor.feature(ClsPackage.Literals.CLASS_DIAGRAM__TITLE).append[newLines = 2]
		format(classdiagram.getRootPackage(), document);
		classdiagram.regionFor.keyword(classDiagramAccess.endClsdKeyword_4).prepend[newLines = 2]
	}

	def dispatch void format(Package pkg, extension IFormattableDocument document) {		
		interior(			
			pkg.regionFor.keyword(packageAccess.leftCurlyBracketKeyword_2).append[newLine],
			pkg.regionFor.keyword(packageAccess.rightCurlyBracketKeyword_7).append[newLines = 2].prepend[newLines = 1 priority = 4],
			[indent]
		)
		pkg.regionFor.assignment(rootPackageAccess.nameAssignment_1).append[newLines = 2]
			
		for (PackageImport packageImports : pkg.getPackageImports()) {
			format(packageImports, document);
		}
		pkg.packageImports.last?.append[newLines = 2; priority = 3]

		for (Classifier<?> classifiers : pkg.getClassifiers()) {
			format(classifiers, document);
		}
		pkg.classifiers.last?.append[newLines = 2; priority = 3]
		
		for (Connector connectors : pkg.getConnectors()) {
			format(connectors, document);
		}
		pkg.connectors.last?.append[newLines = 2; priority = 3]
		
		for (Package packages : pkg.getPackages()) {
			format(packages, document);
		}
	}
	
	def dispatch void format(PackageImport pkgImport, extension IFormattableDocument document) {
		pkgImport.append[newLine]
	}
	
	def dispatch void format(Class clz, extension IFormattableDocument document) {
		interior(
			clz.regionFor.keyword(classAccess.leftCurlyBracketKeyword_4_1_0).append[newLine],
			clz.regionFor.keyword(classAccess.rightCurlyBracketKeyword_4_1_3),
			[indent]
		)
		
		if (!clz.comments.empty) {
		    clz.comments.forEach[comment | comment.append[newLine]]
		}
		
		for (Member members : clz.getMembers()) {
			format(members, document);
		}

		if (clz.members.isEmpty) {
			clz.append[newLine; priority = 2]
		} else {
			clz.append[newLines = 2; priority = 2]
		}
	}

	def dispatch void format(Interface interfaze, extension IFormattableDocument document) {
		interior(
			interfaze.regionFor.keyword(interfaceAccess.leftCurlyBracketKeyword_3_1_0).append[newLine],
			interfaze.regionFor.keyword(interfaceAccess.rightCurlyBracketKeyword_3_1_3),
			[indent]
		)
		
		for (Member members : interfaze.getMembers()) {
			format(members, document);
		}

		if (interfaze.members.isEmpty) {
			interfaze.append[newLine; priority = 2]
		} else {
			interfaze.append[newLines = 2; priority = 2]
		}
		
	}

	def dispatch void format(Attribute attribute, extension IFormattableDocument document) {
		format(attribute.getType(), document);
		attribute.append[newLine]
	}

	def dispatch void format(Method method, extension IFormattableDocument document) {
		for (Parameter parameters : method.getParameters()) {
			format(parameters, document);
		}
		format(method.getType(), document);
		method.append[newLine]
	}

	def dispatch void format(Parameter parameter, extension IFormattableDocument document) {
		format(parameter.getType(), document);
	}

	def dispatch void format(Generalization generalization, extension IFormattableDocument document) {
		generalization.regionFor.keyword(generalizationAccess.leftParenthesisKeyword_1).append[noSpace]
		generalization.regionFor.keyword(generalizationAccess.rightParenthesisKeyword_5).prepend[noSpace]
		generalization.regionFor.keyword(generalizationAccess.commaKeyword_3).prepend[noSpace]
		generalization.append[newLine]
	}

	def dispatch void format(Implementation implementation, extension IFormattableDocument document) {
		implementation.regionFor.keyword(implementationAccess.leftParenthesisKeyword_1).append[noSpace]
		implementation.regionFor.keyword(implementationAccess.rightParenthesisKeyword_5).prepend[noSpace]
		implementation.regionFor.keyword(implementationAccess.commaKeyword_3).prepend[noSpace]
		implementation.append[newLine]
	}
	
	def dispatch void format(XtextAssociation association, extension IFormattableDocument document) {
		association.regionFor.keyword(xtextAssociationAccess.leftParenthesisKeyword_3).append[noSpace]
		association.regionFor.keyword(xtextAssociationAccess.commaKeyword_5_0).prepend[noSpace].append[space = " "]
		association.regionFor.keyword(xtextAssociationAccess.rightParenthesisKeyword_6).prepend[noSpace]

		association.regionFor.keyword(xtextAssociationAccess.leftSquareBracketKeyword_7_1).append[noSpace]
		association.regionFor.keyword(xtextAssociationAccess.commaKeyword_7_3_0).prepend[noSpace].append[space = " "]
		association.regionFor.keyword(xtextAssociationAccess.rightSquareBracketKeyword_7_4).prepend[noSpace]
		
		association.regionFor.keyword(xtextAssociationAccess.leftSquareBracketKeyword_8_1).append[noSpace]
		association.regionFor.keyword(xtextAssociationAccess.colonKeyword_8_3_0).prepend[space = " "].append[space = " "]
		association.regionFor.keyword(xtextAssociationAccess.rightSquareBracketKeyword_8_4).prepend[noSpace]
		association.append[newLine]
		
		association.memberEndCardinalities.forEach[format]
	}
	
	def dispatch void format(Cardinality cardinality, extension IFormattableDocument document) {
		cardinality.regionFor.keyword(cardinalityAccess.fullStopFullStopKeyword_1_0).prepend[noSpace].append[noSpace]
	}
	
}
