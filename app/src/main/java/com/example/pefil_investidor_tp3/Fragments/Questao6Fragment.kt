package com.example.pefil_investidor_tp3.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.example.pefil_investidor_tp3.Model.DadosViewModel

import com.example.pefil_investidor_tp3.R
import kotlinx.android.synthetic.main.fragment_questao_6.*

class Questao6Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questao_6, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var model: DadosViewModel? = null
        activity?.let {
            model = ViewModelProviders.of(it).get(DadosViewModel ::class.java)
        }

        /*buttonAvancar.setClickListener{
            validarResposta(model)
            findNavController().navigate(R.id.questao7Fragment)
        }*/
    }

    fun validarResposta(model: DadosViewModel?) {
        var pontuacao = when (radioGroup.checkedRadioButtonId) {
                radioResposta1.id -> model!!.SomaPontos.add(0)
                radioResposta2.id -> model!!.SomaPontos.add(2)
                radioResposta3.id -> model!!.SomaPontos.add(3)
            else -> model!!.SomaPontos.add(4)
        }
    }

}
