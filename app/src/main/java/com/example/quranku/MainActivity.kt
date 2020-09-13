package com.example.quranku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quranku.model.Surat
import com.example.quranku.network.ApiService
import com.example.quranku.network.RequestApi
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getQuran = RequestApi.getService()
        getQuran.getSurat().enqueue(object : Callback<List<Surat>>{
            override fun onFailure(call: Call<List<Surat>>, t: Throwable) {

            }

            override fun onResponse(call: Call<List<Surat>>, response: Response<List<Surat>>) {
//                if (response.isSuccessful){
////                    val data = response.body()
//
//                }
                rvQuran.adapter = SuratAdapter(response.body())
            }

        })
    }
}