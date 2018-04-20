package com.example.alumno.clase4;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by alumno on 19/04/2018.
 */

public class MyViewHolder extends RecyclerView.ViewHolder{

    public TextView tvApellido;
    public TextView tvNombre;
    public MyListener ml;

    public MyViewHolder(View v) {
        super(v);
        tvApellido = (TextView)v.findViewById(R.id.Apellido);
        tvNombre = (TextView)v.findViewById(R.id.tvNombre);

        //al apretar el boton , devolver posicion del indice.
    }
    public void darPosicion(int posicion)
    {
        itemView.setOnClickListener(new MyListener(posicion));
    }
}
