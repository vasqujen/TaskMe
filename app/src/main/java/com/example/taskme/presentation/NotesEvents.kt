package com.example.taskme.presentation

import com.example.taskme.data.Note

sealed interface NotesEvent {
    object SortNotes: NotesEvent

    data class DeleteNote(val note: Note):NotesEvent

    data class SaveNote(
        val title: String,
        val description: String
    ): NotesEvent
}