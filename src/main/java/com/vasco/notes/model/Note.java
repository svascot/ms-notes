package com.vasco.notes.model;

import com.vasco.notes.model.interfaces.IDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Note implements IDTO {

  @Id
  String id;
  String title;
  String text;
  String color;

}
