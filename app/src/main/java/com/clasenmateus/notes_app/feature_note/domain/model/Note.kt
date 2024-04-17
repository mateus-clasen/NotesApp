package com.clasenmateus.notes_app.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.clasenmateus.notes_app.ui.theme.BabyBlue
import com.clasenmateus.notes_app.ui.theme.LightGreen
import com.clasenmateus.notes_app.ui.theme.RedOrange
import com.clasenmateus.notes_app.ui.theme.RedPink
import com.clasenmateus.notes_app.ui.theme.Violet

/**
 * Created by Mateus H. Clasen on 15/04/2024.
 */
@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)