package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiZakaria2 : AppCompatActivity() {
    private lateinit var b_zakaria3: Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_zakaria2)

        b_home=findViewById(R.id.home_zakaria2)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        b_zakaria3=findViewById(R.id.t_nextzakaria3)
        b_zakaria3.setOnClickListener{
            startActivity(Intent(this,NabiZakaria3::class.java))
        }

    }
}
