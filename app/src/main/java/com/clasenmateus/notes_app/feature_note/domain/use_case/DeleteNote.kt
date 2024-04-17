package com.clasenmateus.notes_app.feature_note.domain.use_case

import com.clasenmateus.notes_app.feature_note.domain.model.Note
import com.clasenmateus.notes_app.feature_note.domain.repository.NoteRepository

/**
 * Created by Mateus H. Clasen on 16/04/2024.
 */
class DeleteNote (
    private val repository: NoteRepository
){

    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}