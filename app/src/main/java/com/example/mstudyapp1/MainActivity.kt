package com.example.mstudyapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.title = "Study app"

        val kotlinButton = findViewById<Button>(R.id.kotlen_button)
        val javaButton = findViewById<Button>(R.id.java_button)

        kotlinButton.setOnClickListener{

            startActivity(Intent(this, KotlinScreen::class.java))
        }

        javaButton.setOnClickListener{
            startActivity(Intent(this, AndroidScreen::class.java))
        }
    }
}