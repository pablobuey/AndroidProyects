package com.example.examenejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button) findViewById(R.id.button);

        Toast toast = Toast.makeText(getApplicationContext(), "VALIDADO", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER | Gravity.LEFT, 0, 0);

        Toast toast2 = Toast.makeText(getApplicationContext(), "NO VALIDADO", Toast.LENGTH_SHORT);
        toast2.setGravity(Gravity.CENTER | Gravity.LEFT, 0, 0);




        Toast toastMail = Toast.makeText(getApplicationContext(), "PROBANDO PASS", Toast.LENGTH_SHORT);
        toastMail.setGravity(Gravity.CENTER | Gravity.LEFT, 0, 0);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText emailLeido = (EditText) findViewById(R.id.escribirEmail);
                String cadenaEmail = emailLeido.getText().toString();
                EditText passwordLeido = (EditText) findViewById(R.id.passwordLeido);
                String cadenaPassword = passwordLeido.getText().toString();

                Toast toast3 = Toast.makeText(getApplicationContext(), cadenaEmail, Toast.LENGTH_SHORT);
                toast3.setGravity(Gravity.CENTER | Gravity.LEFT, 0, 0);


              //  toast3.show();

                if (cadenaEmail.equals("admin@prueba.com")) {

                    if (cadenaPassword.equals("1234")) {

                        toast.show();

                    } else {
                        toast2.show();
                    }; //pass


                }//mail

                else {

                }

            }
        });


    }
}