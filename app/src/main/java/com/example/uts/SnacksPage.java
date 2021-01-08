package com.example.uts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SnacksPage extends AppCompatActivity {
    ImageButton btnCart;
    ImageButton btnHot;
    ImageButton btnIce;
    ImageButton btnLeci;
    ImageButton btnLemon;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks_page);
        btnHot = findViewById(R.id.btnHot);
        btnCart = findViewById(R.id.btnCart);
        btnIce = findViewById(R.id.btnIce);
        btnLeci = findViewById(R.id.btnLeci);
        btnLemon = findViewById(R.id.btnLemon);


        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cart = new Intent(SnacksPage.this, MyOrderPage.class);
                startActivity(cart);
            }
        });

        btnHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Donat \nRp 20.000,-";
                Intent hot = new Intent(SnacksPage.this,OrderPage.class);
                hot.putExtra( "display", text);
                startActivity(hot);
            }
        });

        btnLemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Roti Bakar \nRp 15.000,-";
                Intent lemon = new Intent(SnacksPage.this, OrderPage.class);
                lemon.putExtra("display", text);
                startActivity(lemon);
            }
        });

        btnLeci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Kebab \nRp 18.000,-";
                Intent leci = new Intent(SnacksPage.this, OrderPage.class);
                leci.putExtra("display", text);
                startActivity(leci);
            }
        });

        btnIce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Pisang Bakar \nRp 25.000,-";
                Intent ice = new Intent(SnacksPage.this, OrderPage.class);
                ice.putExtra("display", text);
                startActivity(ice);
            }
        });
    }
}
