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
        val itemList = listOf<BaseItem>(
            BaseItem(R.drawable.item_list, "1. Знакомство с интерфейсом android studio"),
            BaseItem(R.drawable.item_list, "2. TextView")
        )
        val itemHtmlName = listOf<String>(
            "t1.html",
            "t2.html"
        )

        val t = AdapterListViewLoad(view?.findViewById<ListView>(R.id.listView),this,requireActivity() as AppCompatActivity,ContentTheoryActivity(),itemHtmlName,itemList);
        Log.d("start_act","complete")
        t.main()
        Log.d("end_act","complete")
        return view
    }


}