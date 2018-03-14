package com.example.curro.seven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class introduccion extends AppCompatActivity {
    Button introducir_codigo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduccion);
        introducir_codigo = findViewById(R.id.introducir_codigo);
    }
}
