package com.example.pefil_investidor_tp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent =Intent(this,ResultadoActivity::class.java)
        intent.putExtra("Nome",editTextNomeCompleto.text.toString())

        buttonIniciar.setOnClickListener{
            if(editTextNomeCompleto.text.toString().isNullOrEmpty()) {
                val iniciar = Intent(this, ResultadoActivity::class.java)
                editTextNomeCompleto
                startActivity(iniciar)
            }else{
                Toast.makeText(
                    this,
                    "Digite seu nome para continuar!",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}


