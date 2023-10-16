package com.example.studybookformdk0103

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

public class CustomAdapter(private val context: Context, private val itemList: List<BaseItem>) : BaseAdapter() {

    override fun getCount(): Int {
        return itemList.size
    }

    override fun getItem(position: Int): Any {
        return itemList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.my_list_item, parent, false)
        }

        val imageView = view!!.findViewById<ImageView>(R.id.imageView1)
        val textView = view.findViewById<TextView>(R.id.textView1)

        val currentItem = itemList[position]

        // Установка изображения из ресурсов
        imageView.setImageResource(currentItem.getImage())

        // Установка текста
        textView.text = currentItem.getText()

        return view
    }
}
