package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)


            val btnIntent2 = findViewById<Button>(R.id.button3)

            btnIntent2.setOnClickListener{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

    }
}