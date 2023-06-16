package com.example.knowledgeninja;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Data extends AppCompatActivity
{
    TextView testPage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_page);

        testPage = (TextView) findViewById(R.id.testTextView);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        testPage.setText(str);
        //Toast.makeText(this, "User Selected: " + str, Toast.LENGTH_LONG).show();
        if ("Space".equals(str))
        {
            testPage.setText("Test Page - Space");
        }
        if ("Animals".equals(str))
        {
            testPage.setText("Test Page - Animals");
        }
        if ("Nature".equals(str))
        {
            testPage.setText("Test Page - Nature");
        }
        if ("Technology".equals(str))
        {
            testPage.setText("Test Page - Technology");
        }
        if ("History".equals(str))
        {
            testPage.setText("Test Page - History");
        }
    }
}