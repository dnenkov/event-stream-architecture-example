package com.avcora.esae.note.controller;

import com.avcora.esae.note.model.Note;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController("/notes")
public class NotesController {

    @RequestMapping
    public ResponseEntity<List<Note>> getAll() {
        return ResponseEntity.ok(
                Collections.singletonList(
                        new Note(
                                "not-12345678-90ab-cdef-1234-567890abcdef",
                                "This is the note text",
                                Collections.singletonList("lab-12345678-90ab-cdef-1234-567890abcdef"))));
    }

}
