package com.vasco.notes.repository;

import com.vasco.notes.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface INotesRepository extends MongoRepository<Note, String> {

}
