import java.util.*;
import java.io.*;
public class Region 
{
    private HashMap <String, Persona> mapaPers;
    private int cantPersonas;
    private String nombreRegion;
    private ArrayList<Persona> personas;

    public Region(String region)
    {
        this.nombreRegion = region;
        this.cantPersonas = 0;
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
    }
  
    public void agregarPersona(String rut, String nombre, int estado, String fNac, String def)
    {
        Persona aux = new Persona(rut,  nombre,  estado,  fNac,  def);
        mapaPers.put(rut,aux);
        personas.add(aux);

    }
  /*
    public void agregarNPersonas(int n) throws IOException
    {
      for(int i = 0; i < n; i++)
        {
          System.out.println("Ingrese el rut, nombre, estado civil, fecha de nacimineto y defunción (vacio si no lo tiene) de la persona a ingresar, separando por saltos de linea en cada caso");
          BufferedReader lector = new BufferedReader( new InputStreamReader( System.in ) );
          String rut = lector.readLine();
          String nombre = lector.readLine();
          int estado  = Integer.parseInt(lector.readLine());
          String fNac = lector.readLine();
          String def =  lector.readLine();
          agregarPersona(rut, nombre, estado, fNac, def);
        }
    }
  public void registroNacimiento(){
    
  }
  public void registroMatrimonio(String rut1, String rut2){
    
  }
  public void registroDefuncion(String rut){
    //pasaporte, acta de nacimiento, acta de defuncion, certificados, etc
  }
  public void generarActas(String rut){
    
  }
  public void divorcios(String rut1, String rut2)(){
    
  }
  */
}