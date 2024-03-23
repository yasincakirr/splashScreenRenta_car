package com.yasincakir.splash_screen_renta_car

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.view.*

class loginActivity : AppCompatActivity() {

    lateinit var rightAnim : Animation
    lateinit var leftAnim : Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


    rightAnim=AnimationUtils.loadAnimation(this,R.anim.right_animation)
    leftAnim=AnimationUtils.loadAnimation(this,R.anim.left_animation)


    loga_image.setAnimation(rightAnim)
    logo_name.setAnimation(leftAnim)



    }


    fun giris(view : View){


        if(username_til.username.text.toString() == ""){

            username_til.error="Metin Boş Dödürülemez"
            username_til.isErrorEnabled=true

        }
        else{
            username_til.isErrorEnabled=false
        }


        if(password_til.password.text.toString() == "")
        {

            password_til.error="Metin Boş Döndürülemez"
            password_til.isErrorEnabled=true
        }


        else{
            password_til.isErrorEnabled=false
        }

    }






    fun newUser(view : View){

        var intent= Intent(this,MainActivity2::class.java)

        startActivity(intent)
        finish()

    }


}