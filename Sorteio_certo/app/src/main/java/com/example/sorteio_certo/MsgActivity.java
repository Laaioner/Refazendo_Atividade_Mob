package com.example.sorteio_certo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MsgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        ImageView imgIMC = findViewById(R.id.imgIMC);
        TextView txtIMC = findViewById(R.id.txtIMC);
        TextView txtResultado = findViewById(R.id.txtResultado);
        Bundle bundle = getIntent().getExtras();

        String imcRecebe = getIntent().getStringExtra("imc");
        float calcImc = Float.parseFloat(imcRecebe);
        if (calcImc < 18.5) {
            txtResultado.setText(imcRecebe);
            txtIMC.setText("Abaixo do peso");
            imgIMC.setImageResource(R.drawable.baixo_peso);

        } else if (calcImc < 25) {
            txtResultado.setText(imcRecebe);
            txtIMC.setText("Peso normal");
            imgIMC.setImageResource(R.drawable.peso_normal);

        } else if (calcImc < 30) {
            txtResultado.setText(imcRecebe);
            txtIMC.setText("Sobrepeso");
            imgIMC.setImageResource(R.drawable.excesso_de_peso);

        } else if (calcImc < 35) {
            txtResultado.setText(imcRecebe);
            txtIMC.setText("Obesidade grau I");
            imgIMC.setImageResource(R.drawable.obesidade);

        } else if (calcImc < 40) {
            txtResultado.setText(imcRecebe);
            txtIMC.setText("Obesidade grau II");
            imgIMC.setImageResource(R.drawable.obesidade);

        } else {
            txtResultado.setText(imcRecebe);
            txtIMC.setText("Obesidade grau III");
            imgIMC.setImageResource(R.drawable.obesidade_extrema);
        }
    }
}