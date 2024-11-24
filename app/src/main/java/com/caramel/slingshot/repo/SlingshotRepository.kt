package com.caramel.slingshot.repo

import com.caramel.slingshot.model.Player
import com.starwars.leaderboard.network.RetrofitClient

class SlingshotRepository {

    private val api = RetrofitClient.api

    suspend fun fetchPlayers(): List<Player> {
        return try {
            // Simulate network request, replace with actual Retrofit call
            api.getPlayers()
        } catch (e: Exception) {
            emptyList()  // Or handle the error accordingly
        }
    }
}