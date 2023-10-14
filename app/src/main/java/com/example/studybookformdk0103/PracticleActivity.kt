package com.example.studybookformdk0103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PracticleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practicle)
        var nav = ForBottomNavigation(this)
        nav.bottomMenu()
    }
}