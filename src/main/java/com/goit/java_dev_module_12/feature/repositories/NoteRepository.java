package com.goit.java_dev_module_12.feature.repositories;

import com.goit.java_dev_module_12.feature.entities.Note;

import java.util.List;

public interface NoteRepository {
    List<Note> listAll();
    Note add(Note note);
    void deleteById(long id);
    void update(Note note);
    Note getById(long id);
}
