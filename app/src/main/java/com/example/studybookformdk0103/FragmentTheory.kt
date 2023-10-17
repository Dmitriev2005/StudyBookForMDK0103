package com.example.studybookformdk0103

import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.log

class FragmentTheory : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        var listView = view?.findViewById<ListView>(R.id.listView);
//        var itemList = listOf<BaseItem>(
//            BaseItem(R.drawable.item_list,"1. Знакомство с интерфейсом android studio"),
//            BaseItem(R.drawable.item_list,"2. TextView")
//        )
//
//
//        val adapter = CustomAdapter(requireContext(), itemList)
//        listView?.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_theory, container, false)
        val listView = view.findViewById<ListView>(R.id.listView)

        val itemList = listOf<BaseItem>(
            BaseItem(R.drawable.item_list, "1. Знакомство с интерфейсом android studio"),
            BaseItem(R.drawable.item_list, "2. TextView")
        )

        val adapter = CustomAdapter(requireContext(), itemList)
        listView.adapter = adapter
        listView.setOnItemClickListener{
                parent, view, position, id ->
            when(position){
                0->load("t1.html")
                1->load("t2.html")
            }

        }
        return view
    }
    private fun load(nameHtml:String){
        val intent =  Intent(requireContext(),ContentTheoryActivity::class.java)
        intent.putExtra("current_name",nameHtml)
        startActivity(intent)
    }



}