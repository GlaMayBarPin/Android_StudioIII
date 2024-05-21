package com.example.calculadora.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.example.calculadora.R;

public class ListaChats extends AppCompatActivity {
    RelativeLayout lyChat;
    ImageButton btnPrincipal,btnPedidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_chats);



        btnPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ListaPedidos.class);
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
