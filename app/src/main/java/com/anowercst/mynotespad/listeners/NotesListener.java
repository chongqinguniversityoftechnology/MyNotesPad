package com.anowercst.mynotespad.listeners;

import com.anowercst.mynotespad.entities.Note;

public interface NotesListener {
    void onNoteCLicked(Note note, int position);
}
