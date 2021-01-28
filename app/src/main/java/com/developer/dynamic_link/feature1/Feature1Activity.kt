package com.developer.dynamic_link.feature1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.developer.dynamic_link.R
import com.google.android.material.textfield.TextInputEditText

class Feature1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature1)

        val id = intent.getStringExtra("id")
        val editext = findViewById<TextInputEditText>(R.id.text_convite)
        editext.setText(id)
    }
}