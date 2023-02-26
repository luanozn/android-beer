package com.example.consultordecerveja_luanribeiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class BuscarCervejaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_cerveja);
        Button button = findViewById(R.id.backButton);
        String username = getIntent().getStringExtra("userName");
        String greetingsMsg = String.format("Olá, %s, seja bem vindo!", username);
        TextView greetingsText = findViewById(R.id.greetingsText);
        greetingsText.setText(greetingsMsg);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(BuscarCervejaActivity.this, MainActivity.class);
            startActivity(intent);
        });

    }
}