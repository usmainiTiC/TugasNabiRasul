package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NabiDzulkifli : AppCompatActivity() {
    private lateinit var b_zulkifli2:Button
    private lateinit var b_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nabi_dzulkifli)

        b_zulkifli2=findViewById(R.id.t_nextzulkifli2)
        b_zulkifli2.setOnClickListener{
            startActivity(Intent(this,NabiDzulkifli2::class.java))
        }
        b_home=findViewById(R.id.home_zulkifli1)
        b_home.setOnClickListener{
            startActivity(Intent(this,Home::class.java))
        }

    }
}
