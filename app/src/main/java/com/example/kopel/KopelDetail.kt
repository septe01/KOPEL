package com.example.kopel

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kopel_detail.*
import timber.log.Timber

class KopelDetail : AppCompatActivity() {

    companion object{
        const val TITLE: String   = "TITLE"
        const val IMG: String     = "IMG"
        const val DESC: String    = "DESC"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kopel_detail)
        getBack()

        tv_title_item.text = intent.getStringExtra(TITLE)
        tv_desc_item.text = intent.getStringExtra(DESC)
        val image         = intent.getIntExtra(IMG,0)

        iv_detailkopel.setImageResource(image)
    }

    private fun getBack() {
        iv_back.setOnClickListener {
            finish()
        }
    }

    fun getContext(context: Context): Context{
        return context
    }
}
