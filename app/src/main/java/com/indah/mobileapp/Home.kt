package com.indah.mobileapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    private lateinit var b_idris:Button
    private lateinit var b_adam:Button
    private lateinit var b_zakaria:Button
    private lateinit var b_nuh:Button
    private lateinit var b_shaleh:Button
    private lateinit var b_yunus:Button
    private lateinit var b_sulaiman:Button
    private lateinit var b_syuaib:Button
    private lateinit var b_yusuf:Button
    private lateinit var b_yahya:Button
    private lateinit var b_ismail:Button
    private lateinit var b_harun:Button
    private lateinit var b_daud:Button
    private lateinit var b_ibrahim:Button
    private lateinit var b_ishak:Button
    private lateinit var b_ilyas:Button
    private lateinit var b_ilyasa:Button
    private lateinit var b_ayub:Button
    private lateinit var b_hud:Button
    private lateinit var b_musa:Button
    private lateinit var b_isa:Button
    private lateinit var b_yakub:Button
    private lateinit var b_luth:Button
    private lateinit var b_saleh:Button
    private lateinit var b_ahmad:Button
    private lateinit var b_zulkifli:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        b_zulkifli=findViewById(R.id.t_zulkiflli)
        b_zulkifli.setOnClickListener{
            startActivity(Intent(this,NabiDzulkifli::class.java))
        }
        b_ahmad=findViewById(R.id.t_muhammad)
        b_ahmad.setOnClickListener{
            startActivity(Intent(this,NabiMuhammad::class.java))
        }
        b_saleh=findViewById(R.id.t_saleh)
        b_saleh.setOnClickListener{
            startActivity(Intent(this,NabiShaleh::class.java))
        }
        b_luth=findViewById(R.id.t_luth)
        b_luth.setOnClickListener{
            startActivity(Intent(this,NabiLuth::class.java))
        }
        b_yakub=findViewById(R.id.t_yakub)
        b_yakub.setOnClickListener{
            startActivity(Intent(this,NabiYakub::class.java))
        }
        b_isa=findViewById(R.id.t_isa)
        b_isa.setOnClickListener{
            startActivity(Intent(this,NabiIsa::class.java))
        }
        b_musa=findViewById(R.id.t_musa)
        b_musa.setOnClickListener{
            startActivity(Intent(this,NabiMusa::class.java))
        }
        b_hud=findViewById(R.id.t_hud)
        b_hud.setOnClickListener{
            startActivity(Intent(this,NabiHud::class.java))
        }
        b_ayub=findViewById(R.id.t_ayub)
        b_ayub.setOnClickListener{
            startActivity(Intent(this,NabiAyub::class.java))
        }
        b_ilyasa=findViewById(R.id.t_ilyasa)
        b_ilyasa.setOnClickListener{
            startActivity(Intent(this,NabiIlyasa::class.java))
        }
        b_ilyas=findViewById(R.id.t_ilyas)
        b_ilyas.setOnClickListener{
            startActivity(Intent(this,NabiIlyas::class.java))
        }
        b_ishak=findViewById(R.id.t_ishak)
        b_ishak.setOnClickListener{
            startActivity(Intent(this,NabiIshak::class.java))
        }
        b_ibrahim=findViewById(R.id.t_ibrahim)
        b_ibrahim.setOnClickListener{
            startActivity(Intent(this,NabiIbrahim::class.java))
        }
        b_daud=findViewById(R.id.t_daud)
        b_daud.setOnClickListener{
            startActivity(Intent(this,NabiDaud::class.java))
        }
        b_harun=findViewById(R.id.t_harun)
        b_harun.setOnClickListener{
            startActivity(Intent(this,NabiHarun::class.java))
        }
        b_ismail=findViewById(R.id.t_ismail)
        b_ismail.setOnClickListener{
            startActivity(Intent(this,NabiIsmail::class.java))
        }
        b_yahya=findViewById(R.id.t_yahya)
        b_yahya.setOnClickListener{
            startActivity(Intent(this,NabiYahya::class.java))
        }
        b_yusuf=findViewById(R.id.t_yusuf)
        b_yusuf.setOnClickListener{
            startActivity(Intent(this,NabiYusuf::class.java))
        }
        b_syuaib=findViewById(R.id.t_syuaib)
        b_syuaib.setOnClickListener{
            startActivity(Intent(this,NabiSyuaib::class.java))
        }
        b_sulaiman=findViewById(R.id.t_sulaiman)
        b_sulaiman.setOnClickListener{
            startActivity(Intent(this,NabiSulaiman::class.java))
        }
        b_yunus=findViewById(R.id.t_yunus)
        b_yunus.setOnClickListener{
            startActivity(Intent(this,NabiYunus::class.java))
        }
        b_shaleh=findViewById(R.id.t_saleh)
        b_shaleh.setOnClickListener{
            startActivity(Intent(this,NabiShaleh::class.java))
        }
        b_nuh=findViewById(R.id.t_nuh)
        b_nuh.setOnClickListener{
            startActivity(Intent(this,NabiNuh::class.java))
        }
        b_zakaria=findViewById(R.id.t_zakaria)
        b_zakaria.setOnClickListener{
            startActivity(Intent(this,NabiZakaria::class.java))
        }
        b_idris=findViewById(R.id.t_idris)
        b_idris.setOnClickListener{
            startActivity(Intent(this,NabiIdris::class.java))
        }
        b_adam=findViewById(R.id.t_adam)
        b_adam.setOnClickListener{
            startActivity(Intent(this,NabiAdam::class.java))
        }
    }
}