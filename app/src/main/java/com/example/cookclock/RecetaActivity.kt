package com.example.cookclock

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class RecetaActivity : AppCompatActivity() {

    private lateinit var botonComenzar: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.receta)

        // Asigna el botón a la variable
        botonComenzar = findViewById<ImageButton>(R.id.imageButton)
        // Configura un clic en el botón para ir a la vista de alarmas
        botonComenzar.setOnClickListener{
            val intent = Intent(this, AlarmasActivity::class.java)
            startActivity(intent)
        }
    }
}