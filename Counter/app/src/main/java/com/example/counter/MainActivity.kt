package com.example.counter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_main)

        val text1: TextView = findViewById(R.id.t1)
        val but1: Button = findViewById(R.id.b1)
        val but2 = findViewById<Button>(R.id.b2)

        but1.setOnClickListener{
            text1.text = (text1.text.toString().toInt()+1).toString()

        }
        but2.setOnClickListener{
            text1.text=(text1.text.toString().toInt()-1).toString()
        }
    }
}