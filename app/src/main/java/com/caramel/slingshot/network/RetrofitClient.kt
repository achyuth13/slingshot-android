package com.starwars.leaderboard.network

import com.caramel.slingshot.network.DemoApi
import com.caramel.slingshot.Constants.Companion.API_BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    val api: DemoApi by lazy {
        Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(DemoApi::class.java)
    }
}
