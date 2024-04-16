package com.clasenmateus.notes_app.feature_note.domain.util

/**
 * Created by Mateus H. Clasen on 16/04/2024.
 */
sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}