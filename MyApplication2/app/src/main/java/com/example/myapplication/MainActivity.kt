package com.example.myapplication

import android.os.Bundle

import android.content.Intent
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val LoginBtm = findViewById<Button>(R.id.button2)
        LoginBtm.setOnClickListener(::GoToPosts)

    }

    private fun GoToPosts(view:View) {
        val TargetActivity =  startActivity(Intent(this,TimeLine::class.java))
    }
}
