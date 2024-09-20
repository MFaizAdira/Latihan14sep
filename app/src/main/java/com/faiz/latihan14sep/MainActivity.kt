package com.faiz.latihan14sep

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnMI : Button
    private lateinit var btnTK : Button
    private lateinit var btnFoto : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnMI = findViewById(R.id.btnMI)
        btnTK= findViewById(R.id.btnTK)
        btnFoto = findViewById(R.id.btnFoto)

        btnMI.setOnClickListener(){
            val intent = Intent(this, MIActivity::class.java)
            startActivity(intent)
        }
        btnTK.setOnClickListener(){
            val intent = Intent(this, Teknik_Komputer::class.java)
            startActivity(intent)
        }
        btnFoto.setOnClickListener(){
            val intent = Intent(this, galery::class.java)
            startActivity(intent)
        }


    }
}