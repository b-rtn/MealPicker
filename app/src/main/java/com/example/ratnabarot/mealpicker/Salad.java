package com.example.ratnabarot.mealpicker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Salad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad);
    }

    //Onclick event for smoothie
    //Clicking on the smoothie button will take the user to Smoothie Recipes
    public void Salad1(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSalad1Recipes = new Intent(Salad.this, GreenBean.class);
        startActivity(openSalad1Recipes);
    }

    public void Salad2(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSalad2Recipes = new Intent(Salad.this, MozzarellaTomato.class);
        startActivity(openSalad2Recipes);
    }

    public void Salad3(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSalad3Recipes = new Intent(Salad.this, StrawberrySpinach.class);
        startActivity(openSalad3Recipes);
    }

    public void Salad4(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSalad4Recipes = new Intent(Salad.this, CornNBean.class);
        startActivity(openSalad4Recipes);
    }

    public void Salad5(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSalad5Recipes = new Intent(Salad.this, Tomato.class);
        startActivity(openSalad5Recipes);
    }


}
