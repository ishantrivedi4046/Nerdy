package com.example.kidgeek

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import java.nio.InvalidMarkException

class RecycleViewAdapter(
    val planet: Boolean,
    val dataList: ArrayList<Data>,
    val itemClick: ItemClickListener
) :
    RecyclerView.Adapter<RecycleViewAdapter.RecycleViewHolder>() {
    class RecycleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView = itemView.findViewById(R.id.image_front)
        var imageBackground: ImageView = itemView.findViewById(R.id.image_back)
        var textName: TextView = itemView.findViewById(R.id.text_name)
        var textDesc: TextView = itemView.findViewById(R.id.text_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_layout, parent, false) as View
        return RecycleViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: RecycleViewHolder, position: Int) {
        val cur: Data = dataList[position]
        holder.imageView.setImageResource(cur.imageId)
        if (planet) {
            holder.imageView.requestLayout()
            holder.imageView.layoutParams.height =
                holder.imageView.resources.getDimension(R.dimen.planet_height).toInt()
        }
        holder.imageBackground.setImageResource(cur.imageBackgroundId)
        val st: String = cur.name + position
        val st1: String = cur.name + (position + 1)
        ViewCompat.setTransitionName(holder.imageView, st)
        ViewCompat.setTransitionName(holder.imageBackground, st1)
        holder.textName.text = cur.name
        holder.textDesc.text = cur.desc
        holder.itemView.setOnClickListener()
        {
            itemClick.onItemClick(holder.imageView, holder.imageBackground, cur,position)
        }
    }
}