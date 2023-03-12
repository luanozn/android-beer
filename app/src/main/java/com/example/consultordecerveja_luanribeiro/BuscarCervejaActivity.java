package com.example.consultordecerveja_luanribeiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.consultordecerveja_luanribeiro.adapter.BeerListAdapter;
import com.example.consultordecerveja_luanribeiro.entities.Beer;
import com.example.consultordecerveja_luanribeiro.enums.BeerType;
import com.example.consultordecerveja_luanribeiro.repository.BeerRepository;
import com.example.consultordecerveja_luanribeiro.service.BeerService;

import java.util.List;
import java.util.Map;

public class BuscarCervejaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_cerveja);

        Button backButton = findViewById(R.id.backButton);
        String username = getIntent().getStringExtra("userName");
        String greetingsMsg = String.format("Olá %s, seja bem vindo!", username);
        TextView greetingsText = findViewById(R.id.greetingsText);

        greetingsText.setText(greetingsMsg);

        Spinner spinner = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner_cervejas, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        backButton.setOnClickListener(view -> {
            Intent intent = new Intent(BuscarCervejaActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Button search = findViewById(R.id.search);

        search.setOnClickListener(view -> {

            Spinner spinner = findViewById(R.id.spinner);
            String selectedItem = spinner.getSelectedItem().toString();

            BeerService service = new BeerService(new BeerRepository());
            List<Beer> beerList = service.getByType(BeerType.from(selectedItem));

            ListView beerView = findViewById(R.id.beerList);
            BeerListAdapter beerAdapter = new BeerListAdapter(getApplicationContext(), beerList);
            beerView.setAdapter(beerAdapter);

        });
    }
}