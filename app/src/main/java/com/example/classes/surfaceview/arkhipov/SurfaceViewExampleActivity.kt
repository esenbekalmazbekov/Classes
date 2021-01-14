package com.example.classes.surfaceview.arkhipov

import android.os.Bundle
import android.view.SurfaceView
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.classes.R
import com.example.classes.surfaceview.arkhipov.engine.Engine

class SurfaceViewExampleActivity : AppCompatActivity() {
    private lateinit var surface : SurfaceView
    var engine: Engine? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_surface_view_example)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        surface = findViewById(R.id.surface)
        engine = Engine(surface);
    }

    override fun onDestroy() {
        engine!!.stop()
        super.onDestroy()
    }
}