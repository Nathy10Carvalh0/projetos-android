package com.example.app_cadastro;

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
    EditText nome_dg, celular_dg, email_dg;

    public void dados_cadastrados(View v)
    {
        //capturando os valores do EditText
        nome_dg = (EditText) findViewById(R.id.txt_nome);
        celular_dg = (EditText) findViewById(R.id.txt_celular);
        email_dg = (EditText) findViewById(R.id.txt_email);

        Toast.makeText(getApplicationContext(),
                "nome: "+ nome_dg.getText()+ "\n" +
                "celular: "+ celular_dg.getText()+ "\n" +
                "E-mail: "+ email_dg.getText(),

                Toast.LENGTH_LONG).show();
    }
}