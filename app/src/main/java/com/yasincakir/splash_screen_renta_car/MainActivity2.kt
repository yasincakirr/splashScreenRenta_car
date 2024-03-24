package com.yasincakir.splash_screen_renta_car

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.view.*

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




    fun register(view: View){




        if(til_fullname.fullname.text.toString() == ""){

            til_fullname.error="Metin Boş Döndürülemez"
            til_fullname.isErrorEnabled=true
        }
        else{
            til_fullname.isErrorEnabled=false
        }



        if(til_username.usernamee.text.toString() == ""){
            til_username.error="Metin Boş Döndürülemez"
            til_username.isErrorEnabled=true
        }
        else{
            til_username.isErrorEnabled=false
        }





        if(til_email.emaill.text.toString() == ""){

            til_email.error="Metin Boş Döndürülemez"
            til_email.isErrorEnabled=true
        }
        else{
            til_email.isErrorEnabled=false
        }



        if(til_phoneNo.phoneNo.text.toString() == ""){
            til_phoneNo.error="Metin Boş Döndürülemez"
            til_phoneNo.isErrorEnabled=true
        }
        else{
            til_phoneNo.isErrorEnabled=false
        }






        if(til_sifre.sifre.text.toString() == ""){
            til_sifre.error="Metin Boş Döndürülemez"
            til_sifre.isErrorEnabled=true
        }
        else{
            til_sifre.isErrorEnabled=false
        }



    }






    fun turnBack(view : View) {

        var intent=Intent(this,loginActivity::class.java)
        startActivity(intent)
        finish()

    }



}