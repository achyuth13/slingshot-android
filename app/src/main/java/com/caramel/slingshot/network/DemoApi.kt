package com.caramel.slingshot.network

import com.caramel.slingshot.model.Player
import retrofit2.http.GET

interface DemoApi {
    @GET("IKQQ")
    suspend fun getPlayers(): List<Player>
}