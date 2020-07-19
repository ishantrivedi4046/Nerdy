package com.astro.kidgeek

import android.widget.ImageView

interface ItemClickListener {
    fun onItemClick(imageView1: ImageView, imageView2: ImageView, curData: Data,pos:Int)
}