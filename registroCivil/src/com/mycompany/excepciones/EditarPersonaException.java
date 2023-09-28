/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;
import com.mycompany.registrocivil.Clases.Persona;

/**
 *
 * @author ageof
 */
public class EditarPersonaException extends Exception{
    private String r;
    private Persona p;
    
    public EditarPersonaException(String rut, Persona persona)
    {
        super();
        r = rut;
        p = persona;
    }
    
    public String getExcepction()
    {  
        if(r.equals("")) 
            return "rut";
        if(p == null)
            return "persona";
        return null;
    }
}
