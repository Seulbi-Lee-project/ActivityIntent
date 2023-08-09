package com.example.activityintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        var btn = findViewById<Button>(R.id.buttonFirstActivity)
        btn.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}