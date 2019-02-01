package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiYunus : AppCompatActivity() {
    private lateinit var b_yunus2:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_yunus)

        b_home=findViewById(R.id.home_yunus1)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        b_yunus2=findViewById(R.id.t_nextyunus2)
        b_yunus2.setOnClickListener{
            startActivity(Intent(this,NabiYunus2::class.java))
        }

    }
}
