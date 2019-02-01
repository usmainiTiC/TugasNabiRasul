package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiAyub : AppCompatActivity() {
    private lateinit var b_ayub2:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_ayub)

        b_home=findViewById(R.id.home_ayub1)
        b_home.setOnClickListener{
            startActivity(Intent(this,Home::class.java))
        }
        b_ayub2=findViewById(R.id.t_nextayub2)
        b_ayub2.setOnClickListener{
            startActivity(Intent(this,NabiAyub2::class.java))
        }

    }
}
