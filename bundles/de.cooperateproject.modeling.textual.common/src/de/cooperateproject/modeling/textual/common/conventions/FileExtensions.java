package de.cooperateproject.modeling.textual.common.conventions;

import java.util.Arrays;
import java.util.Optional;

import de.cooperateproject.modeling.common.types.DiagramTypes;

public enum FileExtensions {

    CLASS(DiagramTypes.CLASS, "cls"),
    USECASE(DiagramTypes.USECASE, "uc"),
    ACTIVITY(DiagramTypes.ACTIVITY, "act"),
    SEQUENCE(DiagramTypes.SEQUENCE, "seq"),
    COMPONENT(DiagramTypes.COMPONENT, "cmp"),
    STATE(DiagramTypes.STATE, "stm");

    private final DiagramTypes diagramType;
    private final String fileExtension;

    private FileExtensions(DiagramTypes diagramType, String fileExtension) {
        this.diagramType = diagramType;
        this.fileExtension = fileExtension;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public DiagramTypes getDiagramType() {
        return diagramType;
    }

    public static Optional<FileExtensions> getByDiagramType(DiagramTypes diagramType) {
        return Arrays.stream(values()).filter(x -> x.getDiagramType() == diagramType).findFirst();
    }

    public static Optional<FileExtensions> getByFileExtension(String fileExtension) {
        return Arrays.stream(values()).filter(x -> x.getFileExtension().equals(fileExtension)).findFirst();
    }

}
