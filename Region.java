import java.util.*;
import java.io.*;
public class Region
{
    private HashMap <String, Persona> mapaPers;
    private int cantPersonas;
    private String nombreRegion;
    public Region(String region)
    {
        this.nombreRegion = region;
        this.cantPersonas = 0;
        HashMap<String, Persona> mapaPers = new HashMap<>();
    }

    public Persona buscarPersona(String rut)
    {
        return mapaPers.get(rut);
    }
    
    public void eliminarPersona(String rut)
    {
        mapaPers.remove(rut);
    }
    public void agregarPersona(String rut, String nombre, int estado, String fNac, String def)
    {
        Persona aux = new Persona(rut,  nombre,  estado,  fNac,  def);
        mapaPers.put(rut,aux);
    }
}