package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnDrinks;
    Button btnMy;
    Button btnTop;
    Button btnSnacks;
    Button btnFood;
    Button btnMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDrinks = findViewById(R.id.btnDrinks);
        btnMy = findViewById(R.id.btnMy);
        btnTop = findViewById(R.id.btnTop);
        btnSnacks = findViewById(R.id.btnSnacks);
        btnFood = findViewById(R.id.btnFood);
        btnMap = findViewById(R.id.btnMap);

        btnMy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myorder = new Intent(MainActivity.this , MyOrderPage.class);
                startActivity(myorder);
            }
        });

        btnDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent drinks = new Intent(MainActivity.this, DrinksPage.class);
                startActivity(drinks);
            }
        });

        btnDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topup = new Intent(MainActivity.this, TopUp.class);
                startActivity(topup);
            }
        });

        btnDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent food = new Intent(MainActivity.this, FoodPage.class);
                startActivity(food);
            }
        });

        btnDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent snack = new Intent(MainActivity.this, SnacksPage.class);
                startActivity(snack);
            }
        });

        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maps = new Intent(MainActivity.this, Maps.class);
                startActivity(maps);
            }
        });

    }

}
