package de.cooperateproject.modeling.graphical.common.conventions;

import java.util.Arrays;
import java.util.Optional;

import de.cooperateproject.modeling.common.types.DiagramTypes;

public enum NotationDiagramTypes {

    CLASS(DiagramTypes.CLASS, "PapyrusUMLClassDiagram", "org.eclipse.papyrus.uml.diagram.class"),
    USECASE(DiagramTypes.USECASE, "UseCase", "org.eclipse.papyrus.uml.diagram.usecase"),
    ACTIVITY(DiagramTypes.ACTIVITY, "PapyrusUMLActivityDiagram", "org.eclipse.papyrus.uml.diagram.activity"),
    SEQUENCE(DiagramTypes.SEQUENCE, "PapyrusUMLSequenceDiagram", "org.eclipse.papyrus.uml.diagram.sequence"),
    STATE(DiagramTypes.STATE, "PapyrusUMLStateMachineDiagram", "org.eclipse.papyrus.uml.diagram.state");

    private final DiagramTypes diagramType;
    private final String notationDiagramType;
    private final String papyrusDiagramKindId;

    private NotationDiagramTypes(DiagramTypes diagramType, String notationDiagramType, String diagramKindId) {
        this.diagramType = diagramType;
        this.notationDiagramType = notationDiagramType;
        this.papyrusDiagramKindId = diagramKindId;
    }

    public DiagramTypes getDiagramType() {
        return diagramType;
    }

    public String getNotationDiagramType() {
        return notationDiagramType;
    }

    public String getPapyrusDiagramKindId() {
        return papyrusDiagramKindId;
    }

    public static Optional<NotationDiagramTypes> getByDiagramType(DiagramTypes diagramType) {
        return Arrays.stream(values()).filter(x -> x.getDiagramType() == diagramType).findFirst();
    }

    public static Optional<NotationDiagramTypes> getByNotationDiagramType(String notationDiagramType) {
        return Arrays.stream(values()).filter(x -> x.getNotationDiagramType().equals(notationDiagramType)).findFirst();
    }

    public static Optional<NotationDiagramTypes> getByPapyrusDiagramKindId(String diagramKindId) {
        return Arrays.stream(values()).filter(x -> x.getPapyrusDiagramKindId().equals(diagramKindId)).findFirst();
    }
}
