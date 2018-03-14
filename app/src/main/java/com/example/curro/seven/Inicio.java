package com.example.curro.seven;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {
    Button nueva_partida;
    Button introducir_codigo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        nueva_partida =  findViewById(R.id.nueva_partida);
        introducir_codigo = findViewById(R.id.introducir_codigo);
        nueva_partida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), introduccion.class);
                startActivity(i);
            }
        });
        introducir_codigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(), introducir_codigo.class);
                startActivity(j);
            }
        });
    }

}
