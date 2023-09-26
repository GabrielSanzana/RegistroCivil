package com.mycompany.registrocivil.Clases;

import java.util.*;
import java.io.*;
//Falta arreglar en agregar persona, que no se pueda agregar si ya existe alguien con el mismo rut.
public class ConjuntoPersonas
{
  private int totalPersonas;
  private ArrayList<Persona> personas;
  private HashMap <String, Persona> mapaPers;

  public ConjuntoPersonas()
  {
    this.totalPersonas = 0;
    mapaPers = new HashMap<>();
    personas = new ArrayList<>();
  }
  public ArrayList<Persona> getPersonas()
  {
    return personas;
  }
  
  
  
  public Persona buscarPersona(String rut)
  {
    if(mapaPers.containsKey(rut))
        return mapaPers.get(rut);
    return null;
  }
    
  public Persona eliminarPersona(String rut)
  {
    Persona aux = mapaPers.get(rut);
    personas.remove(aux);
    mapaPers.remove(rut);
    totalPersonas --;
    System.out.println("Se ha eliminado exitosamente a la persona.");
    System.out.println();
    return aux;
  }

  //agregar cuando se tienen todos los campos de persona
  public boolean agregarPersona(String rut, String nombre, int estado, String fNac, String def) 
  {
    if(mapaPers.containsKey(rut))
        return false;
    if(def == null){
        if(estado != 0)
            agregarPersona(rut,nombre,fNac,estado);
        else agregarPersona(rut,nombre,fNac);
        return true;
    }
    Persona aux = new Persona(rut,  nombre,  estado,  fNac,  def);
    mapaPers.put(rut,aux);
    personas.add(aux);
    this.totalPersonas++;
    return true;
  }
  
  //agregar cuando nace una persona, solo tiene nombre, rut y fecha de nacimiento determinados
  public void agregarPersona(String rut, String nombre, String fNac )
  {
    Persona aux = new Persona(rut, nombre, fNac);
    mapaPers.put(rut,aux);
    personas.add(aux);
    this.totalPersonas++;
  }

  //agregar cuando se sabe el rut, nombre, fecha de nacimiento y estado civil
  public void agregarPersona(String rut, String nombre, String fNac, int estado )
  {
    Persona aux = new Persona(rut, nombre, fNac, estado);
    mapaPers.put(rut,aux);
    personas.add(aux);
    totalPersonas++;
  }
  public int getCant()
  {
    return totalPersonas;
  }
  
  public String[][] mostrarPersonas() {
    System.out.println();
    String [][] arr = new String[][];
    
    for (Persona persona : personas) 
    {              
      System.out.println("————————————————————————————————————————————————");
      System.out.println("RUT: " + persona.getRut());
      System.out.println("Nombre: " + persona.getNombre());
      System.out.println("Estado Civil: " + persona.getEstadoCivil());
      System.out.println("Fecha de Nacimiento: " + persona.getFNac());
      System.out.println("Defunción: " + persona.getDef());   
    }
    System.out.println("————————————————————————————————————————————————");
    System.out.println();
  }
}

  