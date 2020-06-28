package com.example.kidgeek

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class AnimalFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.animal_layout_page, container, false)
        val button = rootView.findViewById<Button>(R.id.animal_button)
        button.setOnClickListener() {

        }
        return rootView
    }
}