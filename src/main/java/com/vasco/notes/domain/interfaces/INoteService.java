package com.vasco.notes.domain.interfaces;

import com.vasco.notes.model.Note;
import java.util.List;

public interface INoteService extends IService {

  /**
   * Get all notes.
   * @return list of notes.
   */
  List<Note> getAll();

  /**
   * Create a new note.
   * @param note object with the noted data
   * @return a note created.
   */
  Note create(Note note);

  /**
   *  Update an existing note;
   * @param note object with the new data
   * @return a new updated.
   */
  Note update(Note note);

  /**
   * Delete an existing note
   * @param id the id of the note
   * @return the id of deleted note.
   */
  String delete(String id);

}
