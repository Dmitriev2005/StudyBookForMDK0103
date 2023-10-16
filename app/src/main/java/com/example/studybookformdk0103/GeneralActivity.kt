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


class GeneralActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general)
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val exampleFragment = FragmentTheory() // Создание экземпляра фрагмента
        fragmentTransaction.replace(R.id.frame_layout, exampleFragment)
        fragmentTransaction.commit()

//        var listView = findViewById<ListView>(R.id.listView);
//        var itemList = listOf<BaseItem>(
//            BaseItem(R.drawable.item_list,"1. Знакомство с интерфейсом android studio"),
//            BaseItem(R.drawable.item_list,"2. TextView")
//        )
//        var adapter = CustomAdapter(this, itemList);
//        listView.adapter=adapter;
//        listView.setOnItemClickListener{
//            parent, view, position, id ->
//            when(position){
//                0->load2("t1.html")
//                1->Toast.makeText(this,"2",Toast.LENGTH_SHORT).show()
//                2->Toast.makeText(this,"2",Toast.LENGTH_SHORT).show()
//            }
//
//        }
//        var nav = ForBottomNavigation(this)
//        nav.bottomMenu()


    }



}

