package com.example.dma_events_listeners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val mButtonListener = View.OnClickListener {
        /*use 'it' for the View object*/
        if(it.id==R.id.button1) {

        }
        if(it.id==R.id.button2) {

        }
        if(it.id==R.id.button3) {

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener(mButtonListener)

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener(mButtonListener)

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener(mButtonListener)
    }
}