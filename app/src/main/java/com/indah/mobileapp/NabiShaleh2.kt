package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiShaleh2 : AppCompatActivity() {
    private lateinit var b_shaleh3:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_shaleh2)

        b_shaleh3=findViewById(R.id.t_nextshaleh3)
        b_shaleh3.setOnClickListener{
            startActivity(Intent(this,NabiShaleh3::class.java))
        }
        b_home=findViewById(R.id.home_saleh2)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

    }
}
