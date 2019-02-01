package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiShaleh : AppCompatActivity() {
    private lateinit var b_shaleh2:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_shaleh)

        b_home=findViewById(R.id.home_saleh1)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        b_shaleh2=findViewById(R.id.t_nextshaleh2)
        b_shaleh2.setOnClickListener{
            startActivity(Intent(this,NabiShaleh2::class.java))
        }

    }
}
