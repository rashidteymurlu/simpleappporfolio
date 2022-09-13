package com.example.homepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_aboutmepage.*
import kotlinx.android.synthetic.main.activity_aboutmepage.languageback
import kotlinx.android.synthetic.main.activity_languageskillspage.*

class languageskillspage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_languageskillspage)


        languageback.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}