package com.example.activitylinearlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityLinearLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_linear_layout);


    }
    public void enviarToast(View view) {
        EditText editNome   = findViewById(R.id.editNome);
        EditText editEmail  = findViewById(R.id.editEmail);
        RadioGroup groupCursos = findViewById(R.id.RadioGroupCursos);

        String nome  = editNome.getText().toString().trim();
        String email = editEmail.getText().toString().trim();

        int selectedId = groupCursos.getCheckedRadioButtonId();

        RadioButton radioSelecionado = findViewById(selectedId);
        String curso = radioSelecionado.getText().toString();

        String mensagem = "Nome: "  + nome  + "\n"
                + "E-mail: " + email + "\n"
                + "Curso: "  + curso;
        Toast.makeText(this,
                mensagem,
                Toast.LENGTH_LONG).show();
    }

}