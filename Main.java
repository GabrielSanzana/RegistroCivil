import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        ConjuntoRegiones conjuntoRegiones = new ConjuntoRegiones();
        int opcion;
        String rut, nombre, fNac;
        
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
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String regionSeleccionadaNombre;
        Region regionSeleccionada;
        
        while (true) {
            System.out.println("====== MENU ======");
            System.out.println("1) Agregar persona.");
            System.out.println("2) Mostrar listado de personas.");
            System.out.println("3) Salir.");
            opcion = Integer.parseInt(lector.readLine());
            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println("Ingrese el nombre de la región:");
                    regionSeleccionadaNombre = lector.readLine();
                    regionSeleccionada = conjuntoRegiones.buscarRegion(regionSeleccionadaNombre); // Utiliza el nombre aquí
                    if (regionSeleccionada != null) {
                        System.out.println();
                        System.out.println("Ingrese los siguientes datos:");
                        System.out.print("RUT: ");
                        rut = lector.readLine();
                        System.out.print("Nombre: ");
                        nombre = lector.readLine();
                        System.out.print("Fecha de Nacimiento: ");
                        fNac = lector.readLine();
                        regionSeleccionada.agregarPersona(rut, nombre, fNac);
                    } else {
                        System.out.println("Región no encontrada. Volviendo al menú.");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Ingrese el nombre de la región:");
                    regionSeleccionadaNombre = lector.readLine();
                    regionSeleccionada = conjuntoRegiones.buscarRegion(regionSeleccionadaNombre); // Utiliza el nombre aquí
                    if (regionSeleccionada != null) {
                        regionSeleccionada.mostrarDatosPoblacion();
                    } else {
                        System.out.println("Región no encontrada. Volviendo al menú.");
                        System.out.println();
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opción invalida.");
                    break;
            }
        }
    }
}
