/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author ageof
 */
public class FiltrarException extends Exception{
    private String [][] a;
    
    public FiltrarException(String [][] arr)
    {
        super();
        a = arr;
    }
    
    public String getExcepction()
    {  
        if(a == null) 
            return "vacío";
        return null;
    }
}
