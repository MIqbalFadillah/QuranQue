package com.example.quranku.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.quranku.MainActivity
import com.example.quranku.R
import java.util.*
import kotlin.concurrent.schedule

class SplashScreen : AppCompatActivity() {

    private val SPLASH_TIME_OUT :Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))

            finish()
        }, SPLASH_TIME_OUT)

    }
}