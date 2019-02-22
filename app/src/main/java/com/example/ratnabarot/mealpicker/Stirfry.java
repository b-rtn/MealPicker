package com.example.ratnabarot.mealpicker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Stirfry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stirfry);
    }

    //Onclick event for smoothie
    //Clicking on the smoothie button will take the user to Smoothie Recipes
    public void Stirfry1(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openStirfry1Recipes = new Intent(Stirfry.this, ChilliVegetableTofu.class);
        startActivity(openStirfry1Recipes);
    }

    public void Stirfry2(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openStirfry2Recipes = new Intent(Stirfry.this, BeetrootPoriyal.class);
        startActivity(openStirfry2Recipes);
    }

    public void Stirfry3(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openStirfry3Recipes = new Intent(Stirfry.this, RawPapaya.class);
        startActivity(openStirfry3Recipes);
    }

    public void Stirfry4(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openStirfry4Recipes = new Intent(Stirfry.this, ZucchiniPepper.class);
        startActivity(openStirfry4Recipes);
    }

    public void Stirfry5(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openStirfry5Recipes = new Intent(Stirfry.this, CabbageCarrot.class);
        startActivity(openStirfry5Recipes);
    }


}

