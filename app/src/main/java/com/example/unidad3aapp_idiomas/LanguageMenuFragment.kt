package com.example.unidad3aapp_idiomas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class LanguageMenuFragment : Fragment() {

    var demoIdiomas = listOf("Español", "Inglés", "Alemán", "Francés", "Chino", "Japonés", "Italiano", "Portugués", "Polaco", "Ruso", "Sueco", "Árabe")
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
        myReyclerView = view.findViewById(R.id.languageMenuRecycler)
        myReyclerView.layoutManager = layoutManager
        mAdapter = RecyclerAdapter(demoIdiomas)
        myReyclerView.adapter = mAdapter




    }


}