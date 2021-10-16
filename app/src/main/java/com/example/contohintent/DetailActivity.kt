package com.example.contohintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailActivity : AppCompatActivity() {

    lateinit var back: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        back = findViewById(R.id.buttonBack)

        back.setOnClickListener {
            onBackPressed()
        }
    }
}