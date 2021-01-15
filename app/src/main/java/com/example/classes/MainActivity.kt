package com.example.classes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.classes.coordinatorlayout.medium.CoordinatorMediumActivity
import com.example.classes.motionevent.MotionEventActivity
import com.example.classes.surfaceview.arkhipov.SurfaceViewExampleActivity

class MainActivity : AppCompatActivity() {
    private lateinit var motionEvent : Button
    private lateinit var surfaceView : Button
    private lateinit var coordinator : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()
        listeners()
    }

    private fun bind() {
        motionEvent = findViewById(R.id.motion_event)
        surfaceView = findViewById(R.id.surface_view)
        coordinator = findViewById(R.id.coordinator)
    }

    private fun listeners() {
        motionEvent.setOnClickListener {
            startActivity(Intent(this, MotionEventActivity::class.java))
        }
        surfaceView.setOnClickListener {
            startActivity(Intent(this, SurfaceViewExampleActivity::class.java))
        }
        coordinator.setOnClickListener {
            startActivity(Intent(this, CoordinatorMediumActivity::class.java))
        }
    }
}