package com.example.ryoma.webapp

import android.app.ActionBar
import android.content.Context
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt = bt(this)
        val wv = findViewById<WebView>(R.id.wv)
        wv.webViewClient = WebViewClient()
        wv.loadUrl("http://google.com/")
        wv.settings.javaScriptEnabled = true
        this.addContentView(bt, android.view.ViewGroup.LayoutParams(200,200))



    }


}
class bt(c:Context) : Button(c){
    val c = c
    init {

        this.text = "BT"
        this.y += 1500
        this.setBackgroundColor(Color.GREEN)
    }


    override fun onTouchEvent(event: MotionEvent?): Boolean {

        when (event?.action){
            MotionEvent.ACTION_DOWN -> Toast.makeText(c,"Touch",Toast.LENGTH_SHORT).show()

        }

        return super.onTouchEvent(event)
    }


}

class listener(c:Context,wv:WebView) : View.OnClickListener {

    val c = c
    val wv = wv


    override fun onClick(p0: View?) {
        Toast.makeText(c,"Tapped!",Toast.LENGTH_LONG).show()
        wv.loadUrl("http://youtube.com")


    }

}


