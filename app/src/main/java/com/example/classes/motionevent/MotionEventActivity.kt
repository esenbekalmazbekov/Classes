package com.example.classes.motionevent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.classes.R

class MotionEventActivity : AppCompatActivity(), View.OnTouchListener {
    private lateinit var parent : ConstraintLayout
    private lateinit var cool : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion_event)

        bind()
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun bind() {
        parent = findViewById(R.id.parent)
        parent.setOnTouchListener(this)

        cool = findViewById(R.id.cool)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        val x = event?.x ?: 0f
        val y = event?.y ?: 0f

        if (event?.action == MotionEvent.ACTION_MOVE) {
            cool.x = x
            cool.y = y
        }

        return true
    }
}