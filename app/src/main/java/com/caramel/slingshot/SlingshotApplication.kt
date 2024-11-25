package com.caramel.slingshot

import android.app.Application

class SlingshotApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // Initialize libraries or global configurations here
        initializeLibraries()
    }

    private fun initializeLibraries() {
        // Example: Initialize Glide or other libraries
        // Glide.init(this, GlideBuilder())

        // Example: If using Room with a singleton database
        // Database.getInstance(this)
    }
}
