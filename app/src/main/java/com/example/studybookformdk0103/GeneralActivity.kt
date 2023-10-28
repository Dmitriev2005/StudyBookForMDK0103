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
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class GeneralActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general)
        loadFragment(FragmentTheory())

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.itemIconTintList = null
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.section_theory -> {
                    bottomNavigationView.menu.findItem(R.id.section_theory).isChecked = true;
                    bottomNavigationView.menu.findItem(R.id.section_practicle).isChecked = false;

                    loadFragment(FragmentTheory())
                    true
                }

                R.id.section_practicle -> {
                    bottomNavigationView.menu.findItem(R.id.section_theory).isChecked = false;
                    bottomNavigationView.menu.findItem(R.id.section_practicle).isChecked = true;
                    loadFragment(FragmentPracticle())
                    true
                }

                R.id.section_test -> {
                    loadFragment(FragmentTest())
                    bottomNavigationView.menu.findItem(R.id.section_theory).isChecked = false;
                    bottomNavigationView.menu.findItem(R.id.section_test).isChecked = true;
                    true
                }
                R.id.section_info -> {
                    loadFragment(FragmentInfo())
                    true
                }


                else -> false
            }
        }

    }
    private fun changeMarkBottomItem(id:Int){

    }
    private fun loadFragment(fragment:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }


}

