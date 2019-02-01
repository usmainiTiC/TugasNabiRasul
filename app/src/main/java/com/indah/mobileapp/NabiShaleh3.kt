package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiShaleh3 : AppCompatActivity() {
    private lateinit var b_shaleh4:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_shaleh3)

        b_shaleh4=findViewById(R.id.t_nextshaleh4)
        b_shaleh4.setOnClickListener{
            startActivity(Intent(this,NabiShaleh4::class.java))
        }
        b_home=findViewById(R.id.home_saleh3)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

    }
}
