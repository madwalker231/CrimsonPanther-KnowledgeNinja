package com.example.knowledgeninja;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    ImageView tvSpace, tvAnimals, tvNature, tvTechnology, tvHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSpace = findViewById(R.id.imageViewSpace);
        tvAnimals = findViewById(R.id.imageViewAnimals);
        tvNature = findViewById(R.id.imageViewNature);
        tvTechnology = findViewById(R.id.imageViewTechnology);
        tvHistory = findViewById(R.id.imageViewHistory);

        tvSpace.setOnClickListener(view ->
        {
            String str = getString(R.string.space_title);
            Intent intent = new Intent(MainActivity.this, Data.class);
            intent.putExtra("message_key", str);
            startActivity(intent);
        });

        tvAnimals.setOnClickListener(view ->
        {
            String str = "Animals";
            Intent intent = new Intent(MainActivity.this, Data.class);
            intent.putExtra("message_key", str);
            startActivity(intent);
        });

        tvNature.setOnClickListener(view ->
        {
            String str = "Nature";
            Intent intent = new Intent(MainActivity.this, Data.class);
            intent.putExtra("message_key", str);
            startActivity(intent);
        });

        tvTechnology.setOnClickListener(view ->
        {
            String str = "Technology";
            Intent intent = new Intent(MainActivity.this, Data.class);
            intent.putExtra("message_key", str);
            startActivity(intent);
        });

        tvHistory.setOnClickListener(view ->
        {
            String str = "History";
            Intent intent = new Intent(MainActivity.this, Data.class);
            intent.putExtra("message_key", str);
            startActivity(intent);
        });
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.popout_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == R.id.action_setting)
        {
            return true;
        }
        else if (id == R.id.action_profile)
        {
            return true;
        }
        else if (id == R.id.action_parent)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}