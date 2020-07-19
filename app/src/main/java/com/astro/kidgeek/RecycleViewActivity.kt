package com.astro.kidgeek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.view.View
import android.view.WindowManager
import android.widget.FrameLayout
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import androidx.core.view.ViewCompat

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class RecycleViewActivity : AppCompatActivity(), ItemClickListener {
    private val SHARED_ITEM: String = "DataItem"
    private val SHARED_ITEM_TRANTITION_NAME_1: String = "TrantionName 1"
    private val SHARED_ITEM_TRANTITION_NAME_2: String = "TrantionName 2"
    private var animal: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_recycle_view)
        val recycleView: RecyclerView = findViewById(R.id.master_recycle)
        recycleView.layoutManager = LinearLayoutManager(this)
        val frameLayout = findViewById<FrameLayout>(R.id.master_container_frame)
        val intent_value = intent.extras
        var isPlanet: Boolean = false
        if (intent_value != null) {
            animal = intent_value.getBoolean("ANIMAL")
            isPlanet = intent_value.getBoolean("PLANET")
            if (!animal) {
                frameLayout.setBackgroundResource(intent_value.getInt("LIST_BACKGROUND"))
                recycleView.setBackgroundResource(intent_value.getInt("LIST_BACKGROUND"))
            } else {
                val animalImageView: ImageView = findViewById(R.id.animal_list_back_image)
                animalImageView.setImageResource(intent_value.getInt("LIST_BACKGROUND"))
            }
        }
        val text_head = findViewById<TextView>(R.id.activity_head)

        if (animal) {
            text_head.text = getString(R.string.RHanimal)
            text_head.setTextColor(resources.getColor(R.color.earth_back))
        } else if (isPlanet) {
            text_head.text = getString(R.string.RHplanets)
        } else {
            text_head.text = getString(R.string.RHveg)
            text_head.setTextColor(resources.getColor(R.color.veg_button_back))
        }

        val list: ArrayList<Data> =
            intent_value?.getParcelableArrayList<Data>("My ArrayList") as ArrayList<Data>

        recycleView.adapter = RecycleViewAdapter(isPlanet, list, this)
        val back_button: ImageView = findViewById(R.id.back_button)
        back_button.setOnClickListener() {
            finish()
        }
    }

    override fun onItemClick(
        imageView1: ImageView,
        imageView2: ImageView,
        curData: Data,
        pos: Int
    ) {
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("Animal", animal)
            putExtra("Position", pos)
            putExtra(SHARED_ITEM, curData)
            putExtra(SHARED_ITEM_TRANTITION_NAME_1, ViewCompat.getTransitionName(imageView1))
            putExtra(SHARED_ITEM_TRANTITION_NAME_2, ViewCompat.getTransitionName(imageView2))
        }
        val p1 = Pair<View, String>(imageView1 as View, ViewCompat.getTransitionName(imageView1))
        val p2 = Pair<View, String>(imageView2 as View, ViewCompat.getTransitionName(imageView2))
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, p1, p2)
        startActivity(intent, options.toBundle())
    }
}