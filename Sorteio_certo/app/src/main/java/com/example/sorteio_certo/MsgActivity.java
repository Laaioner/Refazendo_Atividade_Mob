package com.example.sorteio_certo;

import android.os.Bundle;
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

        TextView txtResultado = findViewById(R.id.txtResultado);
        Bundle bundle = getIntent().getExtras();



        String imcRecebe = getIntent().getStringExtra("imc");
        float calcImc = Float.parseFloat(imcRecebe);

        if (calcImc < 18.5) {
            txtResultado.setText(bundle.getString("imc", "Abaixo do peso"));
        } else if (calcImc < 25.0) {
            txtResultado.setText(bundle.getString("imc", "Abaixo do peso"));
        } else if (calcImc < 30.0) {
            txtResultado.setText(bundle.getString("imc", "Abaixo do peso"));

        } else if (calcImc < 35.0) {
            txtResultado.setText(bundle.getString("imc", "Abaixo do peso"));
        } else if (calcImc < 40.0) {
            txtResultado.setText(bundle.getString("imc", "Abaixo do peso"));
        } else {
            txtResultado.setText(bundle.getString("imc", "Abaixo do peso"));
        }
    }
}