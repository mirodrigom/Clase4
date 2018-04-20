package com.example.alumno.clase4;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alumno on 19/04/2018.
 */

public class MiAdaptador extends RecyclerView.Adapter<MyViewHolder> {

    private List<Persona> personas;

    public MiAdaptador(List<Persona> personas)
    {
        this.personas = personas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("onCreateViewHolder","onCreateViewHolder");
        View vista = null;
        //3.Transformo el layout en un objeto View
        //El parent es el contexto
        //Te pasa un marco y de eso sacas el contexto
        //De esa viewgroup, le paso un objeto view..
        //Transformo de un layout a una vista (Objeto Java)
        vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        //2.Le paso una view que va a ser el item_layout xml al MyViewHolder
        MyViewHolder mvh = new MyViewHolder(vista);


        return mvh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.d("onBindViewHolder","onBindViewHolder");
        Persona p = personas.get(position);
        holder.darPosicion(position);
        holder.tvApellido.setText(p.getApellido());
        holder.tvNombre.setText(p.getNombre());
    }

    @Override
    //1.Cantidad de elementos que pide la pantalla al adaptador
    public int getItemCount() {
        Log.d("getItemCount","getItemCount");
        return this.personas.size();
    }

}
