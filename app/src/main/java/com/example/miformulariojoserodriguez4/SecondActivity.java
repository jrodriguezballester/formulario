package com.example.miformulariojoserodriguez4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // Asociar elementos tipo "Visual" a tipo "codigo"
        TextView textView_Nombre = findViewById(R.id.textView_Nombre);
        final RadioGroup radioGroup_sexo = findViewById(R.id.radioGroup_sexo);
        Button button_next = findViewById(R.id.buttonNext);


        // mostrar Icono
        getSupportActionBar().setIcon(R.mipmap.ic_icono);
        // mostrar Up
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Datos del bundle de activity1
        Bundle bundle_entrada = this.getIntent().getExtras();
        String datos = null;
        if (bundle_entrada != null) {
            datos = bundle_entrada.getString("NOMBRE");
            textView_Nombre.setText(datos);
        }

        // Esperar Evento del boton
        button_next.setOnClickListener(new View.OnClickListener() {
            /**
             * Recoger valores y abrir la siguiente Activity
             */
            @Override
            public void onClick(View v) {
                int radioButtonIDselect = radioGroup_sexo.getCheckedRadioButtonId();
                RadioButton radioButton_selected=findViewById(radioButtonIDselect);
                String seleccion=radioButton_selected.getText().toString();
            }
        });
    }
}