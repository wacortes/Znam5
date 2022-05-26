package com.example.znam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bogota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bogota)

        // Boton de Parques
        val parq1=findViewById<Button>(R.id.parques)
        parq1.setOnClickListener {
            val intento1 = Intent(this, parques::class.java)
            startActivity(intento1)
        }
    }
}