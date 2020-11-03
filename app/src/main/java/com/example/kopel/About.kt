package com.example.kopel

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.about.*

@SuppressLint("Registered")
class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)
        getMainActivity()
    }

    private fun getMainActivity(){
        iv_back.setOnClickListener {
            finish()
        }
    }
}
