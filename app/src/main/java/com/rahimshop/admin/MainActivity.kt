package com.rahimshop.admin

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)

        textView.text = "Rahim Shop\n\nالتطبيق يعمل بنجاح ✅"
        textView.textSize = 24f
        textView.setTextColor(Color.BLACK)
        textView.gravity = Gravity.CENTER

        setContentView(textView)
    }
}
