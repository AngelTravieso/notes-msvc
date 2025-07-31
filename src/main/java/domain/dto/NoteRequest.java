package domain.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@RegisterForReflection
public class NoteRequest {
    private String title;

    @NotEmpty(message = "El campo 'content' es requerido")
    private String content;
}