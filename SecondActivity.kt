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

class SecondActivity : AppCompatActivity() {
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


        day.text="Day 2"



        breakfast.setOnClickListener {
            Log.d("FirstActivity","Yeah its time for breakfast")
            breakfastExplain.visibility = View.VISIBLE
            lunchExplain.visibility = View.GONE
            dinnerExplain.visibility=View.GONE
            wakeupExplain.visibility=View.GONE
            midmealsExplain.visibility=View.GONE
            midsnacksExplain.visibility=View.GONE
            breakfastExplain.text = "1.Since Day 1 was little bit tough."+
           "\n"+"\n"+"2.Start your day by having 1-2 boiled sweet potato."+
                    "\n"+"\n"+"You can add pepper for tasting. Dont have more than 3 potatoes."

        }
        lunchDayone.setOnClickListener {
            breakfastExplain.visibility = View.GONE
            lunchExplain.visibility = View.VISIBLE
            dinnerExplain.visibility=View.GONE
            wakeupExplain.visibility=View.GONE
            midmealsExplain.visibility=View.GONE
            midsnacksExplain.visibility=View.GONE
            lunchExplain.text="1.Have some fruit bowl like fruits to be included are watermelon,apples."+
            "\n"+"\n"+"2.Have a glass of water."+"\n"+"\n"+"3.These fruits helps in reducing weight as it contains more water in it."
        }

        dinnerDayone.setOnClickListener {
            dinnerExplain.visibility =View.VISIBLE
            breakfastExplain.visibility = View.GONE
            lunchExplain.visibility = View.GONE
            wakeupExplain.visibility=View.GONE
            midmealsExplain.visibility=View.GONE
            midsnacksExplain.visibility=View.GONE

            dinnerExplain.text="1.Intake should be minimal.\n" +"\n"+
                    "2.Avoid rice.\n" +"\n"+
                    "3.Eat 2 ragi roti."
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
                val second = Intent(this@SecondActivity,ThirdActivity::class.java)
                startActivity(second)
                finish()
            }.start()
        }

        back.setOnClickListener {
            Thread{
                val first = Intent(this@SecondActivity,FirstActivity::class.java)
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
                    val home = Intent(this@SecondActivity, Home::class.java)
                    startActivity(home)
                    finish()
                }.start()
            }
            R.id.watercount ->{
                Thread{
                    val watercount = Intent(this@SecondActivity,WaterCount::class.java)
                    startActivity(watercount)
                    finish()
                }.start()
            }
            R.id.weightScale ->{
                Thread{
                    val weightScale = Intent(this@SecondActivity,WeightScale::class.java)
                    startActivity(weightScale)
                    finish()
                }.start()
            }
        }
        false
    }
    }

