package com.example.dma_events_listeners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView1:TextView
    private lateinit var textView2:TextView
    private lateinit var textView3:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1 = findViewById(R.id.textView1)
        textView2 = findViewById(R.id.textView2)
        textView3 = findViewById(R.id.textView3)
    }

    fun button1Clicked(view: View) {

    }
    fun button2Clicked(view: View) {

    }
    fun button3Clicked(view: View) {

    }
}