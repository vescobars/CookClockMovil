package com.example.cookclock

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    private lateinit var login_boton: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        login_boton = findViewById<ImageButton>(R.id.imageButton3)

        login_boton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val intent = Intent(this@MainActivity, ListarRecetasActivity::class.java)
                startActivity(intent)
            }
        })

    }
}