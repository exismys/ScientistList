package com.example.scientistlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scientistList: ListView = findViewById(R.id.scientist_type_view)
        scientistList.setOnItemClickListener {parent, view, position, id ->
            if (position == 0) {
                val intent = Intent(this@MainActivity, ScientistList::class.java)
                startActivity(intent)
            }
        }
    }
}