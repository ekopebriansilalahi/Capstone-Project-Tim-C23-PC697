package com.capstone.anakosehat.data.remote

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiConfig {
    private val okHttp = OkHttpClient.Builder()
        .apply {
            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.level = HttpLoggingInterceptor.Level.NONE
            addInterceptor(loggingInterceptor)
        }.build()

    private val retrofit = Retrofit.Builder()
        .client(okHttp)
        .baseUrl("https://capstone-388811.et.r.appspot.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val anaKoSehatService = retrofit.create<AnaKoSehatService>()
}