package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DrinksPage extends AppCompatActivity {
    ImageButton btnCart;
    ImageButton btnHot;
    ImageButton btnIce;
    ImageButton btnLeci;
    ImageButton btnLemon;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_page);
        btnHot = findViewById(R.id.btnHot);
        btnCart = findViewById(R.id.btnCart);
        btnIce = findViewById(R.id.btnIce);
        btnLeci = findViewById(R.id.btnLeci);
        btnLemon = findViewById(R.id.btnLemon);


        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cart = new Intent(DrinksPage.this, MyOrderPage.class);
                startActivity(cart);
            }
        });

        btnHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Hot Latte \nRp 20.000,-";
                Intent hot = new Intent(DrinksPage.this,OrderPage.class);
                hot.putExtra( "display", text);
                startActivity(hot);
            }
        });

        btnLemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Lemon Tea \nRp 15.000,-";
                Intent lemon = new Intent(DrinksPage.this, OrderPage.class);
                lemon.putExtra("display", text);
                startActivity(lemon);
            }
        });

        btnLeci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Lychee Tea \nRp 18.000,-";
                Intent leci = new Intent(DrinksPage.this, OrderPage.class);
                leci.putExtra("display", text);
                startActivity(leci);
            }
        });

        btnIce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Iced Latte \nRp 25.000,-";
                Intent ice = new Intent(DrinksPage.this, OrderPage.class);
                ice.putExtra("display", text);
                startActivity(ice);
            }
        });
    }
}
