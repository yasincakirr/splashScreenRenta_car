package com.yasincakir.splash_screen_renta_car.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.navigation.Navigation
import com.yasincakir.splash_screen_renta_car.R
import com.yasincakir.splash_screen_renta_car.databinding.FragmentAnasayfaBinding


class anasayfaFragment : Fragment() {
    lateinit var rightanim : Animation
    lateinit var leftanim : Animation
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)



        rightanim= AnimationUtils.loadAnimation(requireContext(),R.anim.right_animation)
        leftanim= AnimationUtils.loadAnimation(requireContext(),R.anim.left_animation)



        binding.imageView.setAnimation(rightanim)
        binding.txtwelcome.setAnimation(leftanim)


        binding.buttonLogin.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.geriDonus)
        }




        return binding.root
    }

}