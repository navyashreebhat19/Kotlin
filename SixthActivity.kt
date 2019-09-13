package com.example.gmdiet

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.firstactivity.*

class SixthActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.firstactivity)
        val breakfast = findViewById<CardView>(R.id.breakfastDayone) as CardView
        val breakfastExplain = findViewById<TextView>(R.id.breakfastExplaination) as TextView
        val lunch = findViewById<CardView>(R.id.lunchDayone) as CardView
        val dinner = findViewById<CardView>(R.id.dinnerDayone) as CardView
        val lunchExplain = findViewById<TextView>(R.id.lunchExplaination) as TextView
        val dinnerExplain = findViewById<TextView>(R.id.dinnerExplaination) as TextView
        val next = findViewById<ImageView>(R.id.nextDayone) as ImageView
        val day = findViewById<TextView>(R.id.setDay) as TextView
        val back = findViewById<ImageView>(R.id.backDayone) as ImageView

        val wakeup = findViewById<CardView>(R.id.wakeupDayone) as CardView
        val wakeupExplain = findViewById<TextView>(R.id.wakeupExplaination) as TextView
        val midmeals = findViewById<CardView>(R.id.midmealsDayone) as CardView
        val snacks = findViewById<CardView>(R.id.snacksDayone) as CardView
        val midmealsExplain = findViewById<TextView>(R.id.midmealsExplaination) as TextView
        val midsnacksExplain = findViewById<TextView>(R.id.midmealsExplaination) as TextView
        val bottomnavigation = findViewById<BottomNavigationView>(R.id.navigation) as BottomNavigationView


        day.text="Day 6"



        breakfast.setOnClickListener {
            Log.d("FirstActivity","Yeah its time for breakfast")
            breakfastExplain.visibility = View.VISIBLE
            lunchExplain.visibility = View.GONE
            dinnerExplain.visibility=View.GONE
            wakeupExplain.visibility=View.GONE
            midmealsExplain.visibility=View.GONE
            midsnacksExplain.visibility=View.GONE
            breakfastExplain.text = "1.Start your day by having a bowl of sprouted seeds or boiled kidney beans or even a fruit bowl all that except banana." +
                    "\n"+"\n"+"2.Avoid potato or tomato"+"\n"+"\n"+"3.Add some pepper or origami to it to taste better"

        }
        lunchDayone.setOnClickListener {
            breakfastExplain.visibility = View.GONE
            lunchExplain.visibility = View.VISIBLE
            dinnerExplain.visibility=View.GONE
            wakeupExplain.visibility=View.GONE
            midmealsExplain.visibility=View.GONE
            midsnacksExplain.visibility=View.GONE
            lunchExplain.text="1.Have 2 Chapathis or Roti without oil.\n" +"\n"+
                    "2.Make Spinach or any leafy vegetable gravy to have with rotis or chapatis.\n" +"\n"+
                    "3.Drink water."
        }

        dinnerDayone.setOnClickListener {
            dinnerExplain.visibility =View.VISIBLE
            breakfastExplain.visibility = View.GONE
            lunchExplain.visibility = View.GONE
            wakeupExplain.visibility=View.GONE
            midmealsExplain.visibility=View.GONE
            midsnacksExplain.visibility=View.GONE
            dinnerExplain.text="1.Prepare soup containing some vegetables like cabbage,carrot,capsicum.\n" +"\n"+
                    "2.Avoid rice"

        }
        wakeup.setOnClickListener {
            wakeupExplain.visibility=View.VISIBLE
            midmealsExplain.visibility=View.GONE
            midsnacksExplain.visibility=View.GONE
            breakfastExplain.visibility = View.GONE
            lunchExplain.visibility = View.GONE
            dinnerExplain.visibility=View.GONE
            wakeupExplain.text="Drink a glass of luke warm water with added honey and squeezed lemon"
        }
        midmeals.setOnClickListener {
            wakeupExplain.visibility=View.GONE
            midmealsExplain.visibility=View.GONE
            midsnacksExplain.visibility=View.GONE
            breakfastExplain.visibility = View.GONE
            lunchExplain.visibility = View.VISIBLE
            dinnerExplain.visibility=View.GONE
            lunchExplain.text="Drink a glass of fresh juice.Such as sapota,watermelon,orange"
        }
        snacks.setOnClickListener {
            wakeupExplain.visibility=View.GONE
            midmealsExplain.visibility=View.GONE
            midsnacksExplain.visibility=View.VISIBLE
            breakfastExplain.visibility = View.GONE
            lunchExplain.visibility = View.GONE
            dinnerExplain.visibility=View.GONE
            midsnacksExplain.text="Drink Ragi malt."
        }

        next.setOnClickListener {
            Thread{
                val second = Intent(this@SixthActivity,SeventhActivity::class.java)
                startActivity(second)
                finish()
            }.start()
        }

        back.setOnClickListener {
            Thread{
                val first = Intent(this@SixthActivity,FifthActivity::class.java)
                startActivity(first)
                finish()
            }.start()
        }
        bottomnavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
        when (menuItem.itemId) {
            R.id.homeSymbol -> {
                Thread {
                    val home = Intent(this@SixthActivity, Home::class.java)
                    startActivity(home)
                    finish()
                }.start()
            }
            R.id.watercount ->{
                Thread{
                    val watercount = Intent(this@SixthActivity,WaterCount::class.java)
                    startActivity(watercount)
                    finish()
                }.start()
            }
            R.id.weightScale ->{
                Thread{
                    val weightScale = Intent(this@SixthActivity,WeightScale::class.java)
                    startActivity(weightScale)
                    finish()
                }.start()
            }
        }
        false

    }
}