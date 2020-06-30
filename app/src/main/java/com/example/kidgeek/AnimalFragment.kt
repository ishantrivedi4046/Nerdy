package com.example.kidgeek

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class AnimalFragment : Fragment() {
    private var dataList: ArrayList<Data> = ArrayList()

    init {
        dataList.add(
            Data(
                R.drawable.ic_list_lion,
                R.drawable.list_mercury_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_list_tiger,
                R.drawable.list_venus_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_list_giraff_inverted,
                R.drawable.list_saturn_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_list_rabbit,
                R.drawable.rabbit_list_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_hippo,
                R.drawable.hippo_list_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_list_panda,
                R.drawable.list_mars_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_list_leo,
                R.drawable.list_earth_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_list_bear,
                R.drawable.list_uranus_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_list_pig,
                R.drawable.list_saturn_back,
                "Hippo",
                "Hippo is very Large."
            )
        )
        dataList.add(
            Data(
                R.drawable.ic_list_elephant,
                R.drawable.elephant_list_back,
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
        val rootView = inflater.inflate(R.layout.animal_layout_page, container, false)
        val button = rootView.findViewById<Button>(R.id.animal_button)
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
            putExtra("ANIMAL",true)
            putExtra("PLANET", false)
            putExtra("LIST_BACKGROUND",R.drawable.ic_animal_list_back_three)
        }
        startActivity(intent)
    }
}