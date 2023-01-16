package com.example.dma_events_listeners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
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
        textView1.text = "Button 1 Clicked"
        removeTextFromView(textView1)
    }
    fun button2Clicked(view: View) {
        textView2.text = "Button 2 Clicked"
        removeTextFromView(textView2)
    }
    fun button3Clicked(view: View) {
        textView3.text = "Button 3 Clicked"
        removeTextFromView(textView3)
    }

    private fun removeTextFromView(tv:TextView) {
        Handler(Looper.getMainLooper()).postDelayed({
            tv.text=""
        }, 3000)
    }
}