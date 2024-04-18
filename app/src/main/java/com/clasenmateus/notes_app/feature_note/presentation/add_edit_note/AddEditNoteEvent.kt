package com.clasenmateus.notes_app.feature_note.presentation.add_edit_note

import androidx.compose.ui.focus.FocusState

/**
 * Created by Mateus H. Clasen on 18/04/2024.
 */
sealed class AddEditNoteEvent{
    data class EnteredTitle(val value: String): AddEditNoteEvent()
    data class ChangeTitleFocus(val focusState: FocusState): AddEditNoteEvent()
    data class EnteredContent(val value: String): AddEditNoteEvent()
    data class ChangeContentFocus(val focusState: FocusState): AddEditNoteEvent()
    data class ChangeColor(val color: Int): AddEditNoteEvent()
    object SaveNote: AddEditNoteEvent()
}