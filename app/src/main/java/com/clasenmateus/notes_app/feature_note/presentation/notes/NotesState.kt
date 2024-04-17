package com.clasenmateus.notes_app.feature_note.presentation.notes

import com.clasenmateus.notes_app.feature_note.domain.model.Note
import com.clasenmateus.notes_app.feature_note.domain.util.NoteOrder
import com.clasenmateus.notes_app.feature_note.domain.util.OrderType

/**
 * Created by Mateus H. Clasen on 17/04/2024.
 */
data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
