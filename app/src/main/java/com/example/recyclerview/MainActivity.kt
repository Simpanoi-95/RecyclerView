package com.example.recyclerview

import NamesRecyclerViewAdapter
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNames.layoutManager = LinearLayoutManager(baseContext)

        val namesAdapter = NamesRecyclerViewAdapter(listOf("Andrew", "Pauline", "Sue", "Manuel", "Veronica", "Arthur", "Esther", "David", "Patience"))

        rvNames.adapter = namesAdapter






    }
}