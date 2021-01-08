package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class OrderPage extends AppCompatActivity {
    ImageButton btnCart;
    ImageButton btnKurang;
    ImageButton btnTambah;
    Button btnMore;
    int quantity = 0;
    TextView display;
    String name;
    TextView quan;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);
        btnCart = findViewById(R.id.btnCart);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        quan = findViewById(R.id.quan);
        btnMore = findViewById(R.id.btnMore);
        btnNext = findViewById(R.id.btnNext);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity++;
                quan.setText(quantity +" pcs");
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity--;
                quan.setText(quantity +" pcs");
            }
        });

        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cart = new Intent(OrderPage.this, MyOrderPage.class);
                startActivity(cart);
            }
        });

        btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent more = new Intent(OrderPage.this, DrinksPage.class);
                startActivity(more);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent( OrderPage.this, MyOrderPage.class);
                startActivity(next);
            }
        });
        Intent intent = getIntent();
        name = intent.getStringExtra("display");
        display = (TextView) findViewById(R.id.order);
        display.setText(getIntent().getStringExtra("display"));

    }
}
