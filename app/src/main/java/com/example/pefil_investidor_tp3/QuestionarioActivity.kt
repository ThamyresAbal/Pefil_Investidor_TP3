package com.example.pefil_investidor_tp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isGone
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.example.pefil_investidor_tp3.Model.DadosViewModel
import kotlinx.android.synthetic.main.activity_questionario.*
import kotlinx.android.synthetic.main.fragment_questao_1.*

class QuestionarioActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionario)

        val navControler = findNavController(R.id.questionario_navigation)

        var VM = ViewModelProviders.of(this).get(DadosViewModel::class.java)

        setContentView(R.layout.fragment_questao_1)
    }
/*
    fun validarBotao():Boolean{
        btnAnterior.isGone
        btnProximo.setOnClickListener(){
            if(radioGroup.isSelected){
                //lista de id dos fragments
                    //manda pra próximo fragment
            }
            if (btnProximo.text == FINAL_TEXT_BUTTON){ // nova tela
                // encerrar o questionario
                val resultIntent = Intent(this, ResultActivity::class.java)

                resultIntent.putExtra("respostas", respostas.toIntArray())

                startActivity(resultIntent)

            } else { // nova pergunta
                if (perguntaCorrente < listaDePerguntas.size){
                    atualizarInterface(perguntaCorrente)
                }
            }

    }
        return true
    }*/
}


