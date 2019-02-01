package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiAdam : AppCompatActivity() {
    private lateinit var b_adam2:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_adam)

        b_home=findViewById(R.id.home_adam1)
        b_home.setOnClickListener{
            startActivity(Intent(this,Home::class.java))
        }
        b_adam2=findViewById(R.id.t_nextAdam2)
        b_adam2.setOnClickListener{
            startActivity(Intent(this,NabiAdam2::class.java))
        }

    }
}
