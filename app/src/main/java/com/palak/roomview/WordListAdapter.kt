package com.palak.roomview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WordListAdapter internal constructor(context: Context) : RecyclerView.Adapter<WordListAdapter.WordViewHolder>(){

    private val inflater = LayoutInflater.from(context)
    private var words = emptyList<Word>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        return WordViewHolder(inflater.inflate(R.layout.recyclerview_item,parent,false))
    }

    override fun getItemCount(): Int {
        return words.size
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {

        val current = words[position]
        holder.wordItemView.text = current.word
    }

    class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val wordItemView : TextView = itemView.findViewById(R.id.textView)
    }

    fun setWords(words : List<Word>){
        this.words = words
        notifyDataSetChanged()
    }

}