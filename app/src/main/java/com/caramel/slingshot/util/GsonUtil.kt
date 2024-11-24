package com.caramel.slingshot.util

import com.google.gson.Gson
import com.google.gson.GsonBuilder

class GsonUtil private constructor() {
    private val gson: Gson

    init {
        val gsonBuilder = GsonBuilder()
        gson = gsonBuilder.create()
    }

    fun <T> fromJson(json: String?, clazz: Class<T>?): T {
        return gson.fromJson(json, clazz)
    }

    companion object {
        private var gsonUtils: GsonUtil? = null

        @get:Synchronized
        val instance: GsonUtil?
            get() {
                if (gsonUtils == null) {
                    gsonUtils = GsonUtil()
                }
                return gsonUtils
            }
    }
}