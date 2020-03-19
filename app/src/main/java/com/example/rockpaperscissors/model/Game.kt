package com.example.rockpaperscissors.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "game_table")
data class Game(
    @ColumnInfo(name = "date")
    var date: Date,

    @ColumnInfo(name = "computerMove")
    var computerMove: Move,

    @ColumnInfo(name = "yourMove")
    var yourMove: Move,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
) {

    fun getResult(): GameResult {
        if ((computerMove == Move.rock && yourMove == Move.paper) ||
            (computerMove == Move.paper && yourMove == Move.scissors) ||
            (computerMove == Move.scissors && yourMove == Move.rock)
        ) {
            return GameResult.Win
        } else if ((computerMove == Move.rock && yourMove == Move.scissors) ||
            (computerMove == Move.paper && yourMove == Move.rock) ||
            (computerMove == Move.scissors && yourMove == Move.paper)
        ) {
            return GameResult.Lose
        } else {
            return GameResult.Draw
        }
    }

}