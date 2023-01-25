package com.example.alcampopablo.juguetes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alcampopablo.R;
import com.example.alcampopablo.juguetes.MainActivity_Juguete1;

public class MainActivity_Juguetes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_juguetes);

        //Para desactivar el Toolbar de arriba de la app
        getSupportActionBar().hide();

        //Botones Main Activity Juguetes
        ImageButton btn_juguete1 = (ImageButton) findViewById(R.id.juguete1);
        ImageButton btn_juguete2 = (ImageButton) findViewById(R.id.juguete2);
        ImageButton btn_juguete3 = (ImageButton) findViewById(R.id.juguete3);
        ImageButton btn_juguete4 = (ImageButton) findViewById(R.id.juguete4);
        ImageButton btn_juguete5 = (ImageButton) findViewById(R.id.juguete5);
        ImageButton btn_juguete6 = (ImageButton) findViewById(R.id.juguete6);
        ImageButton btn_juguete7 = (ImageButton) findViewById(R.id.juguete7);
        ImageButton btn_juguete8 = (ImageButton) findViewById(R.id.juguete8);


        //Intents que llevan a la página de cada juguete
        Intent mainActivity_Juguete1 = new Intent(this, MainActivity_Juguete1.class);
        Intent mainActivity_Juguete2 = new Intent(this, MainActivity_Juguete2.class);
        Intent mainActivity_Juguete3 = new Intent(this, MainActivity_Juguete3.class);
        Intent mainActivity_Juguete4 = new Intent(this, MainActivity_Juguete4.class);
        Intent mainActivity_Juguete5 = new Intent(this, MainActivity_Juguete5.class);
        Intent mainActivity_Juguete6 = new Intent(this, MainActivity_Juguete6.class);
        Intent mainActivity_Juguete7 = new Intent(this, MainActivity_Juguete7.class);
        Intent mainActivity_Juguete8 = new Intent(this, MainActivity_Juguete8.class);

        //Escuchadores de cada botón que llevan a las páginas de cada juguete
        btn_juguete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mainActivity_Juguete1);

            }});

        btn_juguete2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mainActivity_Juguete2);

            }});

        btn_juguete3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mainActivity_Juguete3);

            }});

        btn_juguete4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mainActivity_Juguete4);

            }});

        btn_juguete5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mainActivity_Juguete5);

            }});

        btn_juguete6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mainActivity_Juguete6);

            }});

        btn_juguete7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mainActivity_Juguete7);

            }});

        btn_juguete8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mainActivity_Juguete8);

            }});
    }
}