package com.example.rockpaperscissors.database

import androidx.room.*
import com.example.rockpaperscissors.model.Game

@Dao
interface GameDao {
    @Query("SELECT * FROM game_table")
    suspend fun getAllGames(): List<Game>

    @Insert
    fun insertGame(game: Game)

    @Update
    fun updateGame(game: Game)

    @Delete
    suspend fun deleteGame(game: Game)

    @Query("DELETE FROM game_table")
    suspend fun deleteAllGames()
}