package com.example.cookclock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var receta_boton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_listar_recetas)

        receta_boton = findViewById<Button>(R.id.button2)

        receta_boton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                setContentView(R.layout.receta)
            }
        })

    }
}