package com.example.pefil_investidor_tp3.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isGone
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.pefil_investidor_tp3.Model.DadosViewModel
import com.example.pefil_investidor_tp3.R
import kotlinx.android.synthetic.main.activity_questionario.*
import kotlinx.android.synthetic.main.fragment_questao_1.*

/**
 * A simple [Fragment] subclass.
 */
class Questao1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questao_1, container, false)

        val model = ViewModelProviders.of(this)[DadosViewModel::class.java]
        model.SomaPontos.add(validarResposta())

    }
    fun validarResposta(): Int {
        var pontuacao = when (radioGroup.checkedRadioButtonId) {
                radioResposta1.id -> 0
                radioResposta2.id -> 2
                radioResposta3.id -> 3
                radioResposta4.id -> 4
                else -> "hello"/*Toast.makeText(
                    this,
                    "Selecione um opção para continuar.",
                    Toast.LENGTH_SHORT
                ).show()*/
            }

        return 0 //pontuacao
    }
}



