package com.eac.agriconnect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "EAC AgriConnect - Welcome Boss!"
        tv.textSize = 24f
        tv.setPadding(50, 300, 50, 50)
        setContentView(tv)
    }
}
