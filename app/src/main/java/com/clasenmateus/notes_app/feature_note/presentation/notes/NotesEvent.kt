package com.clasenmateus.notes_app.feature_note.presentation.notes

import com.clasenmateus.notes_app.feature_note.domain.model.Note
import com.clasenmateus.notes_app.feature_note.domain.util.NoteOrder

/**
 * Created by Mateus H. Clasen on 17/04/2024.
 */
sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}