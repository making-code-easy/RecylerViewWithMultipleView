package com.example.recylerview.adapter.Viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.recylerview.model.Texts

abstract class AbstractViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

     abstract fun bindView(s: ArrayList<Texts>,
                           position: Int)
}