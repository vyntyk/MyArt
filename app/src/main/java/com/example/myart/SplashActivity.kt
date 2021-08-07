package com.example.myart

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        // getSupportActionBar().hide();// скрытие ActionBar
        Handler().postDelayed({ //Этот метод будет выполнен по истечении таймера.
            // Начните свою основную деятельность в приложении
            val i = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(i)
            // закрыть активити
            finish()
        }, 3000)
    }

    protected fun OnBackPressed() {
        finish()
    }
}