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
                R.drawable.list_earth,
                R.drawable.list_earth_back,
                "Earth",
                "Earth is the only planet whose english name does not derive from Greek or Roman mythology",
                R.string.planet_head1,
                R.string.planet_head2,
                R.string.planet_head1_text_earth,
                R.string.planet_head2_text_earth,
                R.string.earth_fact1,
                R.string.earth_fact2,
                R.string.earth_fact3,
                R.string.earth_fact4,
                R.string.earth_fact5
                )
        )
        dataList.add(
            Data(
                R.drawable.list_mercury,
                R.drawable.list_mercury_back,
                "Mercury",
                "Mercury is named after the Roman god of commerce, travel, and thievery, Hermes",
                R.string.planet_head1,
                R.string.planet_head2,
                R.string.planet_head1_text_mercury,
                R.string.planet_head2_text_mercury,
                R.string.mercury_fact1,
                R.string.mercury_fact2,
                R.string.mercury_fact3,
                R.string.mercury_fact4,
                R.string.mercury_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_mars,
                R.drawable.list_mars_back,
                "Mars",
                "Mars is named after the Roman god of war, Ares",
                R.string.planet_head1,
                R.string.planet_head2,
                R.string.planet_head1_text_mars,
                R.string.planet_head2_text_mars,
                R.string.mars_fact1,
                R.string.mars_fact2,
                R.string.mars_fact3,
                R.string.mars_fact4,
                R.string.mars_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_jupiter,
                R.drawable.list_jupiter_back,
                "Jupiter",
                "Jupiter is named after the supreme Roman god, Zeus",
                R.string.planet_head1,
                R.string.planet_head2,
                R.string.planet_head1_text_jupiter,
                R.string.planet_head2_text_jupiter,
                R.string.jupiter_fact1,
                R.string.jupiter_fact2,
                R.string.jupiter_fact3,
                R.string.jupiter_fact4,
                R.string.jupiter_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_neptune,
                R.drawable.list_neptune_back,
                "Neptune",
                "Neptune is named after the Roman god of the sea, Poseidon",
                R.string.planet_head1,
                R.string.planet_head2,
                R.string.planet_head1_text_neptune,
                R.string.planet_head2_text_neptune,
                R.string.neptune_fact1,
                R.string.neptune_fact2,
                R.string.neptune_fact3,
                R.string.neptune_fact4,
                R.string.neptune_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_venus,
                R.drawable.list_venus_back,
                "Venus",
                "Venus is named after the ancient Roman goddess of love and beauty, Aphrodite",
                R.string.planet_head1,
                R.string.planet_head2,
                R.string.planet_head1_text_venus,
                R.string.planet_head2_text_venus,
                R.string.venus_fact1,
                R.string.venus_fact2,
                R.string.venus_fact3,
                R.string.venus_fact4,
                R.string.venus_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_uranus,
                R.drawable.list_uranus_back,
                "Uranus",
                " Uranus is named after the ancient Greek God of the heavens, grandFather of Zeus",
                R.string.planet_head1,
                R.string.planet_head2,
                R.string.planet_head1_text_uranus,
                R.string.planet_head2_text_uranus,
                R.string.uranus_fact1,
                R.string.uranus_fact2,
                R.string.uranus_fact3,
                R.string.uranus_fact4,
                R.string.uranus_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_saturn,
                R.drawable.list_saturn_back,
                "Saturn",
                "Saturn is named after the Roman god of agriculture, Cronus, father of zeus",
                R.string.planet_head1,
                R.string.planet_head2,
                R.string.planet_head1_text_saturn,
                R.string.planet_head2_text_saturn,
                R.string.saturn_fact1,
                R.string.saturn_fact2,
                R.string.saturn_fact3,
                R.string.saturn_fact4,
                R.string.saturn_fact5
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