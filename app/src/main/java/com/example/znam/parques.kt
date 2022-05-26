package com.example.znam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class parques : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parques)

        // Boton de Parque Simon Bolivar
        val pqsb=findViewById<Button>(R.id.SBolivar)
        pqsb.setOnClickListener {
            val intento1 = Intent(this, simonbolivar::class.java)
            startActivity(intento1)
        }

        // Boton de Parque Florida
        val pqfl=findViewById<Button>(R.id.Florida)
        pqfl.setOnClickListener {
            val intento1 = Intent(this, Florida::class.java)
            startActivity(intento1)
        }

        // Boton de Parque Home
        val hom2=findViewById<Button>(R.id.home3)
        hom2.setOnClickListener {
            val intento1 = Intent(this, ciudades::class.java)
            startActivity(intento1)
        }

        // Boton de Parque San Cristobal
        val pqsc=findViewById<Button>(R.id.Sancristobal)
        pqsc.setOnClickListener {
            val intento1 = Intent(this, sancristobal::class.java)
            startActivity(intento1)
        }

    }
}