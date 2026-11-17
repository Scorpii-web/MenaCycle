package com.menacycle.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(25, 30, 25, 30)
        layout.setBackgroundColor(Color.rgb(18, 18, 18))

        val title = TextView(this)
        title.text = "🌸 MenaCycle"
        title.textSize = 32f
        title.setTextColor(Color.rgb(255, 80, 160))
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "Araho ny tsingerim-bolanao"
        subtitle.textSize = 18f
        subtitle.setTextColor(Color.WHITE)
        subtitle.gravity = Gravity.CENTER

        val button = Button(this)
        button.text = "Hanomboka"
        button.setOnClickListener {
            Toast.makeText(this, "Tongasoa eto amin'ny MenaCycle!", Toast.LENGTH_LONG).show()
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(button)

        setContentView(layout)
    }
}
