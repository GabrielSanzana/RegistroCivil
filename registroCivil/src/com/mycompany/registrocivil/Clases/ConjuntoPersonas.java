package com.mycompany.registrocivil.Clases;
import java.util.*;

public class ConjuntoPersonas {
    private int totalPersonas;
    private ArrayList<Persona> personas;
    private HashMap<String, Persona> mapaPers;
    private HashMap<String, ArrayList<Persona>> mapaNombre;
    private HashMap<String, ArrayList<Persona>> mapaEstadoCivil;
    private HashMap<String, ArrayList<Persona>> mapaFechaNacimiento;
    private HashMap<String, ArrayList<Persona>> mapaDefuncion;

    public ConjuntoPersonas() {
        this.totalPersonas = 0;
        personas = new ArrayList<>();
        mapaPers = new HashMap<>();
        mapaNombre = new HashMap<>();
        mapaEstadoCivil = new HashMap<>();
        mapaFechaNacimiento = new HashMap<>();
        mapaDefuncion = new HashMap<>();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public Persona buscarPersona(String rut) {
        if (mapaPers.containsKey(rut))
            return mapaPers.get(rut);
        return null;
    }

    public Persona eliminarPersona(String rut) {
        if (!mapaPers.containsKey(rut))
            return null;
        Persona aux = mapaPers.get(rut);
        personas.remove(aux);
        actualizarMapas(aux, true);
        mapaPers.remove(rut);
        totalPersonas--;
        return aux;
    }

    public boolean agregarPersona(String rut, String nombre, int estado, String fNac, String def) {
        if (mapaPers.containsKey(rut))
            return false;
        if (def == null || def.equals("") == true) {
            if (estado != 0)
                agregarPersona(rut, nombre, fNac, estado);
            else
                agregarPersona(rut, nombre, fNac);
            return true;
        }
        Persona aux = new Persona(rut, nombre, estado, fNac, def);
        mapaPers.put(rut, aux);
        personas.add(aux);
        actualizarMapas(aux, false);
        totalPersonas++;
        return true;
    }
    

    public void agregarPersona(String rut, String nombre, String fNac) {
        Persona aux = new Persona(rut, nombre, fNac);
        mapaPers.put(rut, aux);
        personas.add(aux);
        actualizarMapas(aux, false);
        totalPersonas++;
    }

    public void agregarPersona(String rut, String nombre, String fNac, int estado) {
        Persona aux = new Persona(rut, nombre, fNac, estado);
        mapaPers.put(rut, aux);
        personas.add(aux);
        actualizarMapas(aux, false);
        totalPersonas++;
    }

    public int getCant() {
        return totalPersonas;
    }
    
    public HashMap<String, ArrayList<Persona>> getMapas(int i) {
        switch (i) {
            case 0:
                return mapaNombre;
            case 1:
                return mapaFechaNacimiento;
            case 2:
                return mapaDefuncion;
            case 3:
                return mapaEstadoCivil;
            default:
                // En caso de un valor de 'i' no válido, puedes manejarlo de acuerdo a tus necesidades
                return null;
        }
    }
    public String[][] mostrarPersonas() {
        String[][] arr = new String[personas.size()][5];
        for (int i = 0; i < personas.size(); i++) {
            Persona persona = personas.get(i);
            arr[i][0] = persona.getRut();
            arr[i][1] = persona.getNombre();
            arr[i][2] = persona.getFNac();
            arr[i][3] = persona.getDef();
            arr[i][4] = persona.getEstadoCivil();
        }
        return arr;
    }
    
    private void actualizarMapas(Persona persona, boolean eliminar) {
      String rut = persona.getRut();
      String nombre = persona.getNombre();
      String estadoCivil = persona.getEstadoCivil();
      String fechaNacimiento = persona.getFNac();
      String defuncion = persona.getDef();
  
      if (!eliminar) {
          // Agregar la persona a la lista asociada al nombre
          if (mapaNombre.containsKey(nombre)) {
              mapaNombre.get(nombre).add(persona);
          } else {
              ArrayList<Persona> listaNombre = new ArrayList<>();
              listaNombre.add(persona);
              mapaNombre.put(nombre, listaNombre);
          }
  
          // Agregar la persona a la lista asociada al estado civil
          if (mapaEstadoCivil.containsKey(estadoCivil)) {
              mapaEstadoCivil.get(estadoCivil).add(persona);
          } else {
              ArrayList<Persona> listaEstadoCivil = new ArrayList<>();
              listaEstadoCivil.add(persona);
              mapaEstadoCivil.put(estadoCivil, listaEstadoCivil);
          }
  
          // Agregar la persona a la lista asociada a la fecha de nacimiento
          if (mapaFechaNacimiento.containsKey(fechaNacimiento)) {
              mapaFechaNacimiento.get(fechaNacimiento).add(persona);
          } else {
              ArrayList<Persona> listaFechaNacimiento = new ArrayList<>();
              listaFechaNacimiento.add(persona);
              mapaFechaNacimiento.put(fechaNacimiento, listaFechaNacimiento);
          }
  
          // Agregar la persona a la lista asociada a la defunciÃ³n
          if (mapaDefuncion.containsKey(defuncion)) {
              mapaDefuncion.get(defuncion).add(persona);
          } else {
              ArrayList<Persona> listaDefuncion = new ArrayList<>();
              listaDefuncion.add(persona);
              mapaDefuncion.put(defuncion, listaDefuncion);
          }
      } else {
            mapaNombre.get(nombre).remove(persona);
            mapaEstadoCivil.get(estadoCivil).remove(persona);
            mapaFechaNacimiento.get(fechaNacimiento).remove(persona);
            mapaDefuncion.get(defuncion).remove(persona);
    }
  }
  
}