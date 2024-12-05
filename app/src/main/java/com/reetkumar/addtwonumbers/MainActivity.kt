package com.reetkumar.addtwonumbers

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1EditText = findViewById<EditText>(R.id.num1EditText)
        val num2EditText = findViewById<EditText>(R.id.num2EditText)
        val addButton = findViewById<Button>(R.id.addButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        addButton.setOnClickListener {
            val num1Text = num1EditText.text.toString()
            val num2Text = num2EditText.text.toString()

            if (num1Text.isEmpty() || num2Text.isEmpty()) {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            } else {
                val num1 = num1Text.toDoubleOrNull()
                val num2 = num2Text.toDoubleOrNull()

                if (num1 != null && num2 != null) {
                    val result = num1 + num2
                    resultTextView.text = "Result: $result"
                } else {
                    Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
