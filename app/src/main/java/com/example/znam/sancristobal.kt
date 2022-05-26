package com.example.znam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sancristobal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sancristobal)

        // Boton de Menu
        val hom3=findViewById<Button>(R.id.home4)
        hom3.setOnClickListener {
            val intento1 = Intent(this, parques::class.java)
            startActivity(intento1)
        }

    }
}