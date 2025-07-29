package domain.model.enums;

public enum NoteStatus {
    COMPLETED("COMPLETADO"),
    PENDIND("PENDING"),
    IN_PROGRESS("EN PROGRESO"),
    EXPIRED("VENCIDA");

    private String status;

    NoteStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

}

