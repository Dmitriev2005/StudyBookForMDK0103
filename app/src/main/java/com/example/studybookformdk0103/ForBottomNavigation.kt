package com.example.studybookformdk0103

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class ForBottomNavigation (private val activity:AppCompatActivity){
    public fun bottomMenu(){
        val bottomNavigationView = activity.findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.section_theory -> {
                    activity.startActivity(Intent(activity,GeneralActivity::class.java))
                    bottomNavigationView.menu.findItem(R.id.section_theory).isChecked = true;
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.section_practicle ->{
                    activity.startActivity(Intent(activity,PracticleActivity::class.java))
                    bottomNavigationView.menu.findItem(R.id.section_practicle).isChecked = true;
                    return@setOnNavigationItemSelectedListener true
                }


                R.id.section_test ->
                    return@setOnNavigationItemSelectedListener true

                else -> return@setOnNavigationItemSelectedListener false
            }
        }
    }
}