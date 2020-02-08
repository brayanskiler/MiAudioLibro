package com.example.audiolibros.chido;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.audiolibros.chido.fragments.PreferenciasFragment;



public class PreferenciasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().replace(android.R.id.
                content, new PreferenciasFragment()).commit();
    }
}