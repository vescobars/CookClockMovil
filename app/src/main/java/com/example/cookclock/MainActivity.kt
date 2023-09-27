package com.example.cookclock

import android.content.Intent
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
                // Crear un Intent para abrir RecetaActivity
                val intent = Intent(this@MainActivity, RecetaActivity::class.java)
                startActivity(intent)
            }
        })

    }
}