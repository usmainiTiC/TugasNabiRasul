package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiYusuf3 : AppCompatActivity() {
    private lateinit var b_yusuf4:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_yusuf3)

        b_home=findViewById(R.id.home_yus3)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        b_yusuf4=findViewById(R.id.t_nextyusuf4)
        b_yusuf4.setOnClickListener{
            startActivity(Intent(this,NabiYusuf4::class.java))
        }

    }
}
