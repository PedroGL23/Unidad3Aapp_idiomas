package com.example.unidad3aapp_idiomas

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.unidad3aapp_idiomas.databinding.FragmentMainPageBinding
import com.squareup.picasso.Picasso


class MainPageFragment : Fragment() {

    val args: MainPageFragmentArgs by navArgs()
    private var _binding: FragmentMainPageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainPageBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.i("IMAGEN SELECCIONADO ----->", args.parameters.selectedLanguage.toString())
        Log.i("IDIOMA SELECCIONADO ----->", args.parameters.language.toString())
        val picture = view.findViewById<ImageView>(R.id.mPageImage)



        //Picasso.get().load(args.selectedlanguage.image).into(picture)
    }



}

