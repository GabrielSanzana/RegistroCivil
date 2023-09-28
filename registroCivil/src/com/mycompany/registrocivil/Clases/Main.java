package com.mycompany.registrocivil.Clases;

import com.mycompany.registrocivil.Clases.ConjuntoRegiones;
import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        ConjuntoRegiones conjuntoRegiones = new ConjuntoRegiones();    
        conjuntoRegiones.cargarCSVsDesdeCarpeta();
        Region test = conjuntoRegiones.buscarRegion("Región de Los Lagos");
        test.cargarPersonasDesdeCSV("test.csv");
        test = conjuntoRegiones.buscarRegion("Región de Valparaíso");
        test.cargarPersonasDesdeCSV("test.csv");
        conjuntoRegiones.exportarCSVsTodasLasRegiones();
    }
}
