package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiNuh2 : AppCompatActivity() {
    private lateinit var b_nuh3:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_nuh2)

        b_home=findViewById(R.id.home_nuh2)
        b_home.setOnClickListener{
            startActivity(Intent(this,Home::class.java))
        }
        b_nuh3=findViewById(R.id.t_nextnuh3)
        b_nuh3.setOnClickListener{
            startActivity(Intent(this,NabiNuh3::class.java))
        }

    }
}
