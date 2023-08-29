import java.util.*;
import java.io.*;
public class Persona
{
    private String rut;
    private String nombre;
    private int estadoCivil; //0 soltero, 1 casado, 2 divorciado
    private String fechaNacimiento;
    private String defuncion;
    
    public Persona(String fNac, String rut, String nombre)
    {
        this.rut = rut;
        this.nombre = nombre;    
        this.estadoCivil = 0;
        this.fechaNacimiento = fNac;
        this.defuncion = null;
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
}