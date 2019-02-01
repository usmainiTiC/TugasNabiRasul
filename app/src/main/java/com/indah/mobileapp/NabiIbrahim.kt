package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiIbrahim : AppCompatActivity() {
    private lateinit var b_ibrahim2:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_ibrahim)

        b_ibrahim2=findViewById(R.id.t_ibrahim2)
        b_ibrahim2.setOnClickListener{
            startActivity(Intent(this,NabiIbrahim2::class.java))
        }
        b_home=findViewById(R.id.home_ibrahim1)
        b_home.setOnClickListener{
            startActivity(Intent(this,Home::class.java))
        }

    }
}
