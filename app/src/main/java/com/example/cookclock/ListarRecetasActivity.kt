package com.example.cookclock

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView

class ListarRecetasActivity: AppCompatActivity() {

    private lateinit var boton_receta1: Button
    private lateinit var boton_receta2: Button
    private lateinit var boton_receta3: Button
    private lateinit var boton_receta4: Button
    private lateinit var boton_receta5: Button
    private lateinit var boton_receta6: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listar_recetas)

        boton_receta1 = findViewById<Button>(R.id.button2)
        boton_receta1.setOnClickListener{
            val intent = Intent(this, RecetaActivity::class.java)
            startActivity(intent)
        }

        boton_receta2 = findViewById<Button>(R.id.button3)
        boton_receta2.setOnClickListener{
            val intent = Intent(this, RecetaActivity::class.java)
            startActivity(intent)
        }

        boton_receta3 = findViewById<Button>(R.id.button4)
        boton_receta3.setOnClickListener{
            val intent = Intent(this, RecetaActivity::class.java)
            startActivity(intent)
        }

        boton_receta4 = findViewById<Button>(R.id.button5)
        boton_receta4.setOnClickListener{
            val intent = Intent(this, RecetaActivity::class.java)
            startActivity(intent)
        }

        boton_receta5 = findViewById<Button>(R.id.button6)
        boton_receta5.setOnClickListener{
            val intent = Intent(this, RecetaActivity::class.java)
            startActivity(intent)
        }

        boton_receta6 = findViewById<Button>(R.id.button7)
        boton_receta6.setOnClickListener{
            val intent = Intent(this, RecetaActivity::class.java)
            startActivity(intent)
        }

    }
}