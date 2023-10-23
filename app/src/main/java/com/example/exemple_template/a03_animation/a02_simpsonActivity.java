package com.example.exemple_template.a03_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.exemple_template.HomeActivity;
import com.example.exemple_template.R;

public class a02_simpsonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a02_simpson);


        ImageView iv_simpson = findViewById(R.id.iv_simpson);


        iv_simpson.animate().alpha(1).rotation(3600).setDuration(2000);

    }
}