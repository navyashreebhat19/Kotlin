package com.example.gmdiet

import android.content.Intent

import android.os.Bundle
import android.os.Handler

import android.support.v7.app.AppCompatActivity


class MainActivity:AppCompatActivity(){



//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val updateHandler = Handler()
        val runnable = Runnable{
            updateDisplay()
        }
     updateHandler.postDelayed(runnable,5000)

    }
    private fun updateDisplay(){

            Thread {

                val intent = Intent(this@MainActivity, FirstActivity::class.java)
                startActivity(intent)
                finish()

            }.start()
    }



    }

