package com.example.unidad3aapp_idiomas

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.unidad3aapp_idiomas.databinding.FragmentLoginBinding
import com.google.gson.Gson
import java.io.IOException


class LanguageMenuFragment : Fragment() {

    lateinit var myReyclerView: RecyclerView
    private lateinit var mAdapter: RecyclerAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_language_menu, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(context)
        val json = readJsonFromFile("languagesList.json")
        val languages = Gson().fromJson(json, LanguagesListResponse::class.java)

        Log.i("Prueba desde LanguageMenuFragment", languages.data.toString())

        myReyclerView = view.findViewById(R.id.languageMenuRecycler)
        myReyclerView.layoutManager = layoutManager

        mAdapter = RecyclerAdapter(languages.data){
            val action = LanguageMenuFragmentDirections.actionLanguageMenuFragmentToMainPageFragment(it)

            findNavController().navigate(action)

        }
        myReyclerView.adapter = mAdapter

    }


    private fun readJsonFromFile(fileName: String): String? {
        var json: String? = null
        try{

            json = context?.assets?.open("languagesList.json")
                ?.bufferedReader()
                .use { (it?.readText() ?: String).toString() }

        } catch (e: IOException) {
            e.printStackTrace()
        }
        return json
    }

}