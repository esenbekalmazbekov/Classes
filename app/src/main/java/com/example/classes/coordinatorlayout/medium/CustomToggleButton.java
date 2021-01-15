package com.example.classes.coordinatorlayout.medium;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

@SuppressLint("AppCompatCustomView")
@CoordinatorLayout.DefaultBehavior(CustomToggleButtonBehaviour.class)
public class CustomToggleButton extends ToggleButton {

    public CustomToggleButton(Context context) {
        super(context);
    }

    public CustomToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomToggleButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
