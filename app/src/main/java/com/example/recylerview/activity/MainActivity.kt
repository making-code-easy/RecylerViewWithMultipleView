package com.example.recylerview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.recylerview.adapter.MyAdapter
import com.example.recylerview.R
import com.example.recylerview.model.Texts


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        myAdapter = MyAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )


        val list:ArrayList<Texts> = ArrayList()
        list.add(Texts("one", "one"))
        list.add(Texts("three", "one", "two", "three"))
        list.add(Texts("two", "one", "two"))
        list.add(Texts("one", "one"))
        list.add(Texts("two", "one", "two"))
        list.add(Texts("three", "one", "two", "three"))

        myAdapter.setList(list)
    }
}
