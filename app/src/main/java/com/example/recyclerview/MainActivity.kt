package com.example.recyclerview

import NamesRecyclerViewAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import students

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView=findViewById(R.id.etrvNames)
        val view=LinearLayoutManager(this)
        recyclerView.layoutManager=view
        recyclerView.hasFixedSize()
        val common=mutableListOf<students>()
        common.add(students("Mary","20.7.1990","sleeping"))

        val hi=NamesRecyclerViewAdapter(common)
        recyclerView.adapter =hi
    }
}