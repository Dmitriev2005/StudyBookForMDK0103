package com.example.studybookformdk0103

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            startActivity(Intent(this,GeneralActivity::class.java))
        }, 1000)
        val t = findViewById<TextView>(R.id.textView)

    }
}