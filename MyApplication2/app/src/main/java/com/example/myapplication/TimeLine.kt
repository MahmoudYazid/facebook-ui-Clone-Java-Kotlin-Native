package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adaptors.settingAdaptorPosts
import com.example.myapplication.adaptors.settingAdaptorStories

class TimeLine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_line)
        val recyclerView: RecyclerView = findViewById(R.id.RecyclerViewTimeLine);
        recyclerView.adapter = settingAdaptorPosts()

        val recyclerViewStories: RecyclerView = findViewById(R.id.RecyclerViewStories);
        recyclerViewStories.adapter = settingAdaptorStories()



    }
}