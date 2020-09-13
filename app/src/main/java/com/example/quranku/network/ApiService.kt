package com.example.quranku.network

import com.example.quranku.model.Surat
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("surat")
    fun getSurat(): Call<List<Surat>>
}