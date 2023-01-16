package com.example.dma_events_listeners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener(this)

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener(this)

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v!!.id == R.id.button1) {
            val tv:TextView = findViewById(R.id.textView1)
            tv.text = "Button 1 Clicked"
        }
        if(v!!.id == R.id.button2) {
            val tv:TextView = findViewById(R.id.textView2)
            tv.text = "Button 2 Clicked"
        }
        if(v!!.id == R.id.button3) {
            val tv:TextView = findViewById(R.id.textView3)
            tv.text = "Button 3 Clicked"
        }
    }
}

