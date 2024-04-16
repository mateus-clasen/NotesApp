package com.clasenmateus.notes_app.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.clasenmateus.notes_app.feature_note.domain.model.Note

/**
 * Created by Mateus H. Clasen on 15/04/2024.
 */
@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao
}