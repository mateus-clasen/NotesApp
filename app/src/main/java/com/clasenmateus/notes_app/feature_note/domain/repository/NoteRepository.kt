package com.clasenmateus.notes_app.feature_note.domain.repository

import com.clasenmateus.notes_app.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * Created by Mateus H. Clasen on 15/04/2024.
 */


interface NoteRepository {


    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)


}