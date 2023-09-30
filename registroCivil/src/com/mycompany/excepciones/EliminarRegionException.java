/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author ageof
 */
public class EliminarRegionException extends Exception{
    private String n;
    
    public EliminarRegionException(String nombre)
    {
        super();
        n = nombre;
    }
    
    public String getExcepction()
    {  
        if(n.equals("")) 
            return "región";
        return null;
    }
}
