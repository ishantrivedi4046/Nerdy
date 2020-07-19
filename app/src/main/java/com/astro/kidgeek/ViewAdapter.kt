package com.astro.kidgeek

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewAdapter(private val fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PlanetFragment()
            1 -> AnimalFragment()
            else -> VegetableFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}