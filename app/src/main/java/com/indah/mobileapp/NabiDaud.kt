package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiDaud : AppCompatActivity() {
    private lateinit var b_daud2:Button
    private lateinit var b_home:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_daud)

        b_daud2=findViewById(R.id.t_nextdaud2)
        b_daud2.setOnClickListener{
            startActivity(Intent(this,NabiDaud2::class.java))
        }
        b_home=findViewById(R.id.home_daud1)
        b_home.setOnClickListener{
            startActivity(Intent(this,Home::class.java))
        }

    }
}
