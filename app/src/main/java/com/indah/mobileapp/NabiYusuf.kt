package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiYusuf : AppCompatActivity() {
    private lateinit var b_yusuf2:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_yusuf)

        b_home=findViewById(R.id.home_yus1)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        b_yusuf2=findViewById(R.id.t_nextyusuf2)
        b_yusuf2.setOnClickListener{
            startActivity(Intent(this,NabiYusuf2::class.java))
        }
    }
}
