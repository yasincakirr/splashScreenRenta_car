package com.yasincakir.splash_screen_renta_car.ui.fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.yasincakir.splash_screen_renta_car.R
import com.yasincakir.splash_screen_renta_car.databinding.FragmentArabaDetayBinding


class ArabaDetayFragment : Fragment() {

    private lateinit var binding: FragmentArabaDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentArabaDetayBinding.inflate(inflater, container, false)


        val bundle : ArabaDetayFragmentArgs by navArgs()
        val araba = bundle.araba

        binding.toolbar2.title = "${araba.ad}"
        binding.toolbar2.setTitleTextColor(Color.WHITE)


        binding.imageView2.setImageResource(
            resources.getIdentifier(araba.resim,"drawable",requireContext().packageName)
        )

        binding.textFiyat.text="${araba.fiyat} tl"




        return binding.root
    }

}