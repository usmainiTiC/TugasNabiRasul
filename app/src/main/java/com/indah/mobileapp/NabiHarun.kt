package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiHarun : AppCompatActivity() {
    private lateinit var b_harun2:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_harun)

        b_harun2=findViewById(R.id.t_nextharun2)
        b_harun2.setOnClickListener{
            startActivity(Intent(this,NabiHarun2::class.java))
        }
        b_home=findViewById(R.id.home_harun)
        b_home.setOnClickListener{
            startActivity(Intent(this,Home::class.java))
        }

    }
}
