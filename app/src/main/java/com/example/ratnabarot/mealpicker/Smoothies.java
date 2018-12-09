package com.example.ratnabarot.mealpicker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Smoothies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoothies);
    }

    public void Smoothie1(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSmoothieRecipes = new Intent(Smoothies.this, SmoothieRecipes.class);
        startActivity(openSmoothieRecipes);
    }

    public void Smoothie2(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSmoothieRecipes = new Intent(Smoothies.this, SmoothieRecipes.class);
        startActivity(openSmoothieRecipes);
    }

    public void Smoothie3(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSmoothieRecipes = new Intent(Smoothies.this, SmoothieRecipes.class);
        startActivity(openSmoothieRecipes);
    }

    public void Smoothie4(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSmoothieRecipes = new Intent(Smoothies.this, SmoothieRecipes.class);
        startActivity(openSmoothieRecipes);
    }

    public void Smoothie5(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSmoothieRecipes = new Intent(Smoothies.this, SmoothieRecipes.class);
        startActivity(openSmoothieRecipes);
    }

    public static void Smoothies (String[] args) {
        String recipes = null;
        switch (recipes){
            case "Smoothie1":
                //Woohoo, it's weekend time
                break;
            case "Saturday":
                //Rest time is now
                break;
            case "Sunday":
                //The day everyone waits for 🙂
                break;
            default: //Oh no, it's working day
                //This code is executed when value of variable 'day'
                //doesn't match with any of case above
                break;
        }
    }

}
