package com.example.consultordecerveja_luanribeiro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.startButton);
        EditText textField = findViewById(R.id.nameField);

        TextView errorMessage = findViewById(R.id.errorMessage);

        button.setOnClickListener(view -> {
            if (!textField.getText().toString().equals("")) {
                Intent intent = new Intent(MainActivity.this, BuscarCervejaActivity.class);
                intent.putExtra("userName", textField.getText().toString());
                System.out.println(textField.getText().toString());
                startActivity(intent);
            } else
                errorMessage.setText("Digite um nome válido!");
        });
    }
}