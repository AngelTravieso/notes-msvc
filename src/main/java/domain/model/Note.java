package domain.model;

import domain.model.enums.NoteStatus;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
@RegisterForReflection
@RequiredArgsConstructor
public class Note {
    private UUID noteId;
    private UUID userId;
    private String title;
    private String content;
    private NoteStatus status;
    private Date createdAt;
}