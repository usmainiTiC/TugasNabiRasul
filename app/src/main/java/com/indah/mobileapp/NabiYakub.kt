package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiYakub : AppCompatActivity() {
    private lateinit var b_yakub2:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_yakub)

        b_home=findViewById(R.id.home_yakub1)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        b_yakub2=findViewById(R.id.t_nextyakub2)
        b_yakub2.setOnClickListener{
            startActivity(Intent(this,NabiYakub2::class.java))
        }

    }
}
