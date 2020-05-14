package com.kotlincourse.retrofit_getphotos.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kotlincourse.retrofit_getphotos.R
import com.kotlincourse.retrofit_getphotos.models.Photos

class PhotosAdapter(val photos: List<Photos>) : RecyclerView.Adapter<PhotosAdapter.PhotosViewHolder>() {

    class PhotosViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview) {
        val id:TextView = itemview.findViewById(R.id.tvId)
        val name: TextView = itemview.findViewById(R.id.tvName)
        val description: TextView = itemview.findViewById(R.id.tvDescription)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.photo_item, parent, false)
        return PhotosViewHolder(view)
    }

    override fun getItemCount(): Int {
        return photos.size
    }

    override fun onBindViewHolder(holder: PhotosViewHolder, position: Int) {
        holder.id.text = photos[position].id.toString()
        holder.name.text = photos[position].name
        holder.description.text = photos[position].description

    }
}