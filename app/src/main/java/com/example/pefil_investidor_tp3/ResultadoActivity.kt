package com.example.pefil_investidor_tp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.textViewNome
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var nome = intent.getStringExtra("Nome")
        var perfil = intent.getStringExtra("perfil")

        textViewNome.text = nome
        //textViewPerfil.text = perfil
    }
}
