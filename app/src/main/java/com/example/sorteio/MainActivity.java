package com.example.sorteio;

import android.os.Bundle;
import android.view.View;
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
    }

    public void SortearNumero (View view){
        TextView txtResultado = findViewById(R.id.textResultado);
        int sorteio = new Random().nextInt(11);
        txtResultado.setText("O número sorteado foi: " + sorteio);
    }

}