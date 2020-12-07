package com.example.a2apruebaalejandro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnComprar;
    Button btnAgregarCarro;
    EditText cantidad;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnComprar = findViewById(R.id.btnCompra);
        Button btnAgregarCarrito = findViewById(R.id.btnAgregarCarrito);
        final EditText cantidad = findViewById(R.id.editCantidad);
        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, carrito.class);
                intent.putExtra("cantidad", cantidad.getText().toString());
                startActivity(intent);
            }
        });
        btnAgregarCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Artículo agregado al carro con éxito", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {

    }

}
