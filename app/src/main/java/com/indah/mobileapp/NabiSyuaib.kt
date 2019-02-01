package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiSyuaib : AppCompatActivity() {
    private lateinit var b_syuaib2:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_syuaib)

        b_home=findViewById(R.id.home_syuaib1)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        b_syuaib2=findViewById(R.id.t_nextsyuaib2)
        b_syuaib2.setOnClickListener{
            startActivity(Intent(this,NabiSyuaib2::class.java))
        }

    }
}
