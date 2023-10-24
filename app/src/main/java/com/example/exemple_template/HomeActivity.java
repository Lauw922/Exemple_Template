package com.example.exemple_template;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.exemple_template.a01_layout.L01_linearActivity;
import com.example.exemple_template.a01_layout.L02_frameActivity;
import com.example.exemple_template.a01_layout.L03_relativeActivity;
import com.example.exemple_template.a03_animation.a01_loadingActivity;
import com.example.exemple_template.a03_animation.a02_simpsonActivity;
import com.example.exemple_template.a04_list.S01_ListViewActivity;

public class HomeActivity extends AppCompatActivity {

    /*
    Personal
     */


    // 1 Variable globale
    Button btn_linear_layout ;
    Button btn_frame_layout;
    Button btn_relative_layout;
    Button btn_animation_loading;
    Button btn_animation_simpson;
    Button btn_list_view;

    // 2 Méthode init pour l'initialisation des widgets
    public  void  initUI(){
        btn_linear_layout = findViewById(R.id.btn_linear_layout);
        btn_frame_layout = findViewById(R.id.btn_frame_layout);
        btn_relative_layout = findViewById(R.id.btn_relative_layout);
        btn_animation_loading = findViewById(R.id.btn_animation_loading);
        btn_animation_simpson = findViewById(R.id.btn_animation_simpson);
        btn_list_view = findViewById(R.id.btn_list_view);
    }

    // 4 Méthode pour la gestion du bouton LinearLayout
    public void setBtn_linear_layout(){
        btn_linear_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L01_linearActivity.class));
            }
        });
    }

    public void setBtn_frame_layout(){
        btn_frame_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L02_frameActivity.class));
            }
        });
    }

    public void setBtn_relative_layout(){
        btn_relative_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L03_relativeActivity.class));
            }
        });
    }

    public void setBtn_animation_loading(){
        btn_animation_loading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, a01_loadingActivity.class));
            }
        });

        btn_animation_loading.animate();

    }

    public void setBtn_animation_simpson(){
        btn_animation_simpson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, a02_simpsonActivity.class));
            }
        });

    }

    public void setBtn_list_view(){
        btn_list_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, S01_ListViewActivity.class));
            }
        });

    }

    /*
    Life Cycles
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initUI(); // 3 Appel de la méthode
        setBtn_linear_layout(); //5 Appel de la Méthode
        setBtn_frame_layout();
        setBtn_relative_layout();
        setBtn_animation_loading();
        setBtn_animation_simpson();
        setBtn_list_view();

    }
}