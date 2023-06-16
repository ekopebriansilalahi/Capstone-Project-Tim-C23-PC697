package com.capstone.anakosehat.di

import android.content.Context
import com.capstone.anakosehat.data.remote.ApiConfig
import com.capstone.anakosehat.data.repository.AnaKoSehatRepository

object Injection {
    fun provideRepository(context: Context): AnaKoSehatRepository{
        val apiService = ApiConfig.anaKoSehatService
        return AnaKoSehatRepository(apiService)
    }

}