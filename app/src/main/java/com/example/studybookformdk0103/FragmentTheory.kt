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
            BaseItem(R.drawable.item_list, "2. Первый проект в Android Studio"),
            BaseItem(R.drawable.item_list, "3. TextView"),
            BaseItem(R.drawable.item_list, "4. Button"),
            BaseItem(R.drawable.item_list, "5. ImageView"),
            BaseItem(R.drawable.item_list, "6. RecyclerView"),
            BaseItem(R.drawable.item_list, "7. FragmentContainerView"),
            BaseItem(R.drawable.item_list, "8. ScrollView"),
            BaseItem(R.drawable.item_list, "9. View"),
            BaseItem(R.drawable.item_list, "10. WebView"),
        )

        val adapter = CustomAdapter(requireContext(), itemList)
        listView.adapter = adapter
        listView.setOnItemClickListener{
                parent, view, position, id ->
            when(position){
                0->load("t1.html")
                1->load("t2.html")
                2->load("t3.html")
                3->load("t4.html")
                4->load("t5.html")

            }

        }

        return view
    }
    private fun load(nameHtml:String){
        val args = Bundle()
        val fragment = FragmentWebView()
        args.putString("current_name",nameHtml)
        fragment.arguments = args
        fragmentManager?.beginTransaction()?.replace(R.id.frame_layout,fragment)?.commit()
    }



}