package com.example.temperatureconverter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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

        val btnCtoF = findViewById<Button>(R.id.btnCtoF)
        val btnFtoC = findViewById<Button>(R.id.btnFtoC)

        btnCtoF.setOnClickListener {

            val etTemp = findViewById<EditText>(R.id.etTemp)
            val tvResult = findViewById<TextView>(R.id.tvResult)
            val tempInCelsius = etTemp.text.toString().toDouble()

            val tempInFahrenheit = (tempInCelsius * 9 / 5) + 32

            tvResult.text = "$tempInFahrenheit °F"

        }
        btnFtoC.setOnClickListener {

            val etTemp = findViewById<EditText>(R.id.etTemp)
            val tvResult = findViewById<TextView>(R.id.tvResult)
            val tempInFahrenheit = etTemp.text.toString().toDouble()
            val tempInCelsius = (tempInFahrenheit - 32) * 5 / 9


            tvResult.text = "$tempInCelsius °C"



        }


    }
}