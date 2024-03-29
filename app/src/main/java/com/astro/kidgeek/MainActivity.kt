package com.astro.kidgeek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.viewpager.widget.ViewPager
import com.ToxicBakery.viewpager.transforms.*
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_main)
        val adapter = ViewAdapter(supportFragmentManager)
        val pager: ViewPager = findViewById(R.id.slider_pager)
        pager.adapter = adapter
        val tablayout = findViewById<TabLayout>(R.id.tab_layout)
        tablayout.setupWithViewPager(pager)
        pager.setPageTransformer(true, DrawerTransformer())
        val motionLayout = findViewById<MotionLayout>(R.id.motion_layout_viewpager)
        if (motionLayout != null) {
            pager.addOnPageChangeListener(motionLayout as ViewPager.OnPageChangeListener)
        }
    }
}