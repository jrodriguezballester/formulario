package com.example.miformulariojoserodriguez4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // mostrar Icono
        getSupportActionBar().setIcon(R.mipmap.ic_icono);

        // Asociar elementos tipo "Visual" a tipo "codigo"
        EditText editTextNombre=findViewById(R.id.editTextNombre);
        Button buttonNext=findViewById(R.id.buttonNext);

        final String stringNombre=editTextNombre.getText().toString();


        // Esperar Evento del boton
        buttonNext.setOnClickListener(new View.OnClickListener() {
            /**
             * Recoger el valor del editText y abrir la siguiente Activity
             */
            @Override
            public void onClick(View v) {
                // Creamos el Intent
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                // Creamos el Bundle
                Bundle bundle=new Bundle();
                //Asociamos Clave-valor
                bundle.putString("NOMBRE",stringNombre);

                // Añadimos el bundle al intent
                intent.putExtras(bundle);
                // iniciar la nueva actividad
                startActivity(intent);
            }
        });

    }
}