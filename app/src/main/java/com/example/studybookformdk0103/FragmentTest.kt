package com.example.studybookformdk0103

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class FragmentTest : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_theory, container, false)
        val listView = view.findViewById<ListView>(R.id.listView)

        val itemList = listOf<BaseItem>(
            BaseItem(R.drawable.item_list, "1. TextView (Тестирование)"),
            BaseItem(R.drawable.item_list, "2. Button (Тестирование)"),
            BaseItem(R.drawable.item_list, "3. ImageView   (Тестирование)"),
            BaseItem(R.drawable.item_list, "4. RecyclerView   (Тестирование)"),
            BaseItem(R.drawable.item_list, "5. FragmentContainerView"),
            BaseItem(R.drawable.item_list, "6. ScrollView"),
            BaseItem(R.drawable.item_list, "7. View"),
            BaseItem(R.drawable.item_list, "8. WebView")

        )


        val adapter = CustomAdapter(requireContext(), itemList)
        listView.adapter = adapter
        listView.setOnItemClickListener{
                parent, view, position, id ->
            when(position){
                0->load("test1.html")
                1->load("test2.html")
                2->load("test3.html")
                3->load("test4.html")
                4->load("test5.html")
                5->load("test6.html")
                6->load("test7.html")
                7->load("test8.html")
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