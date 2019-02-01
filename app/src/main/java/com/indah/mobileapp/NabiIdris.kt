package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiIdris : AppCompatActivity() {
    private lateinit var b_idris2:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_idris)

        b_home=findViewById(R.id.home_idris1)
        b_home.setOnClickListener{
            startActivity(Intent(this,Home::class.java))
        }
        b_idris2=findViewById(R.id.t_nextIdris2)
        b_idris2.setOnClickListener{
            startActivity(Intent(this,NabiIdris2::class.java))
        }
    }
}
