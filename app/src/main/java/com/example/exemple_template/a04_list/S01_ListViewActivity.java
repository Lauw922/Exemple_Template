package com.example.exemple_template.a04_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.exemple_template.R;

public class S01_ListViewActivity extends AppCompatActivity {

    private ListView lvlisteView;


/** Méthode 1 avec un tableau dans le java */

private String[] stagiaires = new String[]{
        "David 1", "Naoufel", "Stanlenes", "Lauréline", "Nadia", "Didier", "Simon", "Rima", "David 2", "Naziha", "Jérome", "Ali", "Khadim"

};

public void populateListView(){
    String[] colorlist = getResources().getStringArray(R.array.color_list);
    final ArrayAdapter<String> adapter = new ArrayAdapter<>(
            //le contexte - la mise en forme - les données a afficher
            this, android.R.layout.simple_list_item_1, colorlist
    );
    lvlisteView.setAdapter(adapter);
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s01_list_view);

        lvlisteView = findViewById(R.id.lv_listview);
        populateListView();

    }
}