package com.example.gmdiet

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)
        val bottomnavigation = findViewById<BottomNavigationView>(R.id.navigation) as BottomNavigationView
        bottomnavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
        when (menuItem.itemId) {
            R.id.homeSymbol -> {
                Thread {
                    val home = Intent(this@Home,FirstActivity::class.java)
                    startActivity(home)
                    finish()
                }.start()
            }
            R.id.watercount ->{
                Thread{
                    val watercount = Intent(this@Home,WaterCount::class.java)
                    startActivity(watercount)
                    finish()
                }.start()
            }
            R.id.weightScale ->{
                Thread{
                    val weightScale = Intent(this@Home,WeightScale::class.java)
                    startActivity(weightScale)
                    finish()
                }.start()
            }
        }
        false

    }

}
