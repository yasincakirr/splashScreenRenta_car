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
import com.yasincakir.splash_screen_renta_car.databinding.FragmentLoginBinding

class loginFragment : Fragment() {
    lateinit var rightAnim : Animation
    lateinit var leftAnim : Animation
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentLoginBinding.inflate(inflater, container, false)


        rightAnim= AnimationUtils.loadAnimation(requireContext(),R.anim.right_animation)
        leftAnim= AnimationUtils.loadAnimation(requireContext(),R.anim.left_animation)

       binding.logaImage.setAnimation(rightAnim)
       binding.logoName.setAnimation(leftAnim)


        binding.buttonKayit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.kayıtGecis)
        }


        return binding.root
    }









}