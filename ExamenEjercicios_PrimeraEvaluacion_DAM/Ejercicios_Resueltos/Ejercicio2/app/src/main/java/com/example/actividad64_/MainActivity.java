package com.example.actividad64_;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    private TextView texto;
    private RadioButton radioButton_pulsado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //TextView miTexto = (TextView) findViewById(R.id.textView);
       //miTexto.setTextColor(Color.RED);
        lista = (ListView) findViewById(R.id.milista); //parte 6.2 pone "los enlazaremos con los objetos de la vista."

        ArrayList<Encapsulador> datos = new ArrayList<Encapsulador>();
        datos.add(new Encapsulador(R.drawable.ima1, "Croacia, la perla del Este", "MIGUEL ÁNGEL LARA 12-12-2022 07:07", true));

        datos.add(new Encapsulador(R.drawable.ima2, "La secuela que sufre Nuria Roca tras padecer la COVID por tercera vez: \"Es un horror\"", "SMM 12-12-2022 07:05", false));

        datos.add(new Encapsulador(R.drawable.ima3, "Las ideas de MotoGP para crecer, la seguridad, las radios...", "JAIME MARTÍN 12-12-2022 07:02", false));

        datos.add(new Encapsulador(R.drawable.ima4, "Las portadas del día: Griezmann, Messi, Mbappé...", "12-12-2022 06:29", false));

        datos.add(new Encapsulador(R.drawable.ima5, "Raúl avala la apuesta por Vinicius Tobías: \"Ofensivamente tiene calidad y cada vez se atreve a más y más cosas\"", "SILVIA TAMARAL 12-12-2022 06:14", false));

        datos.add(new Encapsulador(R.drawable.ima6, "El otro Brozovic: tatuajes, Epic Brozo, los dardos, el cocodrilo, las multas...", "MIGUEL ÁNGEL LARA 12-12-2022 06:10", false));

        datos.add(new Encapsulador(R.drawable.ima7, "Meten 120 puntos de tres sin tirar de dos y ganan: el \"experimento\" que reinventa el baloncesto con 111 triples", "ENRIQUE CORBELLA 12-12-2022 07:01", false));

        datos.add(new Encapsulador(R.drawable.ima8, "Joel Embiid machaca a los Charlotte Hornets con 53 puntos", "EFE 12-12-2022 04:55", false));

        datos.add(new Encapsulador(R.drawable.ima9, "'El último en pie', Abby consigue ganar frente al juego psicológico de Nil Ojeda", "12-12-2022 01:48", false));

        datos.add(new Encapsulador(R.drawable.ima10, "Conmoción en Málaga por la muerte de un jugador infantil en pleno partido", "JUANJE FERNÁNDEZ 12-12-2022 01:44", false));
        lista.setAdapter(new Adaptador(this, R.layout.entrada, datos) {
            @Override
            public void onEntrada(Object entrada, View view) {
                TextView texto_superior_entrada = (TextView) view.findViewById(R.id.texto_titulo);
                TextView texto_inferior_entrada = (TextView) view.findViewById(R.id.texto_datos);
                ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imagen);
                //RadioButton miRadio = (RadioButton) view.findViewById(R.id.boton);


                texto_superior_entrada.setText(((Encapsulador) entrada).getTitulo());
                texto_inferior_entrada.setText(((Encapsulador) entrada).getTexto());
                imagen_entrada.setImageResource(((Encapsulador) entrada).getImagen());


                imagen_entrada.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Log.i("campo", "hola");
                        Toast toast = Toast.makeText(getApplicationContext(),"MENSAJE", Toast.LENGTH_SHORT);

                        toast.setGravity(Gravity.CENTER|Gravity.LEFT,0,0);
                    }
                });


              /*  miRadio.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if (radioButton_pulsado != null) radioButton_pulsado.setChecked(false);
                        radioButton_pulsado = (RadioButton) v;
                       // miTexto.setText("MARCADA UNA OPCIÓN");

                    }
                });*/

            }


        });
       /*  lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> pariente, View view, int posicion, long id) {
            Encapsulador elegido = (Encapsulador) pariente.getItemAtPosition(posicion);
            CharSequence textoelegido = "Seleccionado: " + elegido.getTexto();
                texto.setText(elegido.getTexto());

            Toast toast = Toast.makeText(getApplicationContext(),"MENSAJE", Toast.LENGTH_SHORT);

           toast.setGravity(Gravity.CENTER|Gravity.LEFT,0,0);



                Encapsulador elegido = (Encapsulador) pariente.getItemAtPosition(posicion);
                        CharSequence textoelegido = "Seleccionado: " + elegido.getTexto();
                        texto.setText(elegido.getTexto());
                Log.i("f","h");


            }
        });*/

    }//OnCreate


}