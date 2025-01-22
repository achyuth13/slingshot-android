//package com.caramel.slingshot.db
//
//import androidx.room.Dao
//import androidx.room.Delete
//import androidx.room.Insert
//import androidx.room.Query
//import androidx.room.Update
//import com.caramel.slingshot.model.Player
//
//@Dao
//interface PlayerDao {
//
//    @Insert
//    suspend fun insertPlayer(player: Player)
//
//    @Query("SELECT * FROM players")
//    suspend fun getAllPlayers(): List<Player>
//
//    @Delete
//    suspend fun deletePlayer(player: Player)
//
//    @Update
//    suspend fun updatePlayer(player: Player)
//}
