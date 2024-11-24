package com.caramel.slingshot.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Player::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun playerDao(): PlayerDao
}

//Initialisation
//val db = Room.databaseBuilder(
//    applicationContext,
//    AppDatabase::class.java, "player-database"
//).build()
//
//val playerDao = db.playerDao()

