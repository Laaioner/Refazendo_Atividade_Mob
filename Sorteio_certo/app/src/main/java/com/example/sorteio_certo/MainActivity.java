package com.example.sorteio_certo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void CalcularImc (View view){

        EditText altura = findViewById(R.id.altura);
        EditText peso = findViewById(R.id.peso);

        String alturaDigitada = altura.getText().toString();
        String pesoDigitado = peso.getText().toString();

        float alturinha = Float.parseFloat(alturaDigitada) / 100;
        float pesinho = Float.parseFloat(pesoDigitado);
        float imc = pesinho / (alturinha * alturinha);

        Intent i = new Intent(getApplicationContext(), MsgActivity.class);
        i.putExtra("imc",Float.toString(imc));
        startActivity(i);
    }

}