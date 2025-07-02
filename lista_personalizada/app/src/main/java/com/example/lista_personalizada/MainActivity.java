package com.example.lista_personalizada;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    String[] planetas = {
            "Terra", "Marte", "Sol", "Vênus", "Saturno","Urano", "Netuno", "Jupite","Mercurio"
    };

    int[] imagensPlanetas = {
            R.drawable.earth, R.drawable.mars, R.drawable.sun, R.drawable.venus,
            R.drawable.saturn, R.drawable.uranus, R.drawable.neptune,
            R.drawable.jupter, R.drawable.mercury
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lista);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                this,
                android.R.layout.activity_planeta_list_adapter,
                planetas
        );
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String valorSelecionado = lista.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, valorSelecionado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}