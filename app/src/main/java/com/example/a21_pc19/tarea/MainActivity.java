package com.example.a21_pc19.tarea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Declaracion de variables
    private Button btn1;
    private Button btn2;
    private Button btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inicializacion de las variables
        this.btn1 = findViewById(R.id.btn1);
        this.btn2 = findViewById(R.id.btn2);
        this.btn3 = findViewById(R.id.btn3);
        //Etablecemos los LISTENER D ELOS BOTONES
        this.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Agregamos el codigo que queremos que ejecute el programa cuando damos click al boton
                //Abrir la Activity ANIMACION
                Intent nuevo = new Intent(MainActivity.this, NuevoJugador.class);
                startActivity(nuevo);

            }
        });
        this.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Agregamos el codigo que queremos que ejecute el programa cuando damos click al boton
                //Abrir la Activity ANIMACION
                Intent nuevo = new Intent(MainActivity.this, IniciarJuego.class);
               // nuevo.putExtra("Jugador:",txtNombre);
                startActivity(nuevo);


            }
        });
        this.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Agregamos el codigo que queremos que ejecute el programa cuando damos click al boton
                //Abrir la Activity ANIMACION
                Intent nuevo = new Intent(MainActivity.this, Puntaje.class);
                startActivity(nuevo);

            }
        });
    }
}
