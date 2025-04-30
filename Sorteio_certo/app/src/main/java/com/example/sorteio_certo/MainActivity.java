package com.example.sorteio_certo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void SortearNumero (View view){
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        String num1Digitado = num1.getText().toString();
        String num2Digitado = num2.getText().toString();

        int min = Integer.parseInt(num1Digitado);
        int max = Integer.parseInt(num2Digitado);

        TextView textResultado = findViewById(R.id.textResultado);

        if (min > max) {
            int recebe = min;
            min = max;
            max = recebe;
        }

        int sorteio = new Random().nextInt(min,max + 1);
        textResultado.setText("O número sorteado foi: " + sorteio);
    }

}