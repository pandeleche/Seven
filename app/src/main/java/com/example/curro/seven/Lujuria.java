package com.example.curro.seven;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class Lujuria extends AppCompatActivity {

    Button primera_opcion;
    Button segunda_opcion;
    Button tercera_opcion;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.texto_sin_mision);
        primera_opcion = findViewById(R.id.primera_opcion);
        segunda_opcion = findViewById(R.id.segunda_opcion);
        tercera_opcion = findViewById(R.id.tercera_opcion);
        texto = findViewById(R.id.texto_mision);
    }
}
