/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.registrocivil.Clases;

/**
 *
 * @author patru
 */
public class Votante extends Persona {
    int anioRegistro;
    String partido;
    public Votante(String rut, String nombre,String fNac, int estado, int anio, String p)
    {
        super(rut,nombre,fNac,estado);
        this.anioRegistro = anio;
        this.partido = p;
    }

    public int getAnioRegistro() {
        return anioRegistro;
    }

    public void setAnioRegistro(int anioRegistro) {
        this.anioRegistro = anioRegistro;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
    
    
}
