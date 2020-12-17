package com.example.classes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.classes.motionevent.MotionEventActivity

class MainActivity : AppCompatActivity() {
    private lateinit var motionEvent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()
        listeners()
    }

    private fun bind() {
        motionEvent = findViewById(R.id.motion_event)
    }

    private fun listeners() {
        motionEvent.setOnClickListener {
            startActivity(Intent(this,MotionEventActivity::class.java))
        }
    }
}