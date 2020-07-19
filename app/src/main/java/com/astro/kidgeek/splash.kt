package com.astro.kidgeek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class splash : AppCompatActivity() {
    private val timer: Long = 5000
    lateinit var top: Animation
    lateinit var bottom: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_splash)
        val imageView = findViewById<ImageView>(R.id.image_splash)
        val image_logo = findViewById<ImageView>(R.id.brand_logo)
        top = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottom = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        imageView.animation = top
        image_logo.animation = bottom
        Handler().postDelayed(Runnable {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, timer)
    }
}