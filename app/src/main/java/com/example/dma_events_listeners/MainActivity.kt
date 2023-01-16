package com.example.dma_events_listeners

import android.os.Bundle
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

        }

        button2.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View) {

            }
        })

        button3.setOnClickListener{

        }

    }
}