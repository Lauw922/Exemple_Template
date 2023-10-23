package com.example.exemple_template.a03_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.exemple_template.R;

public class a01_loadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a01_loading);

        // on fait le lien entre vue et code
        ImageView ivLoading = findViewById(R.id.ivLoading);

        //on anime l'image
        //on fait un fade pour faire apparaitre notre image et on la fait tourner en meme temps

        ivLoading.animate().alpha(1).rotation(3600).setDuration(2000);



    }
}