package com.ed.module_lib_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout cl = findViewById(R.id.cl_root_one);
        CardView cardView = new CardView(this);
        cardView.setCardBackgroundColor(Color.RED);
        cardView.setLayoutParams(new ViewGroup.LayoutParams(300,300));

        cl.addView(cardView);
    }
}
