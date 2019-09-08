package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
        text = findViewById(R.id.nombreUsuario);
        Intent getIntet = getIntent();

        String usuario = getIntet.getStringExtra("usuario");

        text.setText(usuario);
    }
}
