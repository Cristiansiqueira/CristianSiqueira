package com.example.aluno.cristiansiqueira;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edNome; //define um variavel do tipo EditTexto
    Button btExibir; //define um variavel do tipo Button


    //cristian siqueira
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNome = (EditText) findViewById(R.id.edNome);
        btExibir = (Button) findViewById(R.id.btExibir);

        btExibir.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View V){
                String nome =  edNome.getText().toString();

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado Nome");
                dialogo.setMessage("Seu nome é" + nome);
                dialogo.setNeutralButton("ok", null);
                dialogo.show();
            }
        });

    }
}
