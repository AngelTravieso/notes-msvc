package infrastructure.adapter.output.persistence;

import domain.model.Note;
import domain.port.output.NoteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

@Slf4j
@ApplicationScoped
public class NotesJpaRepository implements NoteRepository {

    private final EntityManager entityManger;

    @Inject
    public NotesJpaRepository(EntityManager entityManger) {
        this.entityManger = entityManger;
    }

    @Override
    public Note create(String content) {


        return null;
    }

    @Override
    public List<Note> getAll() {
        return List.of();
    }

    @Override
    public Optional<Note> getById(String id) {
        return Optional.empty();
    }

    @Override
    public void update(String id, String content) {

    }

    @Override
    public void deleteById(String id) {

    }
}
