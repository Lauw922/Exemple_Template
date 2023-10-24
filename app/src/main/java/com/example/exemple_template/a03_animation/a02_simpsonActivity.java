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

        ImageView ib_simpson = findViewById(R.id.ib_simpson);
        ImageView iv_bart = findViewById(R.id.iv_bart);
        ImageView iv_homer = findViewById(R.id.iv_homer);


        ib_simpson.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ib_simpson.animate().alpha(1).rotation(3600).setDuration(2000);
                iv_bart.animate().translationXBy(-3000).setDuration(4000);
                iv_homer.animate().translationXBy(-3000).setDuration(5000);

            }

        });


    }
}