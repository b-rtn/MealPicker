package com.example.ratnabarot.mealpicker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pickfruit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickfruit);
    }

    //Onclick event for smoothie
    //Clicking on the smoothie button will take the user to Smoothie Recipes
    public void Fruit1(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openFruit1Recipes = new Intent(Pickfruit.this, Apple.class);
        startActivity(openFruit1Recipes);
    }

    public void Fruit2(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openFruit2Recipes = new Intent(Pickfruit.this, Banana.class);
        startActivity(openFruit2Recipes);
    }

    public void Fruit3(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openFruit3Recipes = new Intent(Pickfruit.this, Mandarin.class);
        startActivity(openFruit3Recipes);
    }

    public void Fruit4(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openFruit4Recipes = new Intent(Pickfruit.this, Pomegranate.class);
        startActivity(openFruit4Recipes);
    }

    public void Fruit5(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openFruit5Recipes = new Intent(Pickfruit.this, Strawberries.class);
        startActivity(openFruit5Recipes);
    }


}
