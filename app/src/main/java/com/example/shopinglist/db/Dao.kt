package com.example.shopinglist.db

import androidx.room.*
import androidx.room.Dao
import com.example.shopinglist.entities.NoteItem
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Query("SELECT * FROM note_list")
    fun getAllNotes(): Flow<List<NoteItem>>
    @Query("DELETE FROM note_list WHERE id IS :id")
    suspend fun deleteNote(id: Int)
    @Insert
    suspend fun insertNote(note: NoteItem)
    @Update
    suspend fun updateNote(note: NoteItem)

}