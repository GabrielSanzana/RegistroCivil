/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrocivil;
import com.mycompany.registrocivil.Clases.ConjuntoRegiones;
/**
 *
 * @author ageof
 */
public class run {
    public static void main(String [] args)
    {
        ConjuntoRegiones conjuntoRegiones = new ConjuntoRegiones();
        conjuntoRegiones.cargarXlsDesdeCarpeta();
        conjuntoRegiones.cargarVotantesXlsDesdeCarpeta();
        VentanaPrincipal frame = new VentanaPrincipal(conjuntoRegiones);
        frame.setVisible(true);
    }    
}
