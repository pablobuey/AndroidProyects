package com.example.examenejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Spinner listado = (Spinner) findViewById(R.id.spinner);
      final String[] datos = new String[]{"DNI español", "NIE español", "Pasaporte", "ID otros países"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        listado.setAdapter(adaptador);

        String elementoSelec = "";
        listado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //obtener el texto del elemento pulsado

                String elemento = (String) parent.getItemAtPosition(position);

                Log.i("elemento documento", elemento);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                //obtener el texto del elemento pulsado

            }
        });

        Button btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nombre = (EditText) findViewById(R.id.editTextTextPersonName3);
                String cadenaNombre = nombre.getText().toString();

                EditText apellido = (EditText) findViewById(R.id.editTextTextPersonName4);
                String cadenaApellido = apellido.getText().toString();

                EditText email = (EditText) findViewById(R.id.editTextTextEmailAddress3);
                String cadenaEmail = email.getText().toString();

                EditText ident = (EditText) findViewById(R.id.entradaIdentificacion);
                String cadenaIdent = email.getText().toString();

                //elemento es la lista.

                Log.i("nombre",cadenaNombre);
                Log.i("apellido", cadenaApellido);
                Log.i("email", cadenaEmail);
                Log.i("identificador", cadenaIdent);


            }
        });

    }//ONCREATE



}