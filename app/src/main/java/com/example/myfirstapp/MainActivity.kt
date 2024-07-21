package com.example.myfirstapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonLight = findViewById<Button>(R.id.btnLight)
        val layout = findViewById<LinearLayout>(R.id.linearLayout)

        buttonDark.setOnClickListener{
            layout.setBackgroundResource(R.color.black)
            Toast.makeText(applicationContext, "Dark Theme Apply", Toast.LENGTH_SHORT).show()
        }

        buttonLight.setOnClickListener({
            layout.setBackgroundResource(R.color.white)
            Toast.makeText(applicationContext, "Light Theme Apply", Toast.LENGTH_SHORT).show()
        })

        val btnIntent = findViewById<Button>(R.id.button)

        btnIntent.setOnClickListener{
           val intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}