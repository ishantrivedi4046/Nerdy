package com.example.kidgeek

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class PlanetFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.planet_layout_file, container, false)
        val button = rootView.findViewById<Button>(R.id.planet_button)
        button.setOnClickListener() {

        }
        return rootView
    }
}