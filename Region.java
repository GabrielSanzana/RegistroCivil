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

  public void agregarPersona(String rut, String nombre, String fNac, int estado)
  {
    personas.agregarPersona(rut, nombre, fNac, estado);
  }
  
  public void agregarPersona(String rut, String nombre, String fNac)
  {
    personas.agregarPersona(rut, nombre, fNac);
  }

  public void agregarPersona(String rut, String nombre, String fNac, int estado, String def)
  {
    personas.agregarPersona(rut, nombre, estado, fNac, def);
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
  }

  public void divorcios(String rut1, String rut2)(){
  
  }
  public void cambiarEstadoCivil(String rut)
  AGREGAR CARGAR CSV PA CARGAR PERSONAS 

    public void generarActas(String rut){
    //pasaporte, acta de nacimiento, acta de defuncion, certificados, etc

  }
  */
}