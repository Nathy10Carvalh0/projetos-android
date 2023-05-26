    package com.example.mediaaluno;

    import static android.app.ProgressDialog.show;

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
        EditText nomeAluno, nota01, nota02, nota03, nota04;

        public void calcular (View v) {
            //capturando valores digitados na Activity
            nomeAluno = (EditText) findViewById(R.id.txt_nome_aluno);
            nota01 = (EditText) findViewById(R.id.txt_nota01);
            nota02 = (EditText) findViewById(R.id.txt_nota02);
            nota03 = (EditText) findViewById(R.id.txt_nota03);
            nota04 = (EditText) findViewById(R.id.txt_nota04);

            double media_aluno = (
                    Double.parseDouble(nota01.getText().toString()) +
                            Double.parseDouble(nota02.getText().toString()) +
                            Double.parseDouble(nota03.getText().toString()) +
                            Double.parseDouble(nota04.getText().toString())
                    )/4;
            //if no java
            String texto_comparacao = null;
            if (media_aluno >= 6) {
                texto_comparacao = "Aprovado";
            } else if (media_aluno <6) {
                texto_comparacao = " Reprovado";
            }


            // mostrando resultados no Toast no android
            Toast.makeText(getApplicationContext(),
                    "Nome aluno: " + nomeAluno.getText() +
                            "\nMedia aluno: " + media_aluno +
                            "\nSituação do aluno: " + texto_comparacao,
                    Toast.LENGTH_LONG).show();


        }
    }