package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiSulaiman : AppCompatActivity() {
    private lateinit var b_sulaiman2:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_sulaiman)

        b_home=findViewById(R.id.home_sulaiman1)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        b_sulaiman2=findViewById(R.id.t_nextsulaiman2)
        b_sulaiman2.setOnClickListener{
            startActivity(Intent(this,NabiSulaiman2::class.java))
        }

    }
}
