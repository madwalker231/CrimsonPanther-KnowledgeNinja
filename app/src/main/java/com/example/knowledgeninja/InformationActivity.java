package com.example.knowledgeninja;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.knowledgeninja.databinding.ActivityInformationBinding;

public class InformationActivity extends AppCompatActivity {

    Button nextButton, prevButton;
    TextView factText, informationTitle;
    ImageView resourceImage, nextButton1, prevButton1;
    int factInt;
    private AppBarConfiguration mAppBarConfiguration;
    private ActivityInformationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityInformationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       // setSupportActionBar(binding.appBarInformation.toolbar);
        //binding.appBarInformation.fab.setOnClickListener(new View.OnClickListener() {
     //       @Override
      //      public void onClick(View view) {
      //          Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
     //                   .setAction("Action", null).show();
     //       }
    //    });
      //  binding.appBarInformation.fab.hide();
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_information);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        factInt = 1;
        //Find variables
        factText = (TextView)findViewById(R.id.textViewFactText);
        informationTitle = (TextView)findViewById(R.id.textViewInformationTitle);

        resourceImage= (ImageView)findViewById(R.id.imageResource);
        nextButton1 = (ImageView) findViewById(R.id.imageViewNext);
        prevButton1 = (ImageView)findViewById(R.id.imageViewPrevious);

        //Click listeners
        resourceImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        nextButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factInt++;
                DisplayFact(factInt);
            }
        });
        prevButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factInt--;
                DisplayFact(factInt);
            }
        });
    }

    private void DisplayFact(int factInt) {
        if(factInt ==1){
            factText.setTextSize(30);
            factText.setText(R.string.earth_fact_1);
            resourceImage.setImageResource(R.drawable.earthtwo);
        }if(factInt == 2){
            factText.setTextSize(24);
            factText.setText(R.string.earth_fact_2);
            resourceImage.setImageResource(R.drawable.earthimage1);
        }if(factInt == 3){
            factText.setTextSize(22);
            factText.setText(R.string.earth_fact_3);
            resourceImage.setImageResource(R.drawable.earthimage2);
        }if(factInt >=4){
            resourceImage.setImageResource(R.drawable.earthimage3);
            factText.setText("More facts coming soon!");
        }if(factInt <=0){
            factText.setText("More facts coming soon!");
            resourceImage.setImageResource(R.drawable.earthimage4);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.information, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_information);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}