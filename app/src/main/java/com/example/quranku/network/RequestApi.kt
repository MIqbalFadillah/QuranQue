package com.example.quranku.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RequestApi {
    fun getService(): ApiService {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.banghasan.com/quran/format/json/")
            .build()
        return retrofit.create(ApiService::class.java)
    }
}