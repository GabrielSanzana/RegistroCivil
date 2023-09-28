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
public class AgregarRegionException extends Exception {
    private String n;

    public AgregarRegionException(String nombre)
    {
        super();
        n = nombre;
    }
    public String getExcepction()
    {
        if(n.equals(""))
            return "nombre";
        return null;
    }
}
