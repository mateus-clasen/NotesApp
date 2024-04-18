package com.clasenmateus.notes_app.di

import android.app.Application
import androidx.room.Room
import com.clasenmateus.notes_app.feature_note.data.data_source.NoteDatabase
import com.clasenmateus.notes_app.feature_note.data.repository.NoteRepositoryImp
import com.clasenmateus.notes_app.feature_note.domain.repository.NoteRepository
import com.clasenmateus.notes_app.feature_note.domain.use_case.AddNote
import com.clasenmateus.notes_app.feature_note.domain.use_case.DeleteNote
import com.clasenmateus.notes_app.feature_note.domain.use_case.GetNote
import com.clasenmateus.notes_app.feature_note.domain.use_case.GetNotes
import com.clasenmateus.notes_app.feature_note.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Mateus H. Clasen on 16/04/2024.
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase{
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository{
        return NoteRepositoryImp(db.noteDao)
    }

    @Provides
    @Singleton
    fun providesNoteUseCases(repository: NoteRepository): NoteUseCases{
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote( repository),
            getNote = GetNote(repository)
        )
    }
}