package com.example.movierecommendationsystem

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val wv= findViewById<WebView>(R.id.webv)
        webViewSetUp(wv)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(a:WebView){
        a.webViewClient= WebViewClient()
        a.apply {
            settings.safeBrowsingEnabled = true
            settings.javaScriptEnabled = true
            loadUrl("https://cooldudeadarsh-movie-recommender-system-app-thwcfh.streamlit.app/")
        }
    }
}