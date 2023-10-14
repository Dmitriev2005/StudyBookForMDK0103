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

        var listView = findViewById<ListView>(R.id.listView);
        var itemList = listOf<BaseItem>(
            BaseItem(R.drawable.item_list,"1. Знакомство с интерфейсом android studio"),
            BaseItem(R.drawable.item_list,"2. TextView")
        )
        var adapter = CustomAdapter(this, itemList);
        listView.adapter=adapter;
        listView.setOnItemClickListener{
            parent, view, position, id ->
            when(position){
                0->load2("t1.html")
                1->Toast.makeText(this,"2",Toast.LENGTH_SHORT).show()
                2->Toast.makeText(this,"2",Toast.LENGTH_SHORT).show()
            }

        }
        var nav = ForBottomNavigation(this)
        nav.bottomMenu()


    }
    private fun load2(nameHtml:String){
        val intent = Intent(this,ContentTheoryActivity::class.java)
        intent.putExtra("current_name",nameHtml)
        startActivity(intent)
    }


}
class CustomAdapter(private val context: Context, private val itemList: List<BaseItem>) : BaseAdapter() {

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

