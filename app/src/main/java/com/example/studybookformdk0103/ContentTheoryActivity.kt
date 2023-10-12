package com.example.studybookformdk0103

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class ContentTheoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_theory)
        val web = findViewById<WebView>(R.id.web)
        web.webViewClient = WebViewClient()
        web.loadUrl("file:///android_res/raw/t1.html")
        var per = getIntent().getStringExtra("current_name")
        web.settings.javaScriptEnabled = true
    }

}
