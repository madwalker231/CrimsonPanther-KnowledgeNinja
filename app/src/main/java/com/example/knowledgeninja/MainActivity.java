package com.example.knowledgeninja;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    ImageView tvSpace, tvAnimals, tvNature, tvTechnology, tvHistory;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSpace = (ImageView) findViewById(R.id.imageViewSpace);

        tvAnimals = (ImageView) findViewById(R.id.imageViewAnimals);

        tvNature = (ImageView) findViewById(R.id.imageViewNature);

        tvTechnology = (ImageView) findViewById(R.id.imageViewTechnology);

        tvHistory = (ImageView) findViewById(R.id.imageViewHistory);

        tvSpace.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String str = "Space";
                Intent intent = new Intent(MainActivity.this, Data.class);
                intent.putExtra("massage_key", str);
                startActivity(intent);
            }
        });

        tvAnimals.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String str = "Animals";
                Intent intent = new Intent(MainActivity.this, Data.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });

        tvNature.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String str = "Nature";
                Intent intent = new Intent(MainActivity.this, Data.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });

        tvTechnology.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String str = "Technology";
                Intent intent = new Intent(MainActivity.this, Data.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });

        tvHistory.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String str = "History";
                Intent intent = new Intent(MainActivity.this, Data.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
    }
}