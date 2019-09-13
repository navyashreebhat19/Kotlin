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

class FourthActivity:AppCompatActivity(){
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


        day.text="Day 4"


    breakfast.setOnClickListener {
        Log.d("FirstActivity","Yeah its time for breakfast")
        breakfastExplain.visibility = View.VISIBLE
        lunchExplain.visibility = View.GONE
        dinnerExplain.visibility=View.GONE
        wakeupExplain.visibility=View.GONE
        midmealsExplain.visibility=View.GONE
        midsnacksExplain.visibility=View.GONE
        breakfastExplain.text = "1.Start your day by having mixed fruit bowl with few of vegetables with sprinkle of pepper or origami ."+
                "\n"+"\n"+"2.It would give some tastes to your palate."

    }
    lunchDayone.setOnClickListener {
        breakfastExplain.visibility = View.GONE
        lunchExplain.visibility = View.VISIBLE
        dinnerExplain.visibility=View.GONE
        wakeupExplain.visibility=View.GONE
        midmealsExplain.visibility=View.GONE
        midsnacksExplain.visibility=View.GONE
        lunchExplain.text="1.Have 1-2 boiled potato with olive oil or butter whichever tastes better."
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
            lunchExplain.text="Although banana is not a weight reducing agent.But it contains rich potassium. So you can include them in your diet." +
                    "\n"+"\n"+"Can prepare banana smoothie.Consume only 1 glass of smoothie."
        }
        snacks.setOnClickListener {
            wakeupExplain.visibility=View.GONE
            midmealsExplain.visibility=View.GONE
            midsnacksExplain.visibility=View.VISIBLE
            breakfastExplain.visibility = View.GONE
            lunchExplain.visibility = View.GONE
            dinnerExplain.visibility=View.GONE
            midsnacksExplain.text="Drink a glass of milk"
        }


        next.setOnClickListener {
        Thread{
            val second = Intent(this@FourthActivity,FifthActivity::class.java)
            startActivity(second)
            finish()
        }.start()
    }

    back.setOnClickListener {
        Thread{
            val first = Intent(this@FourthActivity,ThirdActivity::class.java)
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
                val home = Intent(this@FourthActivity, Home::class.java)
                startActivity(home)
                finish()
            }.start()
        }
        R.id.watercount ->{
            Thread{
                val watercount = Intent(this@FourthActivity,WaterCount::class.java)
                startActivity(watercount)
                finish()
            }.start()
        }
        R.id.weightScale ->{
            Thread{
                val weightScale = Intent(this@FourthActivity,WeightScale::class.java)
                startActivity(weightScale)
                finish()
            }.start()
        }
    }
    false

}
}