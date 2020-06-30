package com.example.kidgeek

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class PlanetFragment : Fragment() {
    private var dataList: ArrayList<Data> = ArrayList()

    init {
        dataList.add(
            Data(
                R.drawable.ic_list_earth,
                R.drawable.list_earth_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_list_mercury,
                R.drawable.list_mercury_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_list_mars,
                R.drawable.list_mars_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_list_jupiter,
                R.drawable.list_jupiter_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_list_neptune,
                R.drawable.list_neptune_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_list_venus,
                R.drawable.list_venus_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_list_uranus,
                R.drawable.list_uranus_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_saturn,
                R.drawable.list_saturn_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.planet_layout_file, container, false)
        val button = rootView.findViewById<Button>(R.id.planet_button)
        button.setOnClickListener() {
            startNewActivity()
        }
        return rootView
    }

    private fun startNewActivity() {
        val intent = Intent(activity, RecycleViewActivity::class.java).apply {
            putExtra(
                "My ArrayList",
                dataList
            )
            putExtra("ANIMAL", false)
            putExtra("PLANET", true)
            putExtra("LIST_BACKGROUND", R.drawable.ic_planet_list_back)
        }
        startActivity(intent)
    }
}