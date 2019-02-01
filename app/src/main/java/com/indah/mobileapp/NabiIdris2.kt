package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiIdris2 : AppCompatActivity() {
    private lateinit var b_idris3:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_idris2)

        b_home=findViewById(R.id.home_idris2)
        b_home.setOnClickListener{
            startActivity(Intent(this,Home::class.java))
        }
        b_idris3=findViewById(R.id.t_nextIdris3)
        b_idris3.setOnClickListener{
            startActivity(Intent(this,NabiIdris3::class.java))
        }
    }
}
