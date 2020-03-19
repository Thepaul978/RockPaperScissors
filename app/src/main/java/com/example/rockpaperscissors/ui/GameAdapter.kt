package com.example.rockpaperscissors.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rockpaperscissors.R
import com.example.rockpaperscissors.model.Game
import kotlinx.android.synthetic.main.item_game.view.*

class GameAdapter (private val games: List<Game>)
    : RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_game, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return games.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(games[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(game: Game) {
            itemView.result.text = game.getResult().result
            itemView.gameDate.text = game.date.toString()
            itemView.ivComputer.setImageDrawable(context.getDrawable(game.computerMove.image))
            itemView.ivYou.setImageDrawable(context.getDrawable(game.yourMove.image))
        }
    }

}