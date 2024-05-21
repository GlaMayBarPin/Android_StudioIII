package com.example.calculadora.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.example.calculadora.R;

public class ListaPedidos extends AppCompatActivity {
    ImageButton btnChat, btnPrincipal;
    RelativeLayout lyPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_pedidos);

        lyPedido=findViewById(R.id.lypedido);
        btnChat=findViewById(R.id.btnChat);
        btnPrincipal=findViewById(R.id.btnPrincipal);

        lyPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DetallePedido.class);
                startActivity(i);
                finish();
            }
        });

        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Chat.class);
                startActivity(i);
                finish();
            }
        });
        btnPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Principal.class);
                startActivity(i);
                finish();
            }
        });
    }
}