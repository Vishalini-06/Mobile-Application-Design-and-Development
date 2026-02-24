package com.example.bmicalculator

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

        setContentView(R.layout.activity_main)
        val etWeight = findViewById<EditText>(R.id.edit)
        val etHeight = findViewById<EditText>(R.id.edit2)
        val btnCalculate = findViewById<Button>(R.id.calculateButton)
        val tvResult = findViewById<TextView>(R.id.resultTextView)

        btnCalculate.setOnClickListener {

            val weightText = etWeight.text.toString()
            val heightText = etHeight.text.toString()

            // check empty input
            if (weightText.isEmpty() || heightText.isEmpty()) {
                tvResult.text = "Please enter both values"
                return@setOnClickListener
            }

            val weight = weightText.toFloat()
            val heightCm = heightText.toFloat()
            val heightM = heightCm / 100   // convert cm to meter

            val bmi = weight / (heightM * heightM)

            tvResult.text ="          BMI: %.2f".format(bmi)
        }
    }
}