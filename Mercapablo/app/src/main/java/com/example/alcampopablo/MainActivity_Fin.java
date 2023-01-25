package com.example.alcampopablo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_Fin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fin);

        //Para desactivar el Toolbar de arriba de la app
        getSupportActionBar().hide();

        Intent pantallaPrincipal = new Intent(this, MainActivity.class);
        Button botonVolver = (Button) findViewById(R.id.botonVolver);


        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               startActivity(pantallaPrincipal);
            }
        });





    }
}