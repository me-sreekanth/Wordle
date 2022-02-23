package com.ordroid.wordleglobenerdle


import android.content.Intent

import android.os.Looper

import android.os.Bundle

import android.app.Activity
import android.os.Handler
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {
    /*Duration of wait*/
    private val SPLASH_DISPLAY_LENGTH = 2000
    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acttivity_splash)
        Handler(Looper.getMainLooper()).postDelayed(Runnable { /* Create an Intent that will start the MainActivity. */
            val mainIntent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, SPLASH_DISPLAY_LENGTH.toLong())
    }
}