package com.example.unidad3aapp_idiomas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RecyclerAdapter(private val languageCards: List<Languages>, var onClick: (Languages) -> Unit) : RecyclerView.Adapter<RecyclerAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_block_cards, parent, false)
        return MainViewHolder(v)
    }
    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val data = languageCards.get(position)
        holder.bindItems(data)

        holder.itemView.setOnClickListener{
            onClick(data)
        }
    }
    override fun getItemCount(): Int {
        return languageCards.size
    }
    inner class MainViewHolder(var v: View) : RecyclerView.ViewHolder(v) {
        fun bindItems(data: Languages) {
            val myLanguage = v.findViewById<TextView>(R.id.languageChoice)
            val myCardImage = v.findViewById<ImageView>(R.id.cardImage)
            myLanguage.text = data.language
            Picasso.get().load(data.image).into(myCardImage)
        }
    }
}