package com.mycompany.registrocivil.Clases;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.io.*;
public class Region 
{
  private String nombreRegion;
  private ConjuntoPersonas personas;
  private ConjuntoVotantes votantes;
  
  public Region(String region)
  {
      this.nombreRegion = region;
      personas = new ConjuntoPersonas();
      votantes = new ConjuntoVotantes();
  }
  
  public int getCant()
  {
    return personas.getCant();
  }
  
  public String getName()
  {
    return nombreRegion;
  }
  
    private static int esMayorQue18(String fNac) {
        // Obtener la fecha actual
        Date fechaActual = new Date();

        // Convertir la fecha de nacimiento (String) a Date
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = formatoFecha.parse(fNac);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

        // Calcular la diferencia en milisegundos
        long diferenciaMilisegundos = fechaActual.getTime() - fechaNacimiento.getTime();

        // Convertir la diferencia de milisegundos a años
        long milisegundosPorAnio = 365 * 24 * 60 * 60 * 1000L; // Aproximadamente 1 año en milisegundos
        long diferenciaAnios = diferenciaMilisegundos / milisegundosPorAnio;

        // Comprobar si la persona tiene al menos 18 años
        return (int) diferenciaAnios;
    }
  
  public boolean agregarPersona(String rut, String nombre, int estado,String fNac, String defuncion)
  {
      if(esMayorQue18(fNac) >= 18)
      {
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        String año = formato.format(fechaActual);
        int añoActual = Integer.parseInt(año);
        votantes.agregarVotante(rut, nombre, estado, fNac, defuncion,añoActual-esMayorQue18(fNac) + 18, "No está registrado en un partido" );
      }
    return personas.agregarPersona(rut, nombre, estado,fNac, defuncion);
  }

  

  public Persona eliminarPersona(String rut)
  {
    return personas.eliminarPersona(rut);
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

  public String[][] mostrarDatosPoblacion()
  {
     return personas.mostrarPersonas();
  }

  public void cargarPersonasDesdeCSV(String filePath) throws IOException {
      BufferedReader br = new BufferedReader(new FileReader(filePath));
      String line;
      while ((line = br.readLine()) != null) {
          String[] parts = line.split(",");
          if (parts.length == 5) {
              String rut = parts[0];
              String nombre = parts[1];
              String estadoCivil = parts[2];
              int estadoCivilEntero = 0;
              String []arr = {"Soltero/a","Casado/a" , "Divorciado/a" ,"Viudo/a" ,"Separado/a"};
              for(int k = 0 ; k<4 ; k++)
                  if(estadoCivil.equals(arr[k]))
                  {
                      estadoCivilEntero = k;
                      break;
                  }
                      
              String fechaNacimiento = parts[3];
              String defuncion = parts[4];
              // Llama al método agregarPersona para agregar la persona al conjunto
              personas.agregarPersona(rut, nombre, estadoCivilEntero, fechaNacimiento, defuncion);
          } else {
              System.err.println("Error: línea CSV mal formada: " + line);
          }
      }
      br.close();
  }
  
  public void exportarPersonasACSV(String filePath) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));

            // Obtener la lista de personas utilizando el método getPersonas()
            ArrayList<Persona> listaPersonas = personas.getPersonas();

            for (int i = 0; i < listaPersonas.size(); i++) {
                // Construye una línea CSV con los datos de la persona
                Persona persona = listaPersonas.get(i);
                String lineaCSV = String.format(
                    "%s,%s,%s,%s,%s",
                    persona.getRut(),
                    persona.getNombre(),
                    "" + persona.getEstadoCivil(),
                    persona.getFNac(),
                    persona.getDef()
                );

                // Escribe la línea CSV en el archivo
                bw.write(lineaCSV);
                bw.newLine();
            }

            // Cierra el BufferedWriter para liberar recursos
            bw.close();
            System.out.println("Exportación a CSV completada con éxito.");
        } catch (IOException e) {
            System.out.println("Error al crear o escribir en el archivo CSV.");
        }
    }
  
    public void cargarVotantesDesdeCSV() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("CarpetaRegionesVotantes"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 7) {
                String rut = parts[0];
                String nombre = parts[1];
                String estadoCivil = parts[2];
                int estadoCivilEntero = 0;
                String[] arr = {"Soltero/a", "Casado/a", "Divorciado/a", "Viudo/a", "Separado/a"};
                for (int k = 0; k < 4; k++) {
                    if (estadoCivil.equals(arr[k])) {
                        estadoCivilEntero = k;
                        break;
                    }
                }

                String fechaNacimiento = parts[3];
                String defuncion = parts[4];
                int anioRegistro = Integer.parseInt(parts[5]);
                String partidoPolitico = parts[6];

                // Llama al método agregarVotante para agregar al votante al conjunto
                votantes.agregarVotante(rut, nombre, estadoCivilEntero, fechaNacimiento, defuncion, anioRegistro, partidoPolitico);
            } else {
                System.err.println("Error: línea CSV mal formada: " + line);
            }
        }
        br.close();
    }

    public void exportarVotantesACSV( ) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("CarpetaRegionesVotantes"));

            // Obtener la lista de votantes utilizando el método getVotantes()
            ArrayList<Votante> listaVotantes = votantes.getVotantes();

            for (int i = 0; i < listaVotantes.size(); i++) {
                // Construye una línea CSV con los datos del votante
                Votante votante = listaVotantes.get(i);
                String lineaCSV = String.format(
                    "%s,%s,%s,%s,%s,%s,%s",
                    votante.getRut(),
                    votante.getNombre(),
                    "" + votante.getEstadoCivil(),
                    votante.getFNac(),
                    votante.getDef(),
                    "" + votante.getAnioRegistro(),
                    votante.getPartido()
                );

                // Escribe la línea CSV en el archivo
                bw.write(lineaCSV);
                bw.newLine();
            }

            // Cierra el BufferedWriter para liberar recursos
            bw.close();
            System.out.println("Exportación a CSV completada con éxito.");
        } catch (IOException e) {
            System.out.println("Error al crear o escribir en el archivo CSV.");
        }
    }
  
  
  public Persona buscarPersona(String rut){
      return personas.buscarPersona(rut);
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

  public Persona obtenerPersona(String r){
      return personas.buscarPersona(r);
  }
  
  public ConjuntoPersonas getConjuntoPersonas(){
          return personas;
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