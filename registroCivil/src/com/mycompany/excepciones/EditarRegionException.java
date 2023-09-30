/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author ageof
 */
public class EditarRegionException extends Exception{
    private String n;
    
    public EditarRegionException(String nombre)
    {
        super();
        n = nombre;
    }
    
    public String getExcepction()
    {  
        if(n.equals("Seleccione")) 
            return "región";
        return null;
    }
}
