package com.example.mysplash

import android.content.Intent
import android.content.IntentSender.OnFinished
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.measureTimeMillis

class SplashActivity : AppCompatActivity() {
    lateinit var txtProgrss: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        txtProgrss = findViewById(R.id.textProgress)

        splash()

    }

    private fun splash(){
        object : CountDownTimer(5000, 1000){
            override fun onTick(millisUntiFinished: Long) {
                txtProgrss.setText("La app iniciara en : " + millisUntiFinished/1000)
            }

            override fun onFinish() {
                var mIntent = Intent(applicationContext, MainActivity::class.java).apply {  }
                startActivity(mIntent)
            }

        }.start()
    }
}