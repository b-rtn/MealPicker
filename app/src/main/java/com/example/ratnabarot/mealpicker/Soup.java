package com.example.ratnabarot.mealpicker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Soup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soup);
    }

    //Onclick event for smoothie
    //Clicking on the smoothie button will take the user to Smoothie Recipes
    public void Soup1(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSoup1Recipes = new Intent(Soup.this, RoastedTomato.class);
        startActivity(openSoup1Recipes);
    }

   public void Soup2(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSoup2Recipes = new Intent(Soup.this, ChipotleButternutSquash.class);
        startActivity(openSoup2Recipes);
    }

    public void Soup3(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSoup3Recipes = new Intent(Soup.this, Cauliflower.class);
        startActivity(openSoup3Recipes);
    }

    public void Soup4(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSoup4Recipes = new Intent(Soup.this, VeggieThaiCurry.class);
        startActivity(openSoup4Recipes);
    }

    public void Soup5(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSoup5Recipes = new Intent(Soup.this, MexicanBean.class);
        startActivity(openSoup5Recipes);
    }


}