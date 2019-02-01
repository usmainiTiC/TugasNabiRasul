package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiYusuf4 : AppCompatActivity() {
    private lateinit var b_yusuf5:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_yusuf4)

        b_home=findViewById(R.id.home_yus4)
        b_home.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        b_yusuf5=findViewById(R.id.t_nextyusuf5)
        b_yusuf5.setOnClickListener{
            startActivity(Intent(this,NabiYusuf5::class.java))
        }

    }
}
