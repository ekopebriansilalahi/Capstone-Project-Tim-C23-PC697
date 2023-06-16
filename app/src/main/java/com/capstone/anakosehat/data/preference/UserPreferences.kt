package com.capstone.anakosehat.data.preference

import android.content.Context
import com.capstone.anakosehat.data.model.Allergies
import com.capstone.anakosehat.data.model.PhysicalAttribute
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class UserPreferences(context: Context) {

    companion object {
        private const val isLogin = "isLogin"
        private const val age = "age"
        private const val weight = "weight"
        private const val height = "height"
        private const val sex = "sex"
        private const val allergies = "allergies"
    }

    private val preferences = context.getSharedPreferences(isLogin, Context.MODE_PRIVATE)


    fun setPhysical(pref: PhysicalAttribute) {
        val editor = preferences.edit()
        editor.putBoolean(isLogin, pref.isLogin!!)
        editor.putInt(age, pref.age!!)
        editor.putFloat(weight, pref.weight!!)
        editor.putFloat(height, pref.height!!)
        editor.putBoolean(sex, pref.sex!!)

        editor.apply()
    }


    fun getPref(): PhysicalAttribute {
        val model = PhysicalAttribute()
        model.isLogin = preferences.getBoolean(isLogin, false)
        model.age = preferences.getInt(age, 0)
        model.weight = preferences.getFloat(weight, 0f)
        model.height = preferences.getFloat(height, 0f)
        model.sex = preferences.getBoolean(sex,false)

        return model
    }

    fun setAllergies(allergies: Allergies) {
        val json = Gson().toJson(allergies)
        preferences.edit().putString("allergies", json).apply()
    }

    fun getAllergies(): Allergies {
        val json = preferences.getString("allergies", null)
        return if (json != null) {
            Gson().fromJson(json, object : TypeToken<Allergies>() {}.type)
        } else {
            Allergies()
        }
    }



    fun clearSession() {
        val editor = preferences.edit()
        editor.clear()
        editor.apply()
    }
}