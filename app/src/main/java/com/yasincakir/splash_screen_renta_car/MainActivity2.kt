package com.yasincakir.splash_screen_renta_car

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    lateinit var rightanim : Animation
    lateinit var leftanim : Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        rightanim=AnimationUtils.loadAnimation(this,R.anim.right_animation)
        leftanim=AnimationUtils.loadAnimation(this,R.anim.left_animation)



        imageView.setAnimation(rightanim)
        txtwelcome.setAnimation(leftanim)


    }



    fun turnBack(view : View) {

        var intent=Intent(this,loginActivity::class.java)
        startActivity(intent)
        finish()

    }



}