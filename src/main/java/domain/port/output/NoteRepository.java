package domain.port.output;

import domain.model.Note;

import java.util.List;
import java.util.Optional;

public interface NoteRepository {
    Note create(String content);
    List<Note> getAll();
    Optional<Note> getById(String id);
    void update(String id, String content);
    void deleteById(String id);
}
