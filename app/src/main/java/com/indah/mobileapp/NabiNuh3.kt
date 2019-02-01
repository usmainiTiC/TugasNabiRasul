package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiNuh3 : AppCompatActivity() {
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_nuh3)

        b_home=findViewById(R.id.home_nuh3)
        b_home.setOnClickListener{
            startActivity(Intent(this,Home::class.java))
        }

    }
}
