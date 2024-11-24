package com.caramel.slingshot.util

import android.util.Log

object Logger {
    private val TAG = "Slingshot" + Logger::class.java.simpleName

    private var previousTime: Long = 0

    fun log(`object`: Any) {
        log(TAG, `object`)
    }

    fun log(tag: String, `object`: Any) {
        Log.d("$TAG $tag", "" + `object`)
    }

    fun log(tag: String, message: String?, throwable: Throwable?) {
        Log.d("$TAG $tag", message, throwable)
    }

    fun logException(tag: String, reason: String?, throwable: Throwable?) {
        Log.d("$TAG $tag", reason, throwable)
        logException("$TAG $tag", throwable)
    }


    fun logException(throwable: Throwable?) {
        logException(TAG, throwable)
    }

    fun logException(tag: String, throwable: Throwable?) {
        Log.e(TAG + " " + tag, Log.getStackTraceString(throwable))
    }

    fun logException(tag: String, errorMsg: String?) {
        Log.e(TAG + " " + tag, errorMsg!!)
    }

    fun logTime(message: String) {
        val currentTime = System.currentTimeMillis()
        log(TAG + " === Time Logger: " + message + ", currentTime: " + currentTime + " ms, Difference: " + (currentTime - previousTime))
        previousTime = currentTime
    }
}