package com.example.consultordecerveja_luanribeiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.startButton);
        EditText textField = findViewById(R.id.nameField);

        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, BuscarCervejaActivity.class);
            intent.putExtra("userName", textField.getText().toString());
            System.out.println(textField.getText().toString());
            startActivity(intent);
        });
    }
}