package com.example.a2apruebaalejandro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class carrito extends AppCompatActivity {
    private TextView txtvalortotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);
        txtvalortotal = (TextView) findViewById(R.id.txttotal);
        String cantidad = getIntent().getStringExtra("cantidad");
        txtvalortotal.setText(""+cantidad);
    }
}