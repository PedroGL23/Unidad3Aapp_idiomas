package com.example.unidad3aapp_idiomas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.unidad3aapp_idiomas.R.*


class MainActivity : AppCompatActivity() {

    var demoIdiomas = listOf("Español", "Inglés", "Alemán", "Francés", "Chino", "Japonés", "Italiano", "Portugués", "Polaco")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        //val mAdapter = RecyclerAdapter(demoIdiomas)
        //languageMenuRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //mainRecyclerView.adapter = mAdapter

    }


}