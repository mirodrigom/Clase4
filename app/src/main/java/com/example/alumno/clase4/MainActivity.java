package com.example.alumno.clase4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Matias","Ramos"));
        personas.add(new Persona("Juan","Ramos"));
        personas.add(new Persona("Perez","Ramos"));
        personas.add(new Persona("Marcelo","Ramos"));
        personas.add(new Persona("Claudio","Ramos"));
        personas.add(new Persona("Rodrigo","Ramos"));
        personas.add(new Persona("Marcos","Ramos"));
        personas.add(new Persona("Miguel","Ramos"));
        personas.add(new Persona("Matias","Ramos"));
        personas.add(new Persona("Juan","Ramos"));
        personas.add(new Persona("Perez","Ramos"));
        personas.add(new Persona("Marcelo","Ramos"));
        personas.add(new Persona("Claudio","Ramos"));
        personas.add(new Persona("Rodrigo","Ramos"));
        personas.add(new Persona("Marcos","Ramos"));
        personas.add(new Persona("Miguel","Ramos"));

        MyListener ml = new MyListener(0);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        MiAdaptador ma = new MiAdaptador(personas);
        // A quien le tiene que dar la informacion:
        rv.setAdapter(ma);
        //Puede ser grilla o una linearlayout
        rv.setLayoutManager(new LinearLayoutManager(this));

        //Agregar 5 personas desde un boton y hacer el notifyDataSetChange del adapador
        //Notifydatasetchange cuando algo en personas cambio

    }
}
