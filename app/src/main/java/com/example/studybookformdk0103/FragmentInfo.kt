package com.example.studybookformdk0103

import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.log

class FragmentInfo : Fragment() {


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
        val view = inflater.inflate(R.layout.fragment_info, container, false)
        val web = view.findViewById<WebView>(R.id.web2)
        web.webViewClient = WebViewClient()
        web.settings.javaScriptEnabled = true
        web.settings.allowContentAccess = true
        web.settings.allowContentAccess = true
        WebView.setWebContentsDebuggingEnabled(true)
        web.loadUrl("file:///android_res/raw/info.html")

        return view
    }




}