package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment_A extends Fragment {

    EditText editEnviar;
    Button btnEnviar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment__a, container, false);

        editEnviar = view.findViewById(R.id.editEnviar);
        btnEnviar = view.findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(v -> {
            String mensagem = editEnviar.getText().toString();

            Fragment_B Fragment_B = new Fragment_B();
            Bundle bundle = new Bundle();
            bundle.putString("mensagem", mensagem);
            Fragment_B.setArguments(bundle);

            FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frameLayout, Fragment_B);
            transaction.commit();
        });

        return view;
    }
}