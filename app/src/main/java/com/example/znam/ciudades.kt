package com.example.znam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ciudades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        // Boton de Menu
        val menu=findViewById<Button>(R.id.menu1)
        menu.setOnClickListener {
            val intento1 = Intent(this, MainActivity::class.java)
            startActivity(intento1)
        }

        // Boton de Bogota
        val bog=findViewById<Button>(R.id.bogota)
        bog.setOnClickListener {
            val intento1 = Intent(this, bogota::class.java)
            startActivity(intento1)
        }


    }
}