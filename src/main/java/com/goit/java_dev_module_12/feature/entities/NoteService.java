package com.goit.java_dev_module_12.feature.entities;

import com.goit.java_dev_module_12.feature.repositories.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class NoteService implements NoteRepository {
    private Map<Long, Note> noteList = new LinkedHashMap<>();

    @Override
    public List<Note> listAll() {
        return noteList.values().stream().toList();
    }

    @Override
    public Note add(Note note) {
        note.setId(note.hashCode());
        noteList.put(note.getId(), note);
        return note;
    }

    @Override
    public void deleteById(long id) {
        noteList.remove(id);
    }

    @Override
    public void update(Note note) {
        noteList.put(note.getId(), note);
    }

    @Override
    public Note getById(long id) {
        return noteList.get(id);
    }
}
