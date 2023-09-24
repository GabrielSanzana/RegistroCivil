package com.mycompany.registrocivil.Clases;

import java.util.*;
import java.io.*;
public class ConjuntoRegiones {
    private int totalRegiones;
    private ArrayList<Region> regiones;
    private HashMap<String, Region> mapaRegiones;

    public ConjuntoRegiones() {
        this.totalRegiones = 0;
        regiones = new ArrayList<>();
        mapaRegiones = new HashMap<>();
    }
    
    public ArrayList<Region> obtenerTodasLasRegiones() {
        return regiones;
    }

    public void exportarCSVsTodasLasRegiones() {
        // Crear el directorio (carpeta) si no existe
        File folder = new File("CarpetaRegiones");
        if (!folder.exists()) {
            boolean success = folder.mkdirs();
            if (success) {
                System.out.println("Directorio creado con éxito: " + "CarpetaRegiones");
            } else {
                System.err.println("Error al crear el directorio: " + "CarpetaRegiones");
                return;
            }
        }

        // Obtener la lista de todas las regiones
        ArrayList<Region> todasLasRegiones = obtenerTodasLasRegiones();

        // Exportar archivos CSV para cada región
        for (int i = 0; i < todasLasRegiones.size(); i++) {
            Region region = todasLasRegiones.get(i);
            String nombreRegion = region.getName();
            String filePath = "CarpetaRegiones" + File.separator + nombreRegion + ".csv";

            region.exportarPersonasACSV(filePath);
        }
    }
    
    public String[] obtenerNombresRegiones() {
     String[] nombres = new String[totalRegiones];
     for (int i = 0; i < totalRegiones; i++) {
        nombres[i] = regiones.get(i).getName();
    }
    return nombres;
    }
    
    public Region buscarRegion(String n)
    {
        if(mapaRegiones.containsKey(n) == false)
            return null;
        return mapaRegiones.get(n);
    }
    
    public void agregarRegion(String nombreRegion) {
        Region nuevaRegion = new Region(nombreRegion);
        regiones.add(nuevaRegion);
        mapaRegiones.put(nombreRegion, nuevaRegion);
        totalRegiones++;
        System.out.println("Se ha agregado exitosamente la región: " + nombreRegion + ".");
    }
    
     public void agregarRegion(Region region) {
        regiones.add(region);
        mapaRegiones.put(region.getName(), region);
        totalRegiones++;
    }
    

    public void agregarPersona(String nombreRegion, String rut, String nombre, String fNac, int estado, String def) {
        Region region = buscarRegion(nombreRegion);
        if (region == null) {
            System.out.println("No existe la región buscada: " + nombreRegion);
            return;
        }
        region.agregarPersona(rut, nombre, estado,fNac, def);
    }
    
    public int getTotalRegiones() {
        return totalRegiones;
    }

    // Métodos para manipular objetos Región
    public void eliminarRegion(String nombreRegion) {
        Region region = mapaRegiones.get(nombreRegion);
        if (region != null) {
            regiones.remove(region);
            mapaRegiones.remove(nombreRegion);
            totalRegiones--;
            System.out.println("Se ha eliminado exitosamente la región: " + nombreRegion + ".");
        } else {
            System.out.println("No existe la región buscada: " + nombreRegion);
        }
    }

    public void cargarCSVsDesdeCarpeta() {
        File folder = new File("CarpetaRegiones");

        if (!folder.exists() || !folder.isDirectory()) {
            System.err.println("La carpeta especificada no existe.");
            return;
        }

        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            System.err.println("La carpeta está vacía.");
            return;
        }

        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".csv")) {
                String nombreRegion = file.getName().replace(".csv", "");
                // Crea una nueva región con el nombre obtenido del nombre del archivo CSV
                Region region = new Region(nombreRegion);
                System.out.println("Creando región: " + nombreRegion);

                try {
                    // Llama al método cargarPersonasDesdeCSV de la región para cargar los datos
                    region.cargarPersonasDesdeCSV(file.getPath());
                    // Agrega la región al conjunto de regiones
                    agregarRegion(region);
                    System.out.println("Se cargaron los datos del archivo " + file.getName() + " en la región " + nombreRegion);
                } catch (IOException e) {
                    System.err.println("Error al cargar el archivo CSV: " + file.getName());
                    e.printStackTrace();
                }
            }
       }
   }

    
    public void mostrarRegiones() {
        System.out.println("Regiones disponibles:");
        for (Region region : regiones) {
            System.out.println(region.getName());
        }
    }

    public int getCantidadPersonasEnRegion(String nombreRegion) {
        Region region = buscarRegion(nombreRegion);
        if (region != null) {
            return region.getCant();
        } else {
            System.out.println("No existe la región buscada: " + nombreRegion);
            return 0;
        }
    }
    
    public Persona eliminarPersona(String r){
        for(int i = 0; i < regiones.size(); i++){
            Region aux = regiones.get(i);
            if(aux.obtenerPersona(r) != null)
                return aux.obtenerPersona(r);
                
        }
        return null;
    }
    
    public Persona eliminarPersona(String r, String region){
        Region aux = mapaRegiones.get(region);
        if(aux.obtenerPersona(r) != null)
            return aux.obtenerPersona(r);
                
        return null;
    }
    
    public void mostrarDatosPersonaEnRegion(String nombreRegion, String rut) {
        Region region = buscarRegion(nombreRegion);
        if (region != null) {
            region.mostrarDatosPersona(rut);
        } else {
            System.out.println("No existe la región buscada: " + nombreRegion);
        }
    }

    public void mostrarDatosPoblacionEnRegion(String nombreRegion) {
        Region region = buscarRegion(nombreRegion);
        if (region != null) {
            region.mostrarDatosPoblacion();
        } else {
            System.out.println("No existe la región buscada: " + nombreRegion);
        }
    }
    
    
}