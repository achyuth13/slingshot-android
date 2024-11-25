package com.caramel.slingshot

import android.content.Context
import android.content.SharedPreferences

//Example usage
// Getting the instance
//ApplicationPreference prefs = ApplicationPreference.getInstance(context);
//
//// Saving data
//prefs.setString("username", "JohnDoe");
//prefs.setBoolean("isLoggedIn", true);
//
//// Retrieving data
//String username = prefs.getString("username", "defaultName");
//boolean isLoggedIn = prefs.getBoolean("isLoggedIn", false);
//
//// Clearing all data
//prefs.clear();

class ApplicationPreference private constructor(context: Context) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun getBoolean(key: String?, defValue: Boolean): Boolean {
        return sharedPreferences.getBoolean(key, defValue)
    }

    fun setBoolean(key: String?, value: Boolean) {
        sharedPreferences.edit().putBoolean(key, value).apply()
    }

    fun getString(key: String?, defValue: String?): String? {
        return sharedPreferences.getString(key, defValue)
    }

    fun setString(key: String?, value: String?) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    fun getFloat(key: String?, defValue: Float): Float {
        return sharedPreferences.getFloat(key, defValue)
    }

    fun setFloat(key: String?, value: Float) {
        sharedPreferences.edit().putFloat(key, value).apply()
    }

    fun getInt(key: String?, defValue: Int): Int {
        return sharedPreferences.getInt(key, defValue)
    }

    fun setInt(key: String?, value: Int) {
        sharedPreferences.edit().putInt(key, value).apply()
    }

    fun getLong(key: String?, defValue: Long): Long {
        return sharedPreferences.getLong(key, defValue)
    }

    fun setLong(key: String?, value: Long) {
        sharedPreferences.edit().putLong(key, value).apply()
    }

    fun getDouble(key: String?, defValue: Double): Double {
        return java.lang.Double.longBitsToDouble(
            sharedPreferences.getLong(
                key,
                java.lang.Double.doubleToRawLongBits(defValue)
            )
        )
    }

    fun setDouble(key: String?, value: Double) {
        sharedPreferences.edit().putLong(key, java.lang.Double.doubleToRawLongBits(value)).apply()
    }

    fun contains(key: String?): Boolean {
        return sharedPreferences.contains(key)
    }

    fun remove(key: String?) {
        sharedPreferences.edit().remove(key).apply()
    }

    fun clear() {
        sharedPreferences.edit().clear().apply()
    }

    companion object {
        private const val PREFS_NAME = "application_preferences"
        private var instance: ApplicationPreference? = null
        @Synchronized
        fun getInstance(context: Context): ApplicationPreference? {
            if (instance == null) {
                instance = ApplicationPreference(context.applicationContext)
            }
            return instance
        }
    }
}
