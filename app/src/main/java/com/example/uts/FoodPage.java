package com.example.uts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class FoodPage extends AppCompatActivity {
    ImageButton btnCart;
    ImageButton btnHot;
    ImageButton btnIce;
    ImageButton btnLeci;
    ImageButton btnLemon;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_page);
        btnHot = findViewById(R.id.btnHot);
        btnCart = findViewById(R.id.btnCart);
        btnIce = findViewById(R.id.btnIce);
        btnLeci = findViewById(R.id.btnLeci);
        btnLemon = findViewById(R.id.btnLemon);


        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cart = new Intent(FoodPage.this, MyOrderPage.class);
                startActivity(cart);
            }
        });

        btnHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Ketoprak \nRp 20.000,-";
                Intent hot = new Intent(FoodPage.this,OrderPage.class);
                hot.putExtra( "display", text);
                startActivity(hot);
            }
        });

        btnLemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Carbonara \nRp 15.000,-";
                Intent lemon = new Intent(FoodPage.this, OrderPage.class);
                lemon.putExtra("display", text);
                startActivity(lemon);
            }
        });

        btnLeci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Nasi Goreng \nRp 18.000,-";
                Intent leci = new Intent(FoodPage.this, OrderPage.class);
                leci.putExtra("display", text);
                startActivity(leci);
            }
        });

        btnIce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Ikan Bakar \nRp 25.000,-";
                Intent ice = new Intent(FoodPage.this, OrderPage.class);
                ice.putExtra("display", text);
                startActivity(ice);
            }
        });
    }
}
