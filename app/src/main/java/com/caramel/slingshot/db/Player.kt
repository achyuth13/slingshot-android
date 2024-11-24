package com.caramel.slingshot.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "players")
data class Player(
    @PrimaryKey val id: Int,
    val name: String,
    val icon: String
)
