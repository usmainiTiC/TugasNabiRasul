package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiDaud2 : AppCompatActivity() {
    private lateinit var b_daud3:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_daud2)

        b_daud3=findViewById(R.id.t_nextdaud3)
        b_daud3.setOnClickListener{
            startActivity(Intent(this,NabiDaud3::class.java))
        }
        b_home=findViewById(R.id.home_daud2)
        b_home.setOnClickListener{
            startActivity(Intent(this,Home::class.java))
        }
    }
}
