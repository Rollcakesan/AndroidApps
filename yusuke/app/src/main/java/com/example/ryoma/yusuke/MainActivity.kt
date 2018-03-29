package com.example.ryoma.yusuke

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.textView)
        tv.setTextColor(Color.BLACK)
        var text = UsukegaKeisansuruToko(tv)





    }

    fun UsukegaKeisansuruToko(tv: TextView){

        var x = 0








        tv.text = x.toString()
    }





}
