package com.example.cookclock

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class AlarmasActivity : AppCompatActivity(){

    private lateinit var botonFinalizar: ImageButton
    private lateinit var botonInfo1: ImageButton
    private lateinit var botonInfo2: ImageButton
    private var num: Int = 0
    private var customView: android.view.View? = null // Inicialización con valor nulo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alarmas)

        botonFinalizar = findViewById<ImageButton>(R.id.imageButton19)
        botonFinalizar.setOnClickListener {
            val intent = Intent(this, ResumenActivity::class.java)
            startActivity(intent)
        }

        botonInfo1 = findViewById<ImageButton>(R.id.imageButton7)
        botonInfo1.setOnClickListener {
            num=1
            showCustomPopup(num)
        }

        botonInfo2 = findViewById<ImageButton>(R.id.imageButton15)
        botonInfo2.setOnClickListener {
            num=2
            showCustomPopup(num)

        }

        val play = findViewById<ImageButton>(R.id.imageButton9)
        var isImage1 = true // Variable para alternar entre las imágenes

        play.setOnClickListener {
            // Cambia la imagen del ImageButton al hacer clic
            if (isImage1) {
                play.setImageResource(R.drawable.component_20)
            } else {
                play.setImageResource(R.drawable.component_21)
            }

            // Cambia el estado de la variable para la próxima vez
            isImage1 = !isImage1
        }

    }
    private fun showCustomPopup(num:Int) {
        val inflater = layoutInflater
        if (num==1)
            customView = inflater.inflate(R.layout.etapa1, null)
        else
            customView = inflater.inflate(R.layout.etapa2, null)

        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setView(customView)

        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}