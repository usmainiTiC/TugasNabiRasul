package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiYusuf5 : AppCompatActivity() {
    private lateinit var b_yusuf6:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_yusuf5)

        b_home=findViewById(R.id.home_yus5)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        b_yusuf6=findViewById(R.id.t_nextyusuf6)
        b_yusuf6.setOnClickListener{
            startActivity(Intent(this,NabiYusuf6::class.java))
        }

    }
}
