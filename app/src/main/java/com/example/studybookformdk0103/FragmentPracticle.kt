package com.example.studybookformdk0103

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView


class FragmentPracticle : Fragment() {

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
            BaseItem(R.drawable.item_list, "1. Практическая работа"),
            BaseItem(R.drawable.item_list, "2. Практическая работа"),
            BaseItem(R.drawable.item_list, "3. Практическая работа"),
            BaseItem(R.drawable.item_list, "4. Практическая работа"),
            BaseItem(R.drawable.item_list, "5. Практическая работа"),
            BaseItem(R.drawable.item_list, "6. Практическая работа"),
            BaseItem(R.drawable.item_list, "7. Практическая работа"),
            BaseItem(R.drawable.item_list, "8. Практическая работа"),
            BaseItem(R.drawable.item_list, "9. Практическая работа"),
            BaseItem(R.drawable.item_list, "10. Практическая работа"),
            BaseItem(R.drawable.item_list, "11. Практическая работа"),
            BaseItem(R.drawable.item_list, "12. Практическая работа"),
            BaseItem(R.drawable.item_list, "13. Практическая работа"),
            BaseItem(R.drawable.item_list, "14. Практическая работа"),
            BaseItem(R.drawable.item_list, "15. Практическая работа"),
            BaseItem(R.drawable.item_list, "16 . Практическая работа"),
            BaseItem(R.drawable.item_list, "17 . Практическая работа"),
            BaseItem(R.drawable.item_list, "18 . Практическая работа"),
            BaseItem(R.drawable.item_list, "19 . Практическая работа"),
        )

        val adapter = CustomAdapter(requireContext(), itemList)
        listView.adapter = adapter
        listView.setOnItemClickListener{
                parent, view, position, id ->
            when(position){
                0->load("p1.htm")
                1->load("p2.htm")
                2->load("p3.htm")
                3->load("p4.htm")
                4->load("p5.htm")
                5->load("p6.htm")
                6->load("p7.htm")
                7->load("p8.htm")
                8->load("p9.htm")
                9->load("p10.htm")
                10->load("p11.htm")
                11->load("p12.htm")
                12->load("p13.htm")
                13->load("p14.htm")
                14->load("p15.htm")
                15->load("p16.htm")
                16->load("p17.htm")
                17->load("p18.htm")
                18->load("p19.htm")
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