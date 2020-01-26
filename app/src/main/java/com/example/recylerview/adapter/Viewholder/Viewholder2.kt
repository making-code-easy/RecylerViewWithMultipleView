package com.example.recylerview.adapter.Viewholder

import android.view.View
import android.widget.TextView
import com.example.recylerview.R
import com.example.recylerview.model.Texts

class Viewholder2(itemView: View) : AbstractViewHolder(itemView) {

    private val textView1: TextView = itemView.findViewById(R.id.text1)
    private val textView2: TextView = itemView.findViewById(R.id.text2)

    override fun bindView(s: ArrayList<Texts>, position: Int) {
        textView1.text = s.get(position).text1
        textView2.text = s.get(position).text2

    }
}