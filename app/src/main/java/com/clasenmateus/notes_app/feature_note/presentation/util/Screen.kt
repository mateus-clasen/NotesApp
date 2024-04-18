package com.clasenmateus.notes_app.feature_note.presentation.util

/**
 * Created by Mateus H. Clasen on 18/04/2024.
 */
sealed class Screen(val route: String) {
    object NotesScreen : Screen("notes_screen")
    object AddEditNoteScreen : Screen("add_edit_note_screen")

}