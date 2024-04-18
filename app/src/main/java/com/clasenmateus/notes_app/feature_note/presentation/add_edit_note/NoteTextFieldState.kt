package com.clasenmateus.notes_app.feature_note.presentation.add_edit_note

/**
 * Created by Mateus H. Clasen on 18/04/2024.
 */
data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
