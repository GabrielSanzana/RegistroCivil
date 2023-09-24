package com.mycompany.registrocivil.Clases;

import com.mycompany.registrocivil.Clases.ConjuntoRegiones;
import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        ConjuntoRegiones conjuntoRegiones = new ConjuntoRegiones();        
        conjuntoRegiones.agregarRegion("Región de Tarapacá");
        conjuntoRegiones.agregarRegion("Región de Antofagasta");
        conjuntoRegiones.agregarRegion("Región de Atacama");
        conjuntoRegiones.agregarRegion("Región de Coquimbo");
        conjuntoRegiones.agregarRegion("Región de Valparaíso");
        conjuntoRegiones.agregarRegion("Región de O'Higgins");
        conjuntoRegiones.agregarRegion("Región Metropolitana de Santiago");
        conjuntoRegiones.agregarRegion("Región del Maule");
        conjuntoRegiones.agregarRegion("Región de Ñuble");
        conjuntoRegiones.agregarRegion("Región de Biobío");
        conjuntoRegiones.agregarRegion("Región de La Araucanía");
        conjuntoRegiones.agregarRegion("Región de Los Lagos");
        conjuntoRegiones.agregarRegion("Región de Aysén del General Carlos Ibáñez del Campo");
        conjuntoRegiones.agregarRegion("Región de Magallanes y de la Antártica Chilena");
        conjuntoRegiones.agregarRegion("Región de Los Ríos");
        conjuntoRegiones.agregarRegion("Región de Arica y Parinacota");
        Region test = conjuntoRegiones.buscarRegion("Región de Los Lagos");
        test.cargarPersonasDesdeCSV("test.csv");
        
    }
}
