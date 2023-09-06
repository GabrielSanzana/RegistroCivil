import java.util.*;
import java.io.*;
public class Persona
{
  private String rut;
  private String nombre;
  private int estadoCivil; //0 soltero, 1 casado, 2 divorciado, 3 viudo, 4 separado 
  private String fechaNacimiento;
  private String defuncion;
  
  public Persona(String rut, String nombre,String fNac)
  {
      this.rut = rut;
      this.nombre = nombre;    
      this.estadoCivil = 0;
      this.fechaNacimiento = fNac;
      this.defuncion = "Sin fallecimiento reportado";
  }
  
  public Persona(String rut, String nombre,String fNac, int estado)
  {
    this.rut = rut;
    this.nombre = nombre;    
    this.estadoCivil = 0;
    this.fechaNacimiento = fNac;
    this.defuncion = "Sin fallecimiento reportado";
  }
    
  public Persona(String rut, String nombre, int estado, String fNac, String def)
  {
    this.rut = rut;
    this.nombre = nombre;    
    this.estadoCivil = estado;
    this.fechaNacimiento = fNac;
    this.defuncion = def;   
  }
  
  public String getRut()
  {
     return rut;
  }
  
  public String getNombre()
  {
    return nombre;
  }
  
  public String getEstadoCivil()
  {
    String []arr = {"Soltero/a","Casado/a" , "Divorciado/a" ,"Viudo/a" ,"Separado/a"};
    return arr[estadoCivil];
  }
    
  public String getFNac()
  {
    return fechaNacimiento;
  }
  
  public String getDef()
  {
    return defuncion;
  }  
  
  public void cambiarEstadoCivil(int nuevoEstado) {
    this.estadoCivil = nuevoEstado;
  }

  public void cambiarEstadoCivil(String nuevoEstadoCivil) {
    if (nuevoEstadoCivil.equalsIgnoreCase("soltero")) {
        this.estadoCivil = 0;
    } else if (nuevoEstadoCivil.equalsIgnoreCase("casado")) {
        this.estadoCivil = 1;
    } else if (nuevoEstadoCivil.equalsIgnoreCase("divorciado")) {
        this.estadoCivil = 2;
    } else if (nuevoEstadoCivil.equalsIgnoreCase("viudo")) {
        this.estadoCivil = 3;
    } else if (nuevoEstadoCivil.equalsIgnoreCase("separado")) {
        this.estadoCivil = 4;
    }
  }

  public void cambiarNombre(String nombreNuevo)
  {
    this.nombre = nombreNuevo;
  }
  
}