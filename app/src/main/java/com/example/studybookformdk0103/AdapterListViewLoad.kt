package com.example.studybookformdk0103

import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


class AdapterListViewLoad(_list:ListView?,_fragment:Fragment, _thisActivity: AppCompatActivity,_otherActivity:AppCompatActivity, _listNameHtml:List<String>,_listNameTheme:List<BaseItem>) {
    val listNameHtml:List<String>
    val listNameTheme:List<BaseItem>
    val thisActivity:AppCompatActivity
    val otherActivity:AppCompatActivity
    val fragment: Fragment
    val list : ListView?
    init{
        listNameHtml = _listNameHtml
        listNameTheme = _listNameTheme
        thisActivity = _thisActivity
        otherActivity = _otherActivity
        fragment = _fragment
        list = _list
    }
    public fun main(){

        val adapter = CustomAdapter(fragment.requireContext(), listNameTheme)
        list?.adapter = adapter
        list?.setOnItemClickListener { parent, view, position, id ->
            if (position in 0 until listNameHtml.size) {
                loadHtml(listNameHtml[position])
            }
        }
        Log.d("class","main")
    }

    private fun loadHtml(nameHtml:String){
        val intent =  Intent(thisActivity,otherActivity::class.java)
        intent.putExtra("current_name",nameHtml)
        thisActivity.startActivity(intent)
        Log.d("class","load")
    }
}