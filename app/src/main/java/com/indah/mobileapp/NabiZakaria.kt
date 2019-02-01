package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiZakaria : AppCompatActivity() {
    private lateinit var b_zakaria2:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_zakaria)

        b_home=findViewById(R.id.home_zakaria1)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        b_zakaria2=findViewById(R.id.t_nextzakaria2)
        b_zakaria2.setOnClickListener{
            startActivity(Intent(this,NabiZakaria2::class.java))
        }

    }
}
