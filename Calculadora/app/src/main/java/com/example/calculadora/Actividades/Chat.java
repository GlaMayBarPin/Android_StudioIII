package com.example.calculadora.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.calculadora.R;


public class Chat extends AppCompatActivity {
    ImageButton btnListaPedidos, btnPrincipal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

        btnListaPedidos= findViewById(R.id.btnCarrito);
        btnPrincipal=findViewById(R.id.btnPrincipal);
        btnPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Principal.class);
                startActivity(i);
                finish();
            }
        });
        btnListaPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ListaPedidos.class);
                startActivity(i);
                finish();
            }
        });
    }
}