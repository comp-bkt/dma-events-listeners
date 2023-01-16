package com.example.dma_events_listeners

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var button1:Button
    private lateinit var button2:Button
    private lateinit var button3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)


        /*All these are the same - button 1 and 3 are Lamda expressions for the View.OnClickListener*/

        button1.setOnClickListener{
            val tv:TextView = findViewById(R.id.textView1)
            tv.text = "Button 1 Clicked"
            removeTextFromView(tv)
        }

        button2.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View) {
                val tv:TextView = findViewById(R.id.textView2)
                tv.text = "Button 2 Clicked"
                removeTextFromView(tv)
            }
        })

        button3.setOnClickListener{
            val tv:TextView = findViewById(R.id.textView3)
            tv.text = "Button 3 Clicked"
            removeTextFromView(tv)
        }

    }

    private fun removeTextFromView(tv:TextView) {
        Handler(Looper.getMainLooper()).postDelayed({
            tv.text=""
        }, 3000)
    }
}