package com.example.znam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Boton de Iniciar
        val Inicio=findViewById<Button>(R.id.inicio)
        Inicio.setOnClickListener {
            val intento1 = Intent(this, ciudades::class.java)
            startActivity(intento1)
        }

    }
}