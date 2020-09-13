package com.example.quranku.model

import com.google.gson.annotations.SerializedName

data class Surat(
    @SerializedName("nama")
    val nama: String,
    @SerializedName("nomor")
    val nomor: Int,
    @SerializedName("asma")
    val arab: String,
    @SerializedName("ayat")
    val ayat: Int,
    @SerializedName("type")
    val type: String,
    @SerializedName("arti")
    val arti: String
)