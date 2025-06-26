package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_B extends Fragment {

    TextView txtRecebe;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment__b, container, false);

        txtRecebe = view.findViewById(R.id.textRecebe);

        Bundle recebe = getArguments();

            String mensagem = recebe.getString("mensagem");
            txtRecebe.setText(mensagem);


        return view;
    }
}