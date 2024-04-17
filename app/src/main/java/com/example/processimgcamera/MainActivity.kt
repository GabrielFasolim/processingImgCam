package com.example.processimgcamera

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnCapture: Button
    private lateinit var btnGrayScale: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCapture = findViewById(R.id.btnCapture)
        btnGrayScale = findViewById(R.id.btnGrayScale)

        btnCapture.setOnClickListener {
            // Implementação da captura de imagem
            Toast.makeText(this, "Capturar Imagem", Toast.LENGTH_SHORT).show()
        }

        btnGrayScale.setOnClickListener {
            // Implementação do processamento em tons de cinza
            Toast.makeText(this, "Aplicar Tons de Cinza", Toast.LENGTH_SHORT).show()
        }
    }
}
