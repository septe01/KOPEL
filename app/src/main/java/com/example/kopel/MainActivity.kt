package com.example.kopel

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kopel.adapter.CardViewKopelAdapter
import com.example.kopel.model.Kopel
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var rvKopel: RecyclerView
    private val list: ArrayList<Kopel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getAbout()
        rvKopel     = findViewById(R.id.rv_kopel)

        list.addAll(KopelData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView(){
        rvKopel.layoutManager   = LinearLayoutManager(this)
        val cardViewAdapter     = CardViewKopelAdapter(list)
        rvKopel.adapter         = cardViewAdapter
    }

    private fun getAbout(){
        img_profile.setOnClickListener {
            startActivity(Intent(getContex(this),About::class.java))
        }
    }

    private fun getContex(context: Context): Context{
        return context
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

}
