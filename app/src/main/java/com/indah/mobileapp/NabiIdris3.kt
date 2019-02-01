package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiIdris3 : AppCompatActivity() {
    private lateinit var b_idris4:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_idris3)

        b_idris4=findViewById(R.id.t_nextIdris4)
        b_idris4.setOnClickListener{
            startActivity(Intent(this,NabiIdris4::class.java))
        }
        b_home=findViewById(R.id.home_idris3)
        b_home.setOnClickListener{
            startActivity(Intent(this,Home::class.java))
        }
    }
}
