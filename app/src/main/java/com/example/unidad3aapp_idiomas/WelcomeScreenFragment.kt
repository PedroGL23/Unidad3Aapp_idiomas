package com.example.unidad3aapp_idiomas

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController


class WelcomeScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome_screen, container, false)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnSignIn).setOnClickListener{
            Log.i("Comprobaion", "Está entrando...")
            findNavController().navigate(R.id.action_welcomeScreenFragment_to_loginFragment)
        }


        view.findViewById<Button>(R.id.btnLetsStart).setOnClickListener{
            Log.i("Comprobaion", "Está entrando...")
            findNavController().navigate(R.id.action_welcomeScreenFragment_to_registerFragment)
        }

    }

}