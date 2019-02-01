package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiSuaiman3 : AppCompatActivity() {
    private lateinit var b_sulaiman4:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_suaiman3)

        b_home=findViewById(R.id.home_sulaiman3)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        b_sulaiman4=findViewById(R.id.t_nextsulaiman4)
        b_sulaiman4.setOnClickListener{
            startActivity(Intent(this,NabiSulaiman4::class.java))
        }

    }
}
