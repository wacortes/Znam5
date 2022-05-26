package com.example.znam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Florida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_florida)

        // Boton de Menu
        val hom1=findViewById<Button>(R.id.home2)
        hom1.setOnClickListener {
            val intento1 = Intent(this, parques::class.java)
            startActivity(intento1)
        }


    }
}