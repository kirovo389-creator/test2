package com.devtudio.template

import android.app.Activity
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

/**
 * Minimal template activity. The layout is built in code, and the app name is
 * read from the application label, so this file never references the generated
 * R class — the project namespace changes per install, but the source package
 * stays com.devtudio.template.
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appName = packageManager.getApplicationLabel(applicationInfo).toString()

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.parseColor("#2B2B2B"))
            setPadding(48, 48, 48, 48)
        }

        val text = TextView(this).apply {
            text = "Hello from $appName! Edit me in Devtudio."
            textSize = 24f
            typeface = Typeface.DEFAULT_BOLD
            gravity = Gravity.CENTER
            setTextColor(Color.WHITE)
        }

        root.addView(text)
        setContentView(root)
    }
}
