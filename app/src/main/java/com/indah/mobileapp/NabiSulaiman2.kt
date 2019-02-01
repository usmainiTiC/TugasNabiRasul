package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiSulaiman2 : AppCompatActivity() {
    private lateinit var b_sulaiman3:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_sulaiman2)

        b_home=findViewById(R.id.home_sulaiman2)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        b_sulaiman3=findViewById(R.id.t_nextsulaiman3)
        b_sulaiman3.setOnClickListener{
            startActivity(Intent(this,NabiSuaiman3::class.java))
        }

    }
}
