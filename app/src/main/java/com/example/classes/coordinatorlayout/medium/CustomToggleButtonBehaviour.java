package com.example.classes.coordinatorlayout.medium;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.snackbar.Snackbar;

public class CustomToggleButtonBehaviour extends CoordinatorLayout.Behavior<CustomToggleButton> {
    public CustomToggleButtonBehaviour() {
        super();
    }

    public CustomToggleButtonBehaviour(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(@NonNull CoordinatorLayout parent, @NonNull CustomToggleButton child, @NonNull View dependency) {
        return dependency instanceof Snackbar.SnackbarLayout;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout parent, @NonNull CustomToggleButton child, @NonNull View dependency) {
        if (dependency instanceof Snackbar.SnackbarLayout) {
            Log.e("fun","onDependentViewChanged");
            child.setChecked(true);
            child.setText("I see Snackbar");
            return true;
        }
        return false;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onDependentViewRemoved(@NonNull CoordinatorLayout parent, @NonNull CustomToggleButton child, @NonNull View dependency) {
        super.onDependentViewRemoved(parent, child, dependency);
        if (dependency instanceof Snackbar.SnackbarLayout) {
            child.setChecked(false);
            child.setText("Snackbar Vanished :(");
        }
    }
}
