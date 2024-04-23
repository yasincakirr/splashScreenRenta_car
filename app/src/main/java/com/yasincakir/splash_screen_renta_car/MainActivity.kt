package com.yasincakir.splash_screen_renta_car

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var topAnim:Animation
    lateinit var bottomAnim:Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        window?.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        topAnim=AnimationUtils.loadAnimation(this,R.anim.top_animation)
        bottomAnim=AnimationUtils.loadAnimation(this,R.anim.bottom_animation)


        splashResmi.setAnimation(topAnim)
        textView.setAnimation(bottomAnim)
        textView2.setAnimation(bottomAnim)


        val handler=Handler()

        handler.postDelayed({

            var intent= Intent(this,loginActivity::class.java)
            startActivity(intent)
            finish()


        },3000)

    }
}