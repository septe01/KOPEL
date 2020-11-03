package com.example.kopel.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.kopel.KopelDetail
import com.example.kopel.R
import com.example.kopel.model.Kopel

class CardViewKopelAdapter(private val listKopels: ArrayList<Kopel>): RecyclerView.Adapter<CardViewKopelAdapter.CardViewHolder>() {
    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgPhoto : ImageView    = itemView.findViewById(R.id.iv_Kopel)
        var tvName: TextView        = itemView.findViewById(R.id.tv_title_item)
        var tvDetail: TextView      = itemView.findViewById(R.id.tv_desc_item)

        var btnRead: Button         = itemView.findViewById((R.id.btn_read))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View      = LayoutInflater.from(parent.context).inflate(R.layout.item_kopel, parent, false)
        return CardViewHolder(view)
    }
    override fun getItemCount(): Int {
        return listKopels.size
    }
    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val kopel   = listKopels[position]

        Glide.with(holder.itemView.context)
            .load(kopel.photo)
            .apply(RequestOptions().override(250,300))
            .into(holder.imgPhoto)

        holder.tvName.text      = kopel.name
        holder.tvDetail.text    = kopel.detail

//        holder.btnRead.setOnClickListener{ Toast.makeText(holder.itemView.context,"Kamu memilih ${listKopels[holder.adapterPosition].photo}",Toast.LENGTH_SHORT).show()}
        holder.btnRead.setOnClickListener{
            val intent = Intent(holder.itemView.context,KopelDetail::class.java)

            intent.putExtra(KopelDetail.TITLE, listKopels[holder.adapterPosition].name)
            intent.putExtra(KopelDetail.DESC, listKopels[holder.adapterPosition].detail)
            intent.putExtra(KopelDetail.IMG, listKopels[holder.adapterPosition].photo)
//
            holder.itemView.context.startActivity(intent)
        }
    }
}
