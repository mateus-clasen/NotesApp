package com.clasenmateus.notes_app.feature_note.domain.use_case

/**
 * Created by Mateus H. Clasen on 16/04/2024.
 */
data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote
)
