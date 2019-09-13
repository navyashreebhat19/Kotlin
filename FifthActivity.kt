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

class FifthActivity:AppCompatActivity(){
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


        day.text="Day 5"



        breakfast.setOnClickListener {
            Log.d("FirstActivity","Yeah its time for breakfast")
            breakfastExplain.visibility = View.VISIBLE
            lunchExplain.visibility = View.GONE
            dinnerExplain.visibility=View.GONE
            wakeupExplain.visibility=View.GONE
            midmealsExplain.visibility=View.GONE
            midsnacksExplain.visibility=View.GONE
            breakfastExplain.text = "1.Start your day by having a bowl of sprouted seeds."+
                    "\n"+"\n"+"2.Just soak the seeds in water overnight."

        }
        lunchDayone.setOnClickListener {
            breakfastExplain.visibility = View.GONE
            lunchExplain.visibility = View.VISIBLE
            dinnerExplain.visibility=View.GONE
            wakeupExplain.visibility=View.GONE
            midmealsExplain.visibility=View.GONE
            midsnacksExplain.visibility=View.GONE
            lunchExplain.text="1.Have a bowl of potatoes pieces and tomato pieces along with that you can even add paneer chunks along with if you need."
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
                    "3.Eat 1 ragi ball."
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
            midsnacksExplain.text="Have one cucumber or even you have juice of cucumber."
        }

        next.setOnClickListener {
            Thread{
                val second = Intent(this@FifthActivity,SixthActivity::class.java)
                startActivity(second)
                finish()
            }.start()
        }

        back.setOnClickListener {
            Thread{
                val first = Intent(this@FifthActivity,FourthActivity::class.java)
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
                    val home = Intent(this@FifthActivity, Home::class.java)
                    startActivity(home)
                    finish()
                }.start()
            }
            R.id.watercount ->{
                Thread{
                    val watercount = Intent(this@FifthActivity,WaterCount::class.java)
                    startActivity(watercount)
                    finish()
                }.start()
            }
            R.id.weightScale ->{
                Thread{
                    val weightScale = Intent(this@FifthActivity,WeightScale::class.java)
                    startActivity(weightScale)
                    finish()
                }.start()
            }
        }
        false

    }

}