package com.goit.java_dev_module_12.feature.entities;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class NoteService {
    private Map<Long, Note> noteList = new LinkedHashMap<>();

    public List<Note> listAll() {
        return noteList.values().stream().toList();
    }

    public Note add(Note note) {
        note.setId(note.hashCode());
        noteList.put(note.getId(), note);
        return note;
    }

    public void deleteById(long id) {
        noteList.remove(id);
    }

    public void update(Note note) {
        noteList.put(note.getId(), note);
    }

    public Note getById(long id) {
        return noteList.get(id);
    }
}
