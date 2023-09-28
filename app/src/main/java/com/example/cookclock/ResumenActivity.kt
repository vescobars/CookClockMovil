package com.example.cookclock

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ResumenActivity : AppCompatActivity() {

    private lateinit var botonRegresar: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resumen)

        botonRegresar = findViewById<ImageButton>(R.id.imageButton4)
        botonRegresar.setOnClickListener{
            val intent = Intent(this, ListarRecetasActivity::class.java)
            startActivity(intent)
        }
    }
}