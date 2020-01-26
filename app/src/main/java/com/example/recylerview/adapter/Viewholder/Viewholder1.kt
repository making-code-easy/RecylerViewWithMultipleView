package com.example.recylerview.adapter.Viewholder

import android.view.View
import android.widget.TextView
import com.example.recylerview.R
import com.example.recylerview.model.Texts

class Viewholder1(itemView: View) : AbstractViewHolder(itemView) {

    private val textView: TextView = itemView.findViewById(R.id.text)

    override fun bindView(s: ArrayList<Texts>, position: Int) {
        textView.text = s.get(position).text1
    }
}