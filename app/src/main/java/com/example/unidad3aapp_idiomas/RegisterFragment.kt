package com.example.unidad3aapp_idiomas

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.unidad3aapp_idiomas.databinding.ActivityMainBinding


class RegisterFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnRegister).setOnClickListener{
            Log.i("Comprobacion", "Está entrando...")
            findNavController().navigate(R.id.action_registerFragment_to_languageMenuFragment)
        }


        view.findViewById<Button>(R.id.btnRegister).setOnClickListener(){
            var regName = view.findViewById<EditText>(R.id.nameEditText)
            var regEmail = view.findViewById<EditText>(R.id.emailEditText)
            var regPhone = view.findViewById<EditText>(R.id.phoneEditText)
            var regPassword = view.findViewById<EditText>(R.id.passwordEditText)

            var helperText = view.findViewById<TextView>(R.id.helper)

            if(regName.text.toString().isEmpty()){
                helperText.text = "Debe introducir un nombre."
            } else if(regEmail.text.toString().isEmpty()){
                helperText.text = "Debe introducir un correo."
            }else if(regPhone.text.toString().isEmpty()) {
                helperText.text = "Debe introducir un número de teléfono."
            }else if(regPassword.text.toString().isEmpty()) {
                helperText.text = "Debe introducir una contraseña."
            }else{
                val action = RegisterFragmentDirections.actionRegisterFragmentToLanguageMenuFragment()
                findNavController().navigate(action)
            }


        }


    }









}