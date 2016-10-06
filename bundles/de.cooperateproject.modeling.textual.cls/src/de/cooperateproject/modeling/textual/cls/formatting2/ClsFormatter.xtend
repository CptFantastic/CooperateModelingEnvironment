/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls.formatting2;

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.cls.cls.Association
import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties
import de.cooperateproject.modeling.textual.cls.cls.Attribute
import de.cooperateproject.modeling.textual.cls.cls.Class
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram
import de.cooperateproject.modeling.textual.cls.cls.Classifier
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.CommentLink
import de.cooperateproject.modeling.textual.cls.cls.Connector
import de.cooperateproject.modeling.textual.cls.cls.Generalization
import de.cooperateproject.modeling.textual.cls.cls.Implementation
import de.cooperateproject.modeling.textual.cls.cls.Interface
import de.cooperateproject.modeling.textual.cls.cls.Member
import de.cooperateproject.modeling.textual.cls.cls.MemberEnd
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.cls.cls.MultiAssociation
import de.cooperateproject.modeling.textual.cls.cls.Package
import de.cooperateproject.modeling.textual.cls.cls.PackageImport
import de.cooperateproject.modeling.textual.cls.cls.Parameter
import de.cooperateproject.modeling.textual.cls.services.ClsGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ClsFormatter extends AbstractFormatter2 {
	
	@Inject extension ClsGrammarAccess

	def dispatch void format(ClassDiagram classdiagram, extension IFormattableDocument document) {
		classdiagram.regionFor.feature(ClsPackage.Literals.CLASS_DIAGRAM__TITLE).append[newLines = 2]
		format(classdiagram.getRootPackage(), document);
		classdiagram.regionFor.keyword(classDiagramAccess.endclassKeyword_4).prepend[newLines = 2]
	}

	def dispatch void format(Package pkg, extension IFormattableDocument document) {
		interior(
			pkg.regionFor.keyword(packageAccess.leftCurlyBracketKeyword_2).append[newLine],
			pkg.regionFor.keyword(packageAccess.rightCurlyBracketKeyword_7).append[newLines = 2].prepend[newLines = 1 priority = 2],
			[indent]
		)
		pkg.regionFor.assignment(rootPackageAccess.referencedElementAssignment_1).append[newLines = 2]
			
		for (PackageImport packageImports : pkg.getPackageImports()) {
			format(packageImports, document);
		}
		pkg.packageImports.last?.append[newLines = 2; priority = 1]

		for (Classifier<?> classifiers : pkg.getClassifiers()) {
			format(classifiers, document);
		}
		pkg.classifiers.last?.append[newLines = 2; priority = 1]
		
		for (Connector connectors : pkg.getConnectors()) {
			format(connectors, document);
		}
		pkg.connectors.last?.append[newLines = 2; priority = 1]
		
		for (Package packages : pkg.getPackages()) {
			format(packages, document);
		}
	}
	
	def dispatch void format(PackageImport pkgImport, extension IFormattableDocument document) {
		pkgImport.append[newLine]
	}
	
	def dispatch void format(Class clz, extension IFormattableDocument document) {
		interior(
			clz.regionFor.keyword(classAccess.leftCurlyBracketKeyword_5_0).append[newLine],
			clz.regionFor.keyword(classAccess.rightCurlyBracketKeyword_5_2),
			[indent]
		)
		
		for (Member members : clz.getMembers()) {
			format(members, document);
		}

		if (clz.members.isEmpty) {
			clz.append[newLine]
		} else {
			clz.append[newLines = 2]
		}
	}

	def dispatch void format(Interface interfaze, extension IFormattableDocument document) {
		interior(
			interfaze.regionFor.keyword(interfaceAccess.leftCurlyBracketKeyword_4_0).append[newLine],
			interfaze.regionFor.keyword(interfaceAccess.rightCurlyBracketKeyword_4_2),
			[indent]
		)
		
		for (Member members : interfaze.getMembers()) {
			format(members, document);
		}

		if (interfaze.members.isEmpty) {
			interfaze.append[newLine]
		} else {
			interfaze.append[newLines = 2]
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
		format(generalization.getLeft(), document);
		format(generalization.getRight(), document);
		generalization.append[newLine]
	}

	def dispatch void format(Implementation implementation, extension IFormattableDocument document) {
		format(implementation.getLeft(), document);
		format(implementation.getRight(), document);
		implementation.append[newLine]
	}

	def dispatch void format(CommentLink commentlink, extension IFormattableDocument document) {
		format(commentlink.getLeft(), document);
		commentlink.append[newLine]
	}

	def dispatch void format(Association association, extension IFormattableDocument document) {
		format(association.getLeft(), document);
		format(association.getRight(), document);
		format(association.getProperties(), document);
		association.append[newLine]
	}

	def dispatch void format(MultiAssociation multiassociation, extension IFormattableDocument document) {
		interior(
			multiassociation.regionFor.keyword(multiAssociationAccess.leftCurlyBracketKeyword_2).append[newLine],
			multiassociation.regionFor.keyword(multiAssociationAccess.rightCurlyBracketKeyword_4).prepend[newLine],
			[indent]
		)
		multiassociation.allRegionsFor.keyword(multiAssociationAccess.semicolonKeyword_3_1).prepend[noSpace].append[newLine]
		for (MemberEnd connectorEnds : multiassociation.getConnectorEnds()) {
			format(connectorEnds, document);
			connectorEnds.prepend[newLine]
		}
		multiassociation.append[newLines = 2]
	}

	def dispatch void format(MemberEnd memberend, extension IFormattableDocument document) {
		format(memberend.getType(), document);
		format(memberend.getCardinality(), document);
	}

	def dispatch void format(AssociationProperties associationproperties, extension IFormattableDocument document) {
		format(associationproperties.getCardinalityLeft(), document);
		format(associationproperties.getCardinalityRight(), document);
	}

}
