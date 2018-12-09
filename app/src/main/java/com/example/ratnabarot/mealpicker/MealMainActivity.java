package com.example.ratnabarot.mealpicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MealMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_main);
    }

    public void smoothies(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSmoothies = new Intent(MealMainActivity.this, Smoothies.class);
        startActivity(openSmoothies);
    }

    public void salad(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSalads = new Intent(MealMainActivity.this, Salad.class);
        startActivity(openSalads);
    }

    public void soup(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSoups = new Intent(MealMainActivity.this, Soup.class);
        startActivity(openSoups);
    }

    public void stirfry(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openStirfrys = new Intent(MealMainActivity.this, Stirfry.class);
        startActivity(openStirfrys);
    }

    public void pickfruit(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openPickfruits = new Intent(MealMainActivity.this, Pickfruit.class);
        startActivity(openPickfruits);
    }


}
