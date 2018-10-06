package biz.aurafreelancersstudio.visionkit.core.wrapper


import android.content.Context.MODE_PRIVATE
import biz.aurafreelancersstudio.visionkit.R
import biz.aurafreelancersstudio.visionkit.VisionKitApplication

object SharedPreferencesWrapper {

    private val preferences by lazy {
        with(VisionKitApplication.instance.applicationContext) {
            this.getSharedPreferences(this.getString(R.string.preferences_file), MODE_PRIVATE)
        }
    }

    fun put(key: String, value: Any) {
        when (value) {
            is Int -> preferences.edit().putInt(key, value).apply()
            is Long -> preferences.edit().putLong(key, value).apply()
            is Boolean -> preferences.edit().putBoolean(key, value).apply()
            is Float -> preferences.edit().putFloat(key, value).apply()
            is String -> preferences.edit().putString(key, value).apply()
        }
    }

    fun getBoolean(key: String) = preferences.getBoolean(key, true)
}