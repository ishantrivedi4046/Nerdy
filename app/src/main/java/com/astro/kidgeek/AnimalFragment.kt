package com.astro.kidgeek

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
                R.drawable.list_lion_test,
                R.drawable.list_mercury_back,
                "Lion",
                "Lion is the king of the jungle",
                R.string.animal_head1,
                R.string.animal_head2,
                R.string.animal_head1_text_lion,
                R.string.animal_head2_text_lion,
                R.string.lion_fact1,
                R.string.lion_fact2,
                R.string.lion_fact3,
                R.string.lion_fact4,
                R.string.lion_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_tiger_test,
                R.drawable.list_venus_back,
                "Tiger",
                "Tiger is the biggest species of the cat family",
                R.string.animal_head1,
                R.string.animal_head2,
                R.string.animal_head1_text_tiger,
                R.string.animal_head2_text_tiger,
                R.string.tig_fact1,
                R.string.tig_fact2,
                R.string.tig_fact3,
                R.string.tig_fact4,
                R.string.tig_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_giraff_test,
                R.drawable.list_saturn_back,
                "Giraffe",
                "Giraffes are the tallest land animals on earth",
                R.string.animal_head1,
                R.string.animal_head2,
                R.string.animal_head1_text_gir,
                R.string.animal_head2_text_gir,
                R.string.g_fact1,
                R.string.g_fact2,
                R.string.g_fact3,
                R.string.g_fact4,
                R.string.g_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_rabbit_test,
                R.drawable.rabbit_list_back,
                "Rabbit",
                "Rabbits are born with their eyes closed and without fur",
                R.string.animal_head1,
                R.string.animal_head2,
                R.string.animal_head1_text_rabbit,
                R.string.animal_head2_text_rabbit,
                R.string.rab_fact1,
                R.string.rab_fact2,
                R.string.rab_fact3,
                R.string.rab_fact4,
                R.string.rab_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_hippo_test,
                R.drawable.hippo_list_back,
                "Hippo",
                "Hippopotamus is generally considered the third largest land mammal",
                R.string.animal_head1,
                R.string.animal_head2,
                R.string.animal_head1_text_hippo,
                R.string.animal_head2_text_hippo,
                R.string.hip_fact1,
                R.string.hip_fact2,
                R.string.hip_fact3,
                R.string.hip_fact4,
                R.string.hip_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_panda_test,
                R.drawable.list_mars_back,
                "Panda",
                "Giant panda does not hibernate but will shelter in caves or hollow trees in very cold weather",
                R.string.animal_head1,
                R.string.animal_head2,
                R.string.animal_head1_text_panda,
                R.string.animal_head2_text_panda,
                R.string.panda_fact1,
                R.string.panda_fact2,
                R.string.panda_fact3,
                R.string.panda_fact4,
                R.string.panda_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_leo_test,
                R.drawable.list_earth_back,
                "Leopard",
                "Leopard’s tail is just about as long as its entire body",
                R.string.animal_head1,
                R.string.animal_head2,
                R.string.animal_head1_text_leo,
                R.string.animal_head2_text_leo,
                R.string.leo_fact1,
                R.string.leo_fact2,
                R.string.leo_fact3,
                R.string.leo_fact4,
                R.string.leo_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_bear_bear,
                R.drawable.list_uranus_back,
                "Bear",
                "Unlike many mammals, bears can see in color",
                R.string.animal_head1,
                R.string.animal_head2,
                R.string.animal_head1_text_bear,
                R.string.animal_head2_text_bear,
                R.string.bear_fact1,
                R.string.bear_fact2,
                R.string.bear_fact3,
                R.string.bear_fact4,
                R.string.bear_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_pig_test,
                R.drawable.list_saturn_back,
                "Pig",
                "Pigs are intelligent animals.",
                R.string.animal_head1,
                R.string.animal_head2,
                R.string.animal_head1_text_pig,
                R.string.animal_head2_text_pig,
                R.string.pig_fact1,
                R.string.pig_fact2,
                R.string.pig_fact3,
                R.string.pig_fact4,
                R.string.pig_fact5
            )
        )
        dataList.add(
            Data(
                R.drawable.list_elephant_test,
                R.drawable.elephant_list_back,
                "Elephant",
                "Elephants can swim,they use their trunk to breathe like a snorkel in deep water",
                R.string.animal_head1,
                R.string.animal_head2,
                R.string.animal_head1_text_ele,
                R.string.animal_head2_text_ele,
                R.string.e_fact1,
                R.string.e_fact2,
                R.string.e_fact3,
                R.string.e_fact4,
                R.string.e_fact5
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
            putExtra("ANIMAL", true)
            putExtra("PLANET", false)
            putExtra("LIST_BACKGROUND", R.drawable.ic_animal_list_back_three)
        }
        startActivity(intent)
    }
}