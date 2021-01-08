package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MyOrderPage extends AppCompatActivity {
    ImageButton btnPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order_page);
        btnPay = findViewById(R.id.btnPay);

        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pay = new Intent(MyOrderPage.this, CheckoutPage.class);
                startActivity(pay);
            }
        });
    }
}
