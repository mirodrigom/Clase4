package com.example.alumno.clase4;

/**
 * Created by alumno on 19/04/2018.
 */

public class Persona {
    private String nom;
    private String ape;


    public Persona(String nom,String ape)
    {
        this.nom = nom;
        this.ape = ape;
    }

    public String getNombre()
    {
        return this.nom;
    }

    public String getApellido()
    {
        return this.ape;
    }
}
