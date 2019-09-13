package com.example.gmdiet

import android.content.Intent
import android.os.Bundle


import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.RadioButton



class WaterCount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_watercount)
        val oneglass = findViewById<RadioButton>(R.id.oneglass) as RadioButton
        val twoglass = findViewById<RadioButton>(R.id.twoglass) as RadioButton
        val threeglass = findViewById<RadioButton>(R.id.threeglass) as RadioButton
        val fourglass = findViewById<RadioButton>(R.id.fourglass) as RadioButton

        val oneimage = findViewById<ImageView>(R.id.image_view_glass1) as ImageView
        val twoimage = findViewById<ImageView>(R.id.image_view_glass2) as ImageView
        val threeimage = findViewById<ImageView>(R.id.image_view_glass3) as ImageView
        val fourimage = findViewById<ImageView>(R.id.image_view_glass4) as ImageView

        val back = findViewById<ImageView>(R.id.backDayone) as ImageView

        oneglass.setOnClickListener {
            oneimage.visibility = View.VISIBLE
            twoimage.visibility = View.GONE
            threeimage.visibility = View.GONE
            fourimage.visibility= View.GONE

        }
        twoglass.setOnClickListener {
            oneimage.visibility = View.GONE
            twoimage.visibility = View.VISIBLE
            threeimage.visibility = View.GONE
            fourimage.visibility= View.GONE

        }
        threeglass.setOnClickListener {
            oneimage.visibility = View.GONE
            twoimage.visibility = View.GONE
            threeimage.visibility = View.VISIBLE
            fourimage.visibility= View.GONE
        }
        fourglass.setOnClickListener {
            oneimage.visibility = View.GONE
            twoimage.visibility = View.GONE
            threeimage.visibility = View.GONE
            fourimage.visibility= View.VISIBLE
        }

        back.setOnClickListener {
            Thread {
                val water = Intent(this@WaterCount, FirstActivity::class.java)
                startActivity(water)
                finish()
            }.start()
        }
    }
}
