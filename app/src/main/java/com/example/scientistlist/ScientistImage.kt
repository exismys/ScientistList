package com.example.scientistlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ScientistImage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scientist_image)

        val imageView1: ImageView = findViewById(R.id.scientist_image_view_1)
        val imageView2: ImageView = findViewById(R.id.scientist_image_view_2)
        val scientistId = intent.extras?.get("scientistid") as Int
        imageView1.setImageResource(Scientist.scientistList[scientistId].imageId1)
        imageView2.setImageResource(Scientist.scientistList[scientistId].imageId2)
    }
}