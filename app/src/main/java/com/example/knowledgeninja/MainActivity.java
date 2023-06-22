package com.example.knowledgeninja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Fact> factList;
    EditText editTextSearch;
    ImageView imageViewSearch;
    Button informationButton;
    FactAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextSearch = findViewById(R.id.editTextSearch);
        imageViewSearch = findViewById(R.id.imageViewSearch);
        Button informationButton = findViewById(R.id.buttonInformationPage);

        imageViewSearch.setOnClickListener(view -> {
            String query = editTextSearch.getText().toString();
            performSearch(query);
        });

        RecyclerView rv = findViewById(R.id.recyclerviewFacts);
        factList = new ArrayList<>();
        AddFacts();


        adapter = new FactAdapter(factList, this);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

        informationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InformationActivity.class));
            }
        });
    }

    private void performSearch(String query) {
        List<Fact> searchResults = new ArrayList<>();

        for (Fact fact : factList){
            if(fact.getTopic().toLowerCase().contains(query.toLowerCase())
            || fact.getSubTopic().toLowerCase().contains(query.toLowerCase())
            || fact.getFactName().toLowerCase().contains(query.toLowerCase())){
                searchResults.add(fact);
            }
        }
        adapter.updateList(searchResults);
    }

    private void AddFacts() {
        Fact factMercury = new Fact("Space","Solar System", "Mercury", R.drawable.mercury);
        factList.add(factMercury);

        Fact factVenus = new Fact("Space","Solar System", "Venus", R.drawable.venus);
        factList.add(factVenus);

        Fact factEarth = new Fact("Space","Solar System", "Earth", R.drawable.earthtwo);
        factList.add(factEarth);

        Fact factMars = new Fact("Space","Solar System", "Mars", R.drawable.mars);
        factList.add(factMars);

        Fact factJupiter = new Fact("Space","Solar System", "Jupiter", R.drawable.jupiter);
        factList.add(factJupiter);

        Fact factSaturn = new Fact("Space","Solar System", "Saturn", R.drawable.saturn);
        factList.add(factSaturn);

        Fact factUranus = new Fact("Space","Solar System", "Uranus", R.drawable.uranus);
        factList.add(factUranus);

        Fact factNeptune = new Fact("Space","Solar System", "Neptune", R.drawable.neptune);
        factList.add(factNeptune);



    }
}