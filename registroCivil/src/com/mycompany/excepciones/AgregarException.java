/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;
import java.util.Date;
/**
 *
 * @author ageof
 */
public class AgregarException extends Exception {
    private String n;
    private String r;
    private Date f;
    private String region;

    public AgregarException(String rut, String nombre, String regionSeleccionada, Date fNac)
    {
        super();
        n = nombre;
        r = rut;
        f = fNac;
        region = regionSeleccionada;
    }
    public String getExcepction()
    {
        if(r.equals(""))   
            return "rut";
        if(n.equals(""))
            return "nombre";
        if(f == null)
            return "fecha de nacimiento";
        return "región seleccionada";
    }
}
