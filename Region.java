import java.util.*;
import java.io.*;
public class Region 
{
  private String nombreRegion;
  private ConjuntoPersonas aldeanos;
  
  public Region(String region)
  {
      this.nombreRegion = region;
      aldeanos = new ConjuntoPersonas();
  }
  public Region(String region, int cantPers)
  {
    this.nombreRegion = region;
    aldeanos = new aldeanos(cantPers);
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