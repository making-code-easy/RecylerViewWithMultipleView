package com.example.recylerview

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.recylerview.adapter.Viewholder.AbstractViewHolder
import com.example.recylerview.adapter.Viewholder.Viewholder1
import com.example.recylerview.adapter.Viewholder.Viewholder2
import com.example.recylerview.adapter.Viewholder.Viewholder3

class ViewFactory {

   private val viewMap = mapOf(
        "one" to R.layout.layout_vh1,
        "two" to R.layout.layout_vh2,
        "three" to R.layout.layout_vh3
    )
   private val holderMap = mapOf(
        R.layout.layout_vh1 to ::Viewholder1,
        R.layout.layout_vh2 to ::Viewholder2,
        R.layout.layout_vh3 to ::Viewholder3
    )


    fun getViewType(type: String): Int {
        return viewMap[type] !!
    }

    fun getViewHolder(parent: ViewGroup, viewType: Int): AbstractViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            viewType,
            parent,
            false
        )
        return holderMap[viewType]?.call(view) !!
    }
}