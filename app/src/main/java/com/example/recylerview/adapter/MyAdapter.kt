package com.example.recylerview.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recylerview.adapter.Viewholder.AbstractViewHolder
import com.example.recylerview.ViewFactory
import com.example.recylerview.model.Texts

class MyAdapter : RecyclerView.Adapter<AbstractViewHolder>() {

    private var mList: ArrayList<Texts> = ArrayList()
    private val viewFactory = ViewFactory()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AbstractViewHolder {
        return viewFactory.getViewHolder(parent, viewType)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: AbstractViewHolder, position: Int) {
        holder.bindView(mList, position)
    }

    override fun getItemViewType(position: Int): Int {
        return viewFactory.getViewType(mList[position].viewType)
    }

    fun setList(list: ArrayList<Texts>) {
        mList.addAll(list)
        notifyDataSetChanged()
    }


}