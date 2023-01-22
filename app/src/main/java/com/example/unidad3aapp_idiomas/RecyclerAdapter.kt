package com.example.unidad3aapp_idiomas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val mDataSet: List<String>) : RecyclerView.Adapter<RecyclerAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_block_cards, parent, false)
        return MainViewHolder(v)
    }
    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val data = mDataSet.get(position)
        holder.bindItems(data)
    }
    override fun getItemCount(): Int {
        return mDataSet.size
    }
    inner class MainViewHolder(var v: View) : RecyclerView.ViewHolder(v) {
        fun bindItems(data: String) {
            val myLanguage = v.findViewById<TextView>(R.id.languageChoice)
            myLanguage.text = data
        }
    }
}