package com.caramel.slingshot.repo


import com.caramel.slingshot.db.PlayerDao
import com.caramel.slingshot.model.Player
import com.caramel.slingshot.network.DemoApi

class SlingshotDBRepo(private val playerDao: PlayerDao, private val api: DemoApi) {

    suspend fun fetchPlayersFromNetwork(): List<Player> {
        val players = api.getPlayers()
        // Save players to the local database (Room)
        players.forEach { player ->
            playerDao.insertPlayer(player)
        }
        return players
    }

    suspend fun getPlayersFromDatabase(): List<Player> {
        return playerDao.getAllPlayers()
    }
}
