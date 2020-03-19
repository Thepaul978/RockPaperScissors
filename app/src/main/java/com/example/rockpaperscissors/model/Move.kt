package com.example.rockpaperscissors.model

import com.example.rockpaperscissors.R

enum class Move(var image: Int) {
    rock(R.drawable.rock), paper(R.drawable.paper), scissors(R.drawable.scissors)
}