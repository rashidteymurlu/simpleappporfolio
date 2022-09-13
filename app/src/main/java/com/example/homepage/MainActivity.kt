package com.example.homepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_aboutmepage.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //whenclickicon
        aboutmeicon.setOnClickListener {
            val intent = Intent(this,aboutmepage::class.java)
            startActivity(intent)
        }

        contacticon.setOnClickListener {
            val intent = Intent(this,contact::class.java)
            startActivity(intent)
        }
        digitalskillsicon.setOnClickListener {
            val intent = Intent(this,digitalskillspage::class.java)
            startActivity(intent)
        }
        languageicon.setOnClickListener {
            val intent = Intent(this,languageskillspage::class.java)
            startActivity(intent)
        }
        eduicon.setOnClickListener {
            val intent = Intent(this,educationtraningpage::class.java)
            startActivity(intent)
        }
        workicon.setOnClickListener {
            val intent = Intent(this,workexperiencepage::class.java)
            startActivity(intent)
        }



        //whenclickbutton
        aboutmebutton.setOnClickListener {
            val intent = Intent(this,aboutmepage::class.java)
            startActivity(intent)
        }

        contactbutton.setOnClickListener {
            val intent = Intent(this,contact::class.java)
            startActivity(intent)
        }
        digitalskillsbutton.setOnClickListener {
            val intent = Intent(this,digitalskillspage::class.java)
            startActivity(intent)
        }
        languageskillsbutton.setOnClickListener {
            val intent = Intent(this,languageskillspage::class.java)
            startActivity(intent)
        }
        eduandtraningbutton.setOnClickListener {
            val intent = Intent(this,educationtraningpage::class.java)
            startActivity(intent)
        }
        workexbutton.setOnClickListener {
            val intent = Intent(this,workexperiencepage::class.java)
            startActivity(intent)
        }

    }
}