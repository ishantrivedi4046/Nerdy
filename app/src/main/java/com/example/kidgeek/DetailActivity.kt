package com.example.kidgeek

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.ViewCompat
import org.w3c.dom.Text

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
        val h1: TextView = findViewById(R.id.headLine_1)
        val h2: TextView = findViewById(R.id.headLine_2)
        val th1: TextView = findViewById(R.id.text_head1)
        val th2: TextView = findViewById(R.id.text_head2)
        val f1: TextView = findViewById(R.id.bullet_text_1)
        val f2: TextView = findViewById(R.id.bullet_text_2)
        val f3: TextView = findViewById(R.id.bullet_text_3)
        val f4: TextView = findViewById(R.id.bullet_text_4)
        val f5: TextView = findViewById(R.id.bullet_text_5)
        val texttemp = findViewById<TextView>(R.id.text_head1)
        texttemp.text = getString(R.string.animal_head2)
        val trantitionName = intent?.getString("TrantionName 1")
        val trantitionNameBack = intent?.getString("TrantionName 2")
        ViewCompat.setTransitionName(imageView, trantitionName)
        ViewCompat.setTransitionName(imageViewBack, trantitionNameBack)
        val cur: Data? = intent?.getParcelable<Data>("DataItem")
        if (cur != null) {
            imageView.setImageResource(cur.imageId)
            imageViewBack.setImageResource(cur.imageBackgroundId)
            h1.text = getString(cur.head1)
            h2.text = getString(cur.head2)
            th1.text = getString(cur.h1text)
            th2.text = getString(cur.h2text)
            f1.text = getText(cur.f1)
            f2.text = getText(cur.f2)
            f3.text = getText(cur.f3)
            f4.text = getText(cur.f4)
            f5.text = getText(cur.f5)
        }
        val button = findViewById<ImageView>(R.id.detail_image_back)
        button.setOnClickListener() {
            finishAfterTransition()
        }
    }
}