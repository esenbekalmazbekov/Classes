package com.example.classes.coordinatorlayout.medium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.example.classes.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class CoordinatorMediumActivity : AppCompatActivity() {
    private lateinit var parentView : CoordinatorLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coordinator_medium)

        init ()
    }

    private fun init () {
        parentView = findViewById(R.id.parent)
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener {
            Snackbar.make(parentView, R.string.snackbar_text, Snackbar.LENGTH_LONG)
                .show()
        }
    }
}