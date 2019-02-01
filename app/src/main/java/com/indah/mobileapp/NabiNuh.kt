package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiNuh : AppCompatActivity() {
    private lateinit var b_nuh2:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_nuh)

        b_home=findViewById(R.id.home_nuh1)
        b_home.setOnClickListener{
            startActivity(Intent(this,Home::class.java))
        }
        b_nuh2=findViewById(R.id.t_nextnuh2)
        b_nuh2.setOnClickListener{
            startActivity(Intent(this,NabiNuh2::class.java))
        }
    }
}
