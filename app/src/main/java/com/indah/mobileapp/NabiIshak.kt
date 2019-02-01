package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiIshak : AppCompatActivity() {
    private lateinit var b_ishak2:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_ishak)

        b_home=findViewById(R.id.home_ishak1)
        b_home.setOnClickListener{
            startActivity(Intent(this,Home::class.java))
        }
        b_ishak2=findViewById(R.id.t_nextIshak2)
        b_ishak2.setOnClickListener{
            startActivity(Intent(this,NabiIshak2::class.java))
        }

    }
}
