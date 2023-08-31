import java.util.*;
import java.io.*;

public class ConjuntoPersonas
{
  private int totalPersonas;
  private ArrayList<Persona> personas;
  private HashMap <String, Persona> mapaPers;

  public ConjuntoPersonas()
  {
    this.totalPersonas = 0;
    HashMap<String, Persona> mapaPers = new HashMap<>();
    ArrayList<Persona> personas = new ArrayList<>();
  }

  public Persona buscarPersona(String rut)
  {
    return mapaPers.get(rut);
  }
    
  public void eliminarPersona(String rut)
  {
    Persona aux = mapaPers.get(rut);
    personas.remove(rut);
    mapaPers.remove(rut);
    totalPersonas --;
  }

  //agregar cuando se tienen todos los campos de persona
  public void agregarPersona(String rut, String nombre, int estado, String fNac, String def) 
  {
    Persona aux = new Persona(rut,  nombre,  estado,  fNac,  def);
    mapaPers.put(rut,aux);
    personas.add(aux);
    this.totalPersonas++;
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
    Persona aux = new Persona(rut, nombre, fNac);
    mapaPers.put(rut,aux);
    personas.add(aux);
    totalPersonas++;   
  }
}