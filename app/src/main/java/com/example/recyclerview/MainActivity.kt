package com.example.recyclerview

import NamesRecyclerViewAdapter
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import students

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView=findViewById(R.id.rvNames)
        val view=LinearLayoutManager(this)
        recyclerView.layoutManager=view
        recyclerView.hasFixedSize()
        val common=mutableListOf<students>()
        common.add(students(name ))






    }
}