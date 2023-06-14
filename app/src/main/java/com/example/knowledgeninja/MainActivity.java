package com.example.knowledgeninja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSpace = (TextView) findViewById(R.id.textViewSpace);

        tvAnimals = (TextView) findViewById(R.id.textViewAnimals);

        tvNature = (TextView) findViewById(R.id.textViewNature);

        tvTechnology = (TextView) findViewById(R.id.textViewNature);

        tvHistory = (TextView) findViewById(R.id.textViewNature);

        tvSpace.setClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String str = tvSpace.getText().toString();
                Intent intent = new Intent(MainActivity.this, DataImport.class);
                intent.putExtra("massage_key", str);
                startActivity(intent);
            }
        });

        tvAnimals.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String str = tvAnimals.getText().toString();
                Intent intent = new Intent(MainActivity.this, Data.Import.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });

        tvNature.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String str = tvNature.getText().toString();
                Intent intent = new Intent(MainActivity.this, Data.Import.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });

        tvTechnology.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String str = tvTechnology.getText().toString();
                Intent intent = new Intent(MainActivity.this, Data.Import.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });

        tvHisroty.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String str = tvHistory.getText().toString();
                Intent intent = new Intent(MainActivity.this, Data.Import.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
    }
}