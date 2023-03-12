package com.example.consultordecerveja_luanribeiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.consultordecerveja_luanribeiro.adapter.BeerListAdapter;
import com.example.consultordecerveja_luanribeiro.entities.Beer;
import com.example.consultordecerveja_luanribeiro.enums.BeerType;
import com.example.consultordecerveja_luanribeiro.repository.BeerRepository;
import com.example.consultordecerveja_luanribeiro.service.ExpertCerveja;

import java.util.List;
import java.util.Locale;

public class BuscarCervejaActivity extends AppCompatActivity {

    private String lastItemWithSearchPressed = "";
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString("userName", getIntent().getStringExtra("userName"));
        super.onSaveInstanceState(savedInstanceState);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_cerveja);

        Button backButton = findViewById(R.id.backButton);
        String username = getIntent().getStringExtra("userName");
        String greetingsMsg = String.format("Olá %s, seja bem vindo!", username);
        TextView greetingsText = findViewById(R.id.greetingsText);

        if(username != null) {
            greetingsText.setText(greetingsMsg);
        }else {
            greetingsText.setText("Selecione outro tipo!");
        }


        Spinner spinner = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner_cervejas, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        backButton.setOnClickListener(view -> this.finish());
    }

    @Override
    protected void onStart() {
        super.onStart();

        String username = getIntent().getStringExtra("userName");
        String greetingsMsg = String.format("Olá %s, seja bem vindo!", username);
        TextView greetingsText = findViewById(R.id.greetingsText);

        greetingsText.setText(greetingsMsg);

        Button search = findViewById(R.id.search);
        ListView beerView = findViewById(R.id.beerList);

        search.setOnClickListener(view -> {

            Spinner spinner = findViewById(R.id.spinner);
            String selectedItem = spinner.getSelectedItem().toString();

            ExpertCerveja service = new ExpertCerveja(new BeerRepository());
            List<Beer> beerList = service.getByType(BeerType.from(selectedItem));
            lastItemWithSearchPressed = selectedItem;


            BeerListAdapter beerAdapter = new BeerListAdapter(getApplicationContext(), beerList);
            beerView.setAdapter(beerAdapter);

        });

        beerView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ExpertCerveja service = new ExpertCerveja(new BeerRepository());
                List<Beer> beerList = service.getByType(BeerType.from(lastItemWithSearchPressed));
                Beer intentVariable = beerList.get(position);

                Intent intent = new Intent(BuscarCervejaActivity.this, BeerDetails.class);
                intent.putExtra("beer_name", intentVariable.getName());
                intent.putExtra("beer_maker", intentVariable.getBrand());
                intent.putExtra("beer_origin", intentVariable.getOrigin());
                intent.putExtra("beer_year", String.valueOf(intentVariable.getCreationYear()));
                intent.putExtra("beer_picture", intentVariable.getPicture());
                intent.putExtra("beer_type", intentVariable.getType().toString());
                intent.putExtra("beer_price", String.format(Locale.ENGLISH, "R$ %.2f", intentVariable.getValue()));
                intent.putExtra("userName", intent.getStringExtra("userName"));
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        String username = getIntent().getStringExtra("userName");
        String greetingsMsg = String.format("Olá %s, seja bem vindo!", username);
        TextView greetingsText = findViewById(R.id.greetingsText);

        greetingsText.setText(greetingsMsg);
    }
}