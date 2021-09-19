package com.example.scientistlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ScientistList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scientist_list)

        val listAdapter =  ArrayAdapter(this, android.R.layout.simple_list_item_1, Scientist.scientistList)
        val listView: ListView = findViewById(R.id.scientist_list_view)
        listView.adapter = listAdapter
        listView.setOnItemClickListener { parent, view, position, id ->
                val intent = Intent(this@ScientistList, ScientistImage::class.java)
                intent.putExtra("scientistid", position)
                startActivity(intent)
        }
    }
}