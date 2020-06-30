package com.example.kidgeek

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class VegetableFragment : Fragment() {
    private var dataList: ArrayList<Data> = ArrayList()

    init {
        for (i in 0 until 10) {
            dataList.add(
                Data(
                    R.drawable.ic_hippo,
                    R.drawable.temp_image_back,
                    "Hippo",
                    "Hippo is very Large."
                )
            )
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.vegetable_layout_file, container, false)
        val button = rootView.findViewById<Button>(R.id.veg_button)
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
            putExtra("PLANET", false)
            putExtra("ANIMAL",false)
            putExtra("LIST_BACKGROUND",R.drawable.ic_veg_list_back)
        }
        startActivity(intent)
    }
}