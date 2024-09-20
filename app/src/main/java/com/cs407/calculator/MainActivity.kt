package com.cs407.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)

        val addButton = findViewById<Button>(R.id.add_button)
        val subButton = findViewById<Button>(R.id.sub_button)
        val multButton = findViewById<Button>(R.id.mult_button)
        val divButton = findViewById<Button>(R.id.div_button)

        // addition
        addButton.setOnClickListener {
            val str1 = editText1.text.toString()
            val str2 = editText2.text.toString()

            try {
                val int1 = str1.toInt()
                val int2 = str2.toInt()
                val output = (int1 + int2).toString()

                val intent = Intent(this, OutputActivity::class.java)
                intent.putExtra("OUTPUT", output)
                startActivity(intent)
            } catch (e: NumberFormatException) {
                val output = "Invalid input"
                val intent = Intent(this, OutputActivity::class.java)
                intent.putExtra("OUTPUT", output)
                startActivity(intent)
            }

        }

        // subtraction
        subButton.setOnClickListener {
            val str1 = editText1.text.toString()
            val str2 = editText2.text.toString()

            try {
                val int1 = str1.toInt()
                val int2 = str2.toInt()
                val output = (int1 - int2).toString()

                val intent = Intent(this, OutputActivity::class.java)
                intent.putExtra("OUTPUT", output)
                startActivity(intent)
            } catch (e: NumberFormatException) {
                val output = "Invalid input"
                val intent = Intent(this, OutputActivity::class.java)
                intent.putExtra("OUTPUT", output)
                startActivity(intent)
            }

        }

        // multiplication
        multButton.setOnClickListener {
            val str1 = editText1.text.toString()
            val str2 = editText2.text.toString()

            try {
                val int1 = str1.toInt()
                val int2 = str2.toInt()
                val output = (int1 * int2).toString()

                val intent = Intent(this, OutputActivity::class.java)
                intent.putExtra("OUTPUT", output)
                startActivity(intent)
            } catch (e: NumberFormatException) {
                val output = "Invalid input"
                val intent = Intent(this, OutputActivity::class.java)
                intent.putExtra("OUTPUT", output)
                startActivity(intent)
            }

        }

        // division
        divButton.setOnClickListener {
            val str1 = editText1.text.toString()
            val str2 = editText2.text.toString()

            try {
                val int1 = str1.toInt()
                val int2 = str2.toInt()
                val output = (int1 / int2).toString()

                val intent = Intent(this, OutputActivity::class.java)
                intent.putExtra("OUTPUT", output)
                startActivity(intent)
            } catch (e: NumberFormatException) {
                val output = "Invalid input"
                val intent = Intent(this, OutputActivity::class.java)
                intent.putExtra("OUTPUT", output)
                startActivity(intent)
            } catch (e: ArithmeticException) {
                val output = "Invalid input"
                val intent = Intent(this, OutputActivity::class.java)
                intent.putExtra("OUTPUT", output)
                startActivity(intent)
            }

        }

    }
}