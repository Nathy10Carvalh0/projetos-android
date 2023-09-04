package com.example.app_calculos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText numero01, numero02;

    public void calculos (View v) {
        //capturando valores digitados na Activity
        numero01 = (EditText) findViewById(R.id.txt_numero01);
        numero02 = (EditText) findViewById(R.id.text_numero02);

        int res_soma =
                Integer.parseInt(numero01.getText().toString()) +
                        Integer.parseInt(numero02.getText().toString());
        Double res_div = (
                Double.parseDouble(numero01.getText().toString()) +
                        Double.parseDouble(numero02.getText().toString())
        ) / 2;

            //if no java
        int brasil = Integer.parseInt(numero01.getText().toString());
        int argentina = Integer.parseInt(numero02.getText().toString());

        String texto_comparacao = null;
        if (brasil > argentina) {
            texto_comparacao = "brasil > argentina";
        } else if (brasil < argentina) {
            texto_comparacao = " brasil < argentina";
        } else {
            texto_comparacao = "brasil = argentina";
        }


        // mostrando resultados no Toast no android
        Toast.makeText(getApplicationContext(),
                "resultado da soma: " + res_soma +
                        "\nResultado da divisão:" + res_div +
                        "\nComparação de Variáveis: " + texto_comparacao,
                Toast.LENGTH_LONG).show();
    }
    }