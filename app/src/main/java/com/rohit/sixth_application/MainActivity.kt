package com.rohit.sixth_application

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var number: TextView? = null
    var addition: Button? = null
    var subtraction: Button? = null
    var multiply: Button? = null
    var division: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        number = findViewById(R.id.number)
        addition = findViewById(R.id.addition)
        subtraction = findViewById(R.id.subtraction)
        multiply = findViewById(R.id.multiply)
        division = findViewById(R.id.division)

        addition?.setOnClickListener {
            val number1 = number?.text.toString().toIntOrNull() ?: 0
            val result = number1 + 2
            number?.setText(result.toString())
        }
        subtraction?.setOnClickListener {
            val number1 = number?.text.toString().toIntOrNull() ?: 0
            val result = number1 - 2
            number?.setText(result.toString())
        }
        multiply?.setOnClickListener {
            val number1 = number?.text.toString().toIntOrNull() ?: 0
            val result = number1 * 2
            number?.setText(result.toString())
        }
        division?.setOnClickListener {
            val number1 = number?.text.toString().toIntOrNull() ?: 0
            if (number1 != 0) {
                val result = number1 / 2
                number?.setText(result.toString())
            } else {
                number?.setText("Error")
            }
        }
    }
}
