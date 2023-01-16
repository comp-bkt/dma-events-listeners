package com.example.dma_events_listeners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

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
            //code to go here
        }
        if(v!!.id == R.id.button2) {
            //code to go here
        }
        if(v!!.id == R.id.button3) {
            //code to go here
        }
    }
}

