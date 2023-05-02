package com.example.zomatoclone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FoodImageRectangleAdapter(private  val imagearray:ArrayList<FoodData>,val context : Context):RecyclerView.Adapter<FoodImageRectangleAdapter.MyViewHolder>(){
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodImageRectangleAdapter.MyViewHolder {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.foodimagerectangle, parent, false)
         return MyViewHolder(view)
     }

     override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

         val item= imagearray[position]
        Glide.with(context).load(item.image_url).into(holder.rectangleImage)
         holder.foodname.text=item.description
     }

     override fun getItemCount(): Int {
         return imagearray.size
     }
     class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
     {
         val rectangleImage: ImageView =itemView.findViewById(R.id.image)
         val foodname: TextView =itemView.findViewById(R.id.description)
     }


 }







