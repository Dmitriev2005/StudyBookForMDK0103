package com.example.studybookformdk0103

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class FragmentWebView : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_web_view, container, false)
        val web = view.findViewById<WebView>(R.id.web)
        web.webViewClient = WebViewClient()
        web.settings.javaScriptEnabled = true
        web.settings.allowContentAccess = true
        web.settings.allowContentAccess = true
        WebView.setWebContentsDebuggingEnabled(true)
        web.loadUrl("file:///android_res/raw/"+arguments?.getString("current_name"))
        return view //inflater.inflate(R.layout.fragment_web_view, container, false)
    }


}