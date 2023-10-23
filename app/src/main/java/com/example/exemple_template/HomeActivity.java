package com.example.exemple_template;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.exemple_template.a01_layout.L01_linearActivity;
import com.example.exemple_template.a01_layout.L02_frameActivity;
import com.example.exemple_template.a01_layout.L03_relativeActivity;

public class HomeActivity extends AppCompatActivity {

    /*
    Personal
     */


    // 1 Variable globale
    Button btn_linear_layout ;
    Button btn_frame_layout;
    Button btn_relative_layout;

    // 2 Méthode init pour l'initialisation des widgets
    public  void  initUI(){
        btn_linear_layout = findViewById(R.id.btn_linear_layout);
        btn_frame_layout = findViewById(R.id.btn_frame_layout);
        btn_relative_layout = findViewById(R.id.btn_relative_layout);
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
    }
}