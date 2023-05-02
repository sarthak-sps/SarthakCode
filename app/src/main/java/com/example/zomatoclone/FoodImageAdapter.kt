package com.example.zomatoclone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FoodImageAdapter(private val mydataSet:ArrayList<FoodData>,val context : Context):RecyclerView.Adapter<FoodImageAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val circleImage: ImageView =itemView.findViewById(R.id.foodimage)
        val foodname: TextView =itemView.findViewById(R.id.foodtext)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.foodimagecircle, parent, false)
        return MyViewHolder(view)
    }
    override fun getItemCount(): Int {
        return mydataSet.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item= mydataSet[position]
        // using glide library for showing the image from the image url
        Glide.with(context).load(item.image_url).into(holder.circleImage)
        holder.foodname.text = item.description
    }

}







