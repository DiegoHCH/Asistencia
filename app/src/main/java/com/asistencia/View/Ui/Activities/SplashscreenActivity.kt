package com.asistencia.View.Ui.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.asistencia.R
import kotlinx.android.synthetic.main.activity_splashscreen.*

class SplashscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val animacion = AnimationUtils.loadAnimation(this, R.anim.animacion)
        logoIpucImageView.startAnimation(animacion)
        val intent = Intent(this, LoginActivity::class.java)

        animacion.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                println("")
            }

            override fun onAnimationEnd(animation: Animation?) {
                startActivity(intent)
                finish()
            }

            override fun onAnimationRepeat(animation: Animation?) {
                println("")
            }

        })
    }
}