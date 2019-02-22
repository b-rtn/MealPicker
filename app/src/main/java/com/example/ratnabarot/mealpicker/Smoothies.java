package com.example.ratnabarot.mealpicker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Smoothies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoothies);
    }

    //Onclick event for smoothie
    //Clicking on the smoothie button will take the user to Smoothie Recipes
    public void Smoothie1(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSmoothie1Recipes = new Intent(Smoothies.this, StrawBana.class);
        startActivity(openSmoothie1Recipes);
    }

    public void Smoothie2(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSmoothie2Recipes = new Intent(Smoothies.this, HealthyGreen.class);
        startActivity(openSmoothie2Recipes);
    }

    public void Smoothie3(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSmoothie3Recipes = new Intent(Smoothies.this, Peach.class);
        startActivity(openSmoothie3Recipes);
    }

    public void Smoothie4(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSmoothie4Recipes = new Intent(Smoothies.this, CarrotCake.class);
        startActivity(openSmoothie4Recipes);
    }

    public void Smoothie5(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSmoothie5Recipes = new Intent(Smoothies.this, BlueberryPie.class);
        startActivity(openSmoothie5Recipes);
    }


}
