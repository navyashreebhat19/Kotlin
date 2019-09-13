package com.example.gmdiet

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class WeightScale : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weightchart)

        var lbs = findViewById<EditText>(R.id.lbsvalue) as EditText
        var kg = findViewById<TextView>(R.id.kgvalue) as TextView
        val ok = findViewById<Button>(R.id.buttonOk) as Button

        ok.setOnClickListener {
            if(lbs.text.toString() == ""){
                Toast.makeText(this,"Please enter the lbs value",Toast.LENGTH_LONG).show()
            }else {
                val lbsvalue = lbs.text.toString().toInt()

                val point = 0.45359237f
                val result = lbsvalue * point
                kg.text = result.toString()
            }
        }
    }



}
