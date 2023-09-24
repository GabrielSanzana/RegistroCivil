package com.mycompany.registrocivil.Clases;

import com.mycompany.registrocivil.Clases.ConjuntoPersonas;
import java.util.*;
import java.io.*;
public class Region 
{
  private String nombreRegion;
  private ConjuntoPersonas personas;
  
  public Region(String region)
  {
      this.nombreRegion = region;
      personas = new ConjuntoPersonas();
  }
  
  public int getCant()
  {
    return personas.getCant();
  }
  
  public String getName()
  {
    return nombreRegion;
  }

  public boolean agregarPersona(String rut, String nombre, int estado,String fNac, String defuncion)
  {
    return personas.agregarPersona(rut, nombre, estado,fNac, defuncion);
  }


  public void eliminarPersona(String rut)
  {
    personas.eliminarPersona(rut);
  }

  public void mostrarDatosPersona(String rut)
  {
    Persona auxiliar = personas.buscarPersona(rut);
    if(auxiliar == null)
    {
      System.out.println("No se encontró la persona");
      return;
    }
    auxiliar.getNombre();
    auxiliar.getFNac();
    auxiliar.getEstadoCivil();
    auxiliar.getDef();
  }

  public void mostrarDatosPoblacion()
  {
    personas.mostrarPersonas();
  }

  public void cargarPersonasDesdeCSV(String filePath) throws IOException {
      BufferedReader br = new BufferedReader(new FileReader(filePath));
      String line;
      while ((line = br.readLine()) != null) {
          String[] parts = line.split(",");
          if (parts.length == 5) {
              String rut = parts[0];
              String nombre = parts[1];
              int estadoCivil = Integer.parseInt(parts[2]);
              String fechaNacimiento = parts[3];
              String defuncion = parts[4];
              // Llama al método agregarPersona para agregar la persona al conjunto
              personas.agregarPersona(rut, nombre, estadoCivil, fechaNacimiento, defuncion);
          } else {
              System.err.println("Error: línea CSV mal formada: " + line);
          }
      }
      br.close();
  }
  
  public void registroMatrimonio(String rut1, String rut2){
    (personas.buscarPersona(rut1)).cambiarEstadoCivil(1);
    (personas.buscarPersona(rut2)).cambiarEstadoCivil(1);
  }
  public void registroDefuncion(String rut, String fecha){
    (personas.buscarPersona(rut)).registrarDefuncion(fecha);
    //pensar en poner viuda a la pareja pero eso implica llenar mas campos
  }

  public void divorciar(String rut1, String rut2){
    (personas.buscarPersona(rut1)).cambiarEstadoCivil(2);
    (personas.buscarPersona(rut2)).cambiarEstadoCivil(2);
  }
    
  public void cambiarEstadoCivil(String rut, String nuevoEstado)
  {
    (personas.buscarPersona(rut)).cambiarEstadoCivil(nuevoEstado);
  }
  
  public void cambiarEstadoCivil(String rut, int nuevoEstado)
  {
    (personas.buscarPersona(rut)).cambiarEstadoCivil(nuevoEstado);
  }

  
  /*
    
  public void registroNacimiento(){
    GENERAR UN RUT O SIMPLEMENTE QUE YA SEA EXISTENTE? SI YA EXISTE EL RUT
    DA LO MISMO, LO METEMOS A AGREGAR PERSONA Y XAO
  }
  
  
  AGREGAR CARGAR CSV PA CARGAR PERSONAS 

    public void generarActas(String rut){
    //pasaporte, acta de nacimiento, acta de defuncion, certificados, etc

  }
  */
}