package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiYusuf2 : AppCompatActivity() {
    private lateinit var b_yusuf3:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_yusuf2)

        b_home=findViewById(R.id.home_yus2)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        b_yusuf3=findViewById(R.id.t_nextyusuf3)
        b_yusuf3.setOnClickListener{
            startActivity(Intent(this,NabiYusuf3::class.java))
        }

    }
}
