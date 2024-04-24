package com.yasincakir.splash_screen_renta_car.ui.fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.yasincakir.splash_screen_renta_car.R
import com.yasincakir.splash_screen_renta_car.data.entity.Arabalar
import com.yasincakir.splash_screen_renta_car.databinding.FragmentArabaListesiBinding
import com.yasincakir.splash_screen_renta_car.ui.adapter.ArabaAdapter


class ArabaListesiFragment : Fragment() {

 private lateinit var binding: FragmentArabaListesiBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        binding = FragmentArabaListesiBinding.inflate(inflater, container, false)

        binding.toolbar.title="Araba Listesi"
        binding.toolbar.setTitleTextColor(Color.WHITE)

        binding.arabaRv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        var arabalistesi =ArrayList<Arabalar>()

        val araba1 = Arabalar(1,"ford1","araba1",20000)
        val araba2 = Arabalar(2,"ford2","araba2",15000)
        val araba3=Arabalar(3,"ford3","araba3",12000)
        val araba4 = Arabalar(1,"fiat","araba4",10000)
        val araba5 = Arabalar(2,"bmw1","araba5",21000)
        val araba6=Arabalar(3,"bmw2","araba6",17000)
        val araba7 = Arabalar(1,"audi1","araba7",14000)
        val araba8 = Arabalar(2,"audi2","araba8",19500)

        arabalistesi.add(araba1)
        arabalistesi.add(araba2)
        arabalistesi.add(araba3)
        arabalistesi.add(araba4)
        arabalistesi.add(araba5)
        arabalistesi.add(araba6)
        arabalistesi.add(araba7)
        arabalistesi.add(araba8)


        val Aadapter=ArabaAdapter(requireContext(),arabalistesi)

        binding.arabaRv.adapter = Aadapter


        return binding.root
    }

}