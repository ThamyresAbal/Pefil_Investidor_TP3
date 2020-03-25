package com.example.pefil_investidor_tp3.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.example.pefil_investidor_tp3.Model.DadosViewModel

import com.example.pefil_investidor_tp3.R

/**
 * A simple [Fragment] subclass.
 */
class Questao2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questao_2, container, false)
        var VM: DadosViewModel? = null
        activity?.let {
            VM = ViewModelProviders.of(it).get(DadosViewModel ::class.java)
        }

    }

}
