package com.example.curro.seven;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class creacion_de_personaje extends AppCompatActivity {
    Button confirmar_don;
    TextView don_actual;
    public static final String MyPREFERENCES = "MyPrefs" ;
    SharedPreferences sharedpreferences;

    enum Dones{
        SABIDURIA, CIENCIA
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creacion_de_personaje);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        confirmar_don = findViewById(R.id.confirmar_don);
        don_actual = findViewById(R.id.don_actual);
        don_actual.setText(R.string.sabiduria);
        confirmar_don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("Don",don_actual.getText().toString());
                editor.commit();

                Intent i = new Intent(getApplicationContext(), introduccion.class);
                startActivity(i);
            }
        });

    }
}
