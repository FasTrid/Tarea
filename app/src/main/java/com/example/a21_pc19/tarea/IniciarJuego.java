package com.example.a21_pc19.tarea;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class IniciarJuego extends AppCompatActivity {
    //declaracion de variables
    private Button btnPiedra;
    private  Button btnPapel;
    private Button btnTijera;
    private  Button btnFin;
    private TextView txtPuntaje;
    int Jugadorpuntaje =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_juego);
        //Inicializacion de las variables
        this.btnPiedra = findViewById(R.id.btnPiedra);
        this.btnPapel = findViewById(R.id.btnPapel);
        this.btnTijera = findViewById(R.id.btnTijera);
        this.txtPuntaje =findViewById(R.id.txtPuntaje);
        this.btnFin = findViewById(R.id.btnFin);

        this.btnPiedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mensaje = turno(1);
                //Toast.makeText(IniciarJuego.this,mensaje,Toast.LENGTH_SHORT).show();
                txtPuntaje.setText("Jugador:"+Integer.toString(Jugadorpuntaje)+"pts");
            }
        });
        this.btnPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mensaje = turno(2);
              //  Toast.makeText(IniciarJuego.this,mensaje,Toast.LENGTH_SHORT).show();
                txtPuntaje.setText("Jugador:"+Integer.toString(Jugadorpuntaje) + "pts");
            }
        });
        this.btnTijera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mensaje = turno(3);
                //Toast.makeText(IniciarJuego.this,mensaje,Toast.LENGTH_SHORT).show();
                txtPuntaje.setText("Jugador:"+Integer.toString(Jugadorpuntaje)+ "pts");
            }
        });
        this.btnFin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(IniciarJuego.this, "Puntuación:"  + Jugadorpuntaje,Toast.LENGTH_SHORT).show();

            }
        });
    }
    public int turno(int  elejido){
        int dispositivoselct = 0;
        Random r= new Random();
        int dispositivo_selectnum = r.nextInt(3)+1;
        if(dispositivo_selectnum ==1){
            dispositivoselct = 1;
        }
        else{
            if(dispositivo_selectnum == 2){
                dispositivoselct = 2;
            }
            else{
                if(dispositivo_selectnum ==3){
                    dispositivoselct = 3;
                }
            }
        }

        if (dispositivoselct == elejido) {
            Toast.makeText(IniciarJuego.this,"Empate",Toast.LENGTH_SHORT).show();
        }
        else if (elejido == 1 && dispositivoselct== 3) {
            Jugadorpuntaje += 6;
            Toast.makeText(IniciarJuego.this,"Roca aplasta tijeras. Ganaste!",Toast.LENGTH_SHORT).show();

        }
        else if (elejido == 1 && dispositivoselct == 2) {
            Jugadorpuntaje -=3;
            Toast.makeText(IniciarJuego.this,"Papel ccubre piedra. Pierdes!",Toast.LENGTH_SHORT).show();
        }
        else if (elejido == 2 && dispositivoselct == 3) {
            Jugadorpuntaje -=3 ;
            Toast.makeText(IniciarJuego.this,"Tijeras corta papel. Pierdes1",Toast.LENGTH_SHORT).show();
        }
        else if (elejido == 3 && dispositivoselct == 1) {
            Jugadorpuntaje -=3;
            Toast.makeText(IniciarJuego.this,"Roca aplasta tijeras. Pierdes!",Toast.LENGTH_SHORT).show();
        }
        else if (elejido == 3 && dispositivoselct == 2) {
            Jugadorpuntaje +=6;
            Toast.makeText(IniciarJuego.this,"Tijera corta papel. Ganaste!",Toast.LENGTH_SHORT).show();
        }
        else if (elejido == 2 && dispositivoselct == 1) {
            Jugadorpuntaje+=6;
            Toast.makeText(IniciarJuego.this,"Papel cubre piedra. Ganaste!",Toast.LENGTH_SHORT).show();

        } else  Toast.makeText(IniciarJuego.this,"No seguro!",Toast.LENGTH_SHORT).show();
        return dispositivoselct;
    }



}
