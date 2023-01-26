package com.example.unidad3aapp_idiomas

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.squareup.picasso.Picasso


class MainPageFragment : Fragment() {

    val args: MainPageFragmentArgs by navArgs()
    private var _binding: MainPageFragment? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_page, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var title = view.findViewById<TextView>(R.id.languageTitle)
        var picture = view.findViewById<ImageView>(R.id.mPageImage)

        title.text = args.languageSelected
        Picasso.get().load(args.pictureToShow).into(picture)

        Log.i("probando títuloooooo", args.languageSelected)

        Log.i("probando fotooooooo", args.pictureToShow)

    }
}