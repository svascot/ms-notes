package com.vasco.notes.controller;

import com.vasco.notes.domain.interfaces.INoteService;
import com.vasco.notes.model.Note;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handle the methods that call the Notes domain.
 *
 * @author santiago.vasco
 */
@RestController
@RequestMapping(NotesController.API_PATH)
public class NotesController extends AbstractController<INoteService> {

  public static final String API_PATH = "/notes";

  /**
   * Call the method that return a list of Note objects.
   * @return list with notes.
   */
  @GetMapping
  public ResponseEntity getAll(){
    try {
      return ResponseEntity.ok(service.getAll());
    } catch (Exception e){
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }

  /**
   * Call the method that create a new Note object.
   * @param note object with note data.
   * @return a note created.
   */
  @PostMapping
  public ResponseEntity create(@RequestBody Note note){
    try {
      return ResponseEntity.ok(service.create(note));
    } catch (Exception e){
      return ResponseEntity.badRequest().body(e.getMessage());

    }
  }

  /**
   * Call the method that update an existing note.
   * @param note object with the new data.
   * @return a note updated.
   */
  @PutMapping
  public ResponseEntity update(@RequestBody Note note){
    try {
      return ResponseEntity.ok(service.update(note));
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }

  /**
   * Call the method that deletes an exiting note.
   * @param id the id of the note that will be deleted.
   * @return the Id deleted.
   */
  @DeleteMapping("{id}")
  public ResponseEntity delete(@PathVariable String id){
    try {
      return ResponseEntity.ok(service.delete(id));
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
}
