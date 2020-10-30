package com.example.miformulariojoserodriguez4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // mostrar Icono
        getSupportActionBar().setIcon(R.mipmap.ic_icono);
        // mostrar Up
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        
    }
}