package com.example.homepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contact.*
import kotlinx.android.synthetic.main.activity_linkedinview.*

class linkedinview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linkedinview)

            weblinkedin.settings.javaScriptEnabled = true
            weblinkedin.loadUrl("https://www.linkedin.com/in/mirjavid-teymurov-673340195")

    }
}