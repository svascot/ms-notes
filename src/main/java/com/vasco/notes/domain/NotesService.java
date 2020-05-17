package com.vasco.notes.domain;

import com.mongodb.MongoException;
import com.vasco.notes.domain.interfaces.INoteService;
import com.vasco.notes.model.Note;
import com.vasco.notes.repository.INotesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotesService implements INoteService {

  @Autowired
  private INotesRepository repository;

  @Override
  public List<Note> getAll() {
    return repository.findAll();
  }

  @Override
  public Note create(Note note) {
    return repository.insert(note);
  }

  @Override
  public Note update(Note note) {
    return repository.save(note);
  }

  @Override
  public String delete(String id) {
    try {
      repository.deleteById(id);
      return "{\"success\":\""+id+"\"}";  //TODO Fix this
    } catch (Exception e) {
      throw new MongoException("Couldn't delete the note with id: " + id);
    }
  }
}
