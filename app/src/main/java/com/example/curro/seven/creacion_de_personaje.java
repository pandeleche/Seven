package com.example.curro.seven;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class creacion_de_personaje extends AppCompatActivity {
    Button confirmar_don;
    TextView don_actual;
    TextView descripcion_actual;
    public static final String MyPREFERENCES = "MyPrefs" ;
    SharedPreferences sharedpreferences;
    ImageButton left;
    ImageButton right;
    int counter_don = 0;

    String[] dones = {"SABIDURIA", "CIENCIA", "TEMOR DE DIOS", "ENTENDIMIENTO", "CONSEJO", "FORTALEZA", "PIEDAD"};
    String[] descripciones = {"Es el don de entender lo que favorece y lo que perjudica el proyecto de Dios",
            "Es el don de la ciencia de Dios y no la ciencia del mundo",
            "Este don nos mantiene en el debido respeto frente a Dios y en la sumisión a su voluntad",
            "Es el don divino que nos ilumina para aceptar las verdades reveladas por Dios",
            "Es el don de saber discernir los caminos y las opciones, de saber orientar y escuchar",
            "Este es el don que nos vuelve valientes para enfrentar las dificultades del día a día",
            "Es el don que el Espíritu Santo nos da para estar siempre abiertos a la voluntad de Dios"};


    enum Dones{
        SABIDURIA, CIENCIA, TEMOR_DE_DIOS, ENTENDIMIENTO, CONSEJO, FORTALEZA, PIEDAD
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creacion_de_personaje);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        confirmar_don = findViewById(R.id.confirmar_don);
        don_actual = findViewById(R.id.don_actual);
        descripcion_actual = findViewById(R.id.descripcion_don);

        don_actual.setText(dones[counter_don]);
        descripcion_actual.setText(descripciones[counter_don]);

        right = (ImageButton) findViewById(R.id.siguiente_don);
        left = (ImageButton) findViewById(R.id.don_anterior);

        //clicar en siguiente don
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter_don<6){
                    counter_don++;
                }
                don_actual.setText(dones[counter_don]);
                descripcion_actual.setText(descripciones[counter_don]);
            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter_don>0){
                    counter_don--;
                }
                don_actual.setText(dones[counter_don]);
                descripcion_actual.setText(descripciones[counter_don]);

            }
        });
        confirmar_don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("Don",don_actual.getText().toString());
                editor.commit();

                Intent i = new Intent(getApplicationContext(), introducir_codigo.class);
                startActivity(i);
            }
        });

    }
}
