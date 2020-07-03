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
        dataList.add(
            Data(
                R.drawable.list_betroot,
                R.drawable.list_mercury_back,
                "Beetroot",
                "Beetroot contains betaine that relaxes the mind and is used to treat depression",
                R.string.veg_head1,
                R.string.veg_head2,
                R.string.v_head1_text_bet,
                R.string.v_head2_text_bet,
                R.string.b_fact1,
                R.string.b_fact2,
                R.string.b_fact3,
                R.string.b_fact4,
                R.string.b_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_corn,
                R.drawable.list_venus_back,
                "Corn",
                "Corn is called maize which is a native Taino word meaning \"sacred mother,\" or \"giver of life\"",
                R.string.veg_head1,
                R.string.veg_head2,
                R.string.v_head1_text_cor,
                R.string.v_head2_text_cor,
                R.string.co_fact1,
                R.string.co_fact2,
                R.string.co_fact3,
                R.string.co_fact4,
                R.string.co_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_turnip,
                R.drawable.list_saturn_back,
                "Turnip",
                "Turnip is a type of root vegetables that belongs to the mustard family. It originates from Europe",
                R.string.veg_head1,
                R.string.veg_head2,
                R.string.v_head1_text_tur,
                R.string.v_head2_text_tur,
                R.string.tur_fact1,
                R.string.tur_fact2,
                R.string.tur_fact3,
                R.string.tur_fact4,
                R.string.tur_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_tomato,
                R.drawable.elephant_list_back,
                "Tomato",
                "Tomato was domesticated in the ancient Aztec civilization",
                R.string.veg_head1,
                R.string.veg_head2,
                R.string.v_head1_text_to,
                R.string.v_head2_text_to,
                R.string.to_fact1,
                R.string.to_fact2,
                R.string.to_fact3,
                R.string.to_fact4,
                R.string.to_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_carrot,
                R.drawable.rabbit_list_back,
                "Carrot",
                "There are over 100 species of edible carrots today",
                R.string.veg_head1,
                R.string.veg_head2,
                R.string.v_head1_text_car,
                R.string.v_head2_text_car,
                R.string.car_fact1,
                R.string.car_fact2,
                R.string.car_fact3,
                R.string.car_fact4,
                R.string.car_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_onion,
                R.drawable.list_saturn_back,
                "Onion",
                "Onions are some of the oldest vegetables that were used by the first modern civilizations",
                R.string.veg_head1,
                R.string.veg_head2,
                R.string.v_head1_text_on,
                R.string.v_head2_text_on,
                R.string.on_fact1,
                R.string.on_fact2,
                R.string.on_fact3,
                R.string.on_fact4,
                R.string.on_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_potato,
                R.drawable.list_uranus_back,
                "Potato",
                "Potato is consisted for 20% solids and 80% of water",
                R.string.veg_head1,
                R.string.veg_head2,
                R.string.v_head1_text_po,
                R.string.v_head2_text_po,
                R.string.pot_fact1,
                R.string.pot_fact2,
                R.string.pot_fact3,
                R.string.pot_fact4,
                R.string.pot_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_eggplant,
                R.drawable.hippo_list_back,
                "Eggplant",
                "Eggplants are not REALLY vegetables, they’re berries",
                R.string.veg_head1,
                R.string.veg_head2,
                R.string.v_head1_text_egg,
                R.string.v_head2_text_egg,
                R.string.egg_fact1,
                R.string.egg_fact2,
                R.string.egg_fact3,
                R.string.egg_fact4,
                R.string.egg_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_cabbage,
                R.drawable.list_mars_back,
                "Cabbage",
                "Cabbage has been cultivated for longer than almost any other vegetable on record",
                R.string.veg_head1,
                R.string.veg_head2,
                R.string.v_head1_text_cab,
                R.string.v_head2_text_cab,
                R.string.cab_fact1,
                R.string.cab_fact2,
                R.string.cab_fact3,
                R.string.cab_fact4,
                R.string.cab_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_capcicum,
                R.drawable.list_earth_back,
                "Capsicum",
                "Capsicums originated in the Americas, but are now grown worldwide",
                R.string.veg_head1,
                R.string.veg_head2,
                R.string.v_head1_text_cap,
                R.string.v_head2_text_cap,
                R.string.cap_fact1,
                R.string.cap_fact2,
                R.string.cap_fact3,
                R.string.cap_fact4,
                R.string.cap_fact5
            )
        )
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