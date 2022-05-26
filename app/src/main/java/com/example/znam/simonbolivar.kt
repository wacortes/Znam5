package com.example.znam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class simonbolivar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simonbolivar)

        // Boton de Menu
        val hom5=findViewById<Button>(R.id.home5)
        hom5.setOnClickListener {
            val intento1 = Intent(this, parques::class.java)
            startActivity(intento1)
        }
    }
}