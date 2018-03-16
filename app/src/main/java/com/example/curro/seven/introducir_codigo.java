package com.example.curro.seven;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class introducir_codigo extends AppCompatActivity {

    Button confirmar_codigo;
    EditText codigo_introducido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducir_codigo);

        confirmar_codigo = findViewById(R.id.confirmar_codigo_boton);
        codigo_introducido = findViewById(R.id.codigo);


        confirmar_codigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (codigo_introducido.getText().toString()){
                    case "N4RC1S0":
                        Intent orgullo = new Intent(getApplicationContext(), Orgullo.class);
                        startActivity(orgullo);
                        break;
                    case "3NV1FU":
                        Intent envidia = new Intent(getApplicationContext(), Envidia.class);
                        startActivity(envidia);
                        break;
                    case "ZL33P":
                        Intent pereza = new Intent(getApplicationContext(), Pereza.class);
                        startActivity(pereza);
                        break;
                    case "C4NT0P":
                        Intent gula = new Intent(getApplicationContext(), Gula.class);
                        startActivity(gula);
                        break;
                    case "Lujuria":
                        Intent lujuria = new Intent(getApplicationContext(), Lujuria.class);
                        startActivity(lujuria);
                        break;
                    case "ira":
                        Intent ira = new Intent(getApplicationContext(), Ira.class);
                        startActivity(ira);
                        break;
                    case "avaricia":
                        Intent avaricia = new Intent(getApplicationContext(), Avaricia.class);
                        startActivity(avaricia);
                        break;
                }
            }
        });
    }
}
