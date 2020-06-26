package com.kenowa.appfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*
import java.util.*
import kotlin.concurrent.timerTask

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val animacion : Animation = AnimationUtils.loadAnimation(this, R.anim.entrada)
        iv_team.animation = animacion

        val timer = Timer()
        timer.schedule(timerTask {
            goToLoginActivity()
        }, 1800
        )
    }

    private fun goToLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.d("OnStart", "ok")
    }

    override fun onResume() {
        super.onResume()
        Log.d("OnResume", "ok")
    }

    override fun onPause() {
        super.onPause()
        Log.d("OnPause", "ok")
    }

    override fun onStop() {
        super.onStop()
        Log.d("OnStop", "ok")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("OnRestart", "ok")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("OnDestroy", "ok")
    }
}