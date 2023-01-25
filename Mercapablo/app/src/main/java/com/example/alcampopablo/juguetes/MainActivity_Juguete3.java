package com.example.alcampopablo.juguetes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alcampopablo.MainActivity_Fin;
import com.example.alcampopablo.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity_Juguete3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juguete3);

        //Desactivación de Toolbar para mejorar estética
        getSupportActionBar().hide();

        //Creación de Intent que llevará a pantalla MainActivity
        Intent actividad3 = new Intent(this, MainActivity_Fin.class);

        //Creación del botón flotante
        FloatingActionButton botonFlotante = (FloatingActionButton) findViewById(R.id.floatingActionButton);

        //Creación del botón Añadir Al Carrito
        Button botonComprar = (Button) findViewById(R.id.btnCarrito1);

        //Escuchador botón flotante
        botonComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(actividad3);

            }
        });

        //Escuchador botón Añadir Al Carrito
        botonFlotante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(actividad3);

            }
        });
    }
}