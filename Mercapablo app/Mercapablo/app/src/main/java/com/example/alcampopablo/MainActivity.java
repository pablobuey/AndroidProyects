package com.example.alcampopablo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.example.alcampopablo.juguetes.MainActivity_Juguetes;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Para desactivar el Toolbar de arriba de la app
        getSupportActionBar().hide();

        Intent seccionJuguetes = new Intent(this, MainActivity_Juguetes.class);

      //botón JUGUETES MainActivity
        ImageButton botonJuguetes = (ImageButton) findViewById(R.id.botonJuguetes);
        ImageButton botonDecoracion = (ImageButton) findViewById(R.id.botonDecoracion);
        ImageButton botonDeportes = (ImageButton) findViewById(R.id.botonDeportes);
        ImageButton botonVideojuegos = (ImageButton) findViewById(R.id.botonVideojuegos);

        botonJuguetes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("", "PRUEBA DE TEXTO");
                startActivity(seccionJuguetes);
            }
        });

        botonDecoracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("", "PRUEBA DE TEXTO");
                startActivity(seccionJuguetes);
            }
        });

        botonDeportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("", "PRUEBA DE TEXTO");
                startActivity(seccionJuguetes);
            }
        });

        botonVideojuegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("", "PRUEBA DE TEXTO");
                startActivity(seccionJuguetes);
            }
        });


    }
}