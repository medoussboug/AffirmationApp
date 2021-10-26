package com.example.affirmationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationapp.adapter.ItemAdapter
import com.example.affirmationapp.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myData = DataSource().loadAffirmations()
        val recylerView = findViewById<RecyclerView>(R.id.recycler_view)
        recylerView.adapter = ItemAdapter(this, myData)
    }
}