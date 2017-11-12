package com.avcora.esae.note.model;

import java.util.List;

public class Note {

    private String id;
    private String text;
    private List<String> labelIds;

    public Note(String id, String text, List<String> labelIds) {
        this.id = id;
        this.text = text;
        this.labelIds = labelIds;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public List<String> getLabelIds() {
        return labelIds;
    }
}
