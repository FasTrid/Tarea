package com.example.a21_pc19.tarea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NuevoJugador extends AppCompatActivity {
    private Button btnAceptar;
    private EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_jugador);

        this.btnAceptar = findViewById(R.id.btnAceptar);
        this.txtNombre = findViewById(R.id.txtNombre);

        this.btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dato = txtNombre.getText().toString();
                Intent nuevo = new Intent(NuevoJugador.this, MainActivity.class);
                nuevo.putExtra("Jugador:",dato);
                Toast.makeText(NuevoJugador.this,"Jugador: "+dato,Toast.LENGTH_SHORT).show();
                //startActivity(nuevo);
            }
        });
    }
}
