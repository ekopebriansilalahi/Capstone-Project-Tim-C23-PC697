package com.capstone.anakosehat.di

import android.content.Context
import com.capstone.anakosehat.data.repository.AnaKoSehatRepository

object Injection {
    fun provideRepository(context: Context): AnaKoSehatRepository{
        return AnaKoSehatRepository()
    }

}