package com.example.kidgeek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import android.view.WindowManager
import android.widget.ImageView
import androidx.core.view.ViewCompat

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_detail)
        val intent: Bundle? = intent.extras
        val imageView = findViewById<ImageView>(R.id.imageView9)
        val imageViewBack = findViewById<ImageView>(R.id.detail_image_back)
        val trantitionName = intent?.getString("TrantionName 1")
        val trantitionNameBack = intent?.getString("TrantionName 2")
        ViewCompat.setTransitionName(imageView, trantitionName)
        ViewCompat.setTransitionName(imageViewBack, trantitionNameBack)
        val cur: Data? = intent?.getParcelable<Data>("DataItem")
        if (cur != null) {
            imageView.setImageResource(cur.imageId)
            imageViewBack.setImageResource(cur.imageBackgroundId)
        }
    }
}