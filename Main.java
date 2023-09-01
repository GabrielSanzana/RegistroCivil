import java.util.*;
import java.io.*;

//la base sera la persona, en ella tendra distintos atributos como rut, nombre, estado civil, fecha de nacimiento y defuncion.
// en proyecto dejarlo en distintos archivos
 class Main {
    public static void main(String args[]) throws IOException {
      ArrayList <Region> regiones = new ArrayList<>();
      int opcion;
      Region regionSeleccionada;
      String rut, nombre, fNac;
      regiones.add(new Region("Región de Tarapacá"));
      regiones.add(new Region("Región de Antofagasta"));
      regiones.add(new Region("Región de Atacama"));
      regiones.add(new Region("Región de Coquimbo"));
      regiones.add(new Region("Región de Valparaíso"));
      regiones.add(new Region("Región de O'Higgins"));
      regiones.add(new Region("Región Metropolitana de Santiago"));
      regiones.add(new Region("Región del Maule"));
      regiones.add(new Region("Región de Ñuble"));
      regiones.add(new Region("Región de Biobío"));
      regiones.add(new Region("Región de La Araucanía"));
      regiones.add(new Region("Región de Los Lagos"));
      regiones.add(new Region("Región de Aysén del General Carlos Ibáñez del Campo"));
      regiones.add(new Region("Región de Magallanes y de la Antártica Chilena"));
      regiones.add(new Region("Región de Los Ríos"));
      regiones.add(new Region("Región de Arica y Parinacota"));
      BufferedReader lector = new BufferedReader( new InputStreamReader(System.in));

      while(true)
      {
        System.out.println("====== MENU ======");
        System.out.println("1) Agregar persona.");
        System.out.println("2) Mostrar listado de personas.");
        System.out.println("3) Salir.");
        opcion = Integer.parseInt(lector.readLine());
        switch(opcion)       
        {
          case 1: 
            System.out.println();
            System.out.println("Selecciona la región:");
            System.out.println("1. Región de Tarapacá");
            System.out.println("2. Región de Antofagasta");
            System.out.println("3. Región de Atacama");
            System.out.println("4. Región de Coquimbo");
            System.out.println("5. Región de Valparaíso");
            System.out.println("6. Región de O'Higgins");
            System.out.println("7. Región Metropolitana de Santiago");
            System.out.println("8. Región del Maule");
            System.out.println("9. Región de Biobío");
            System.out.println("10. Región de La Araucanía");
            System.out.println("11. Región de Los Lagos");
            System.out.println("12. Región de Aysén del General Carlos Ibáñez del Campo");
            System.out.println("13. Región de Magallanes y de la Antártica Chilena");
            System.out.println("14. Región de Los Ríos");
            System.out.println("15. Región de Arica y Parinacota");
            System.out.println("16. Región de Ñuble");
            opcion = Integer.parseInt(lector.readLine());
            if(opcion<=16 && opcion>=1)
            {
              System.out.println();
              System.out.println("Ingrese los siguientes datos:");
              System.out.print("RUT: ");
              rut = lector.readLine();
              System.out.print("Nombre: ");
              nombre = lector.readLine();
              System.out.print("Fecha de Nacimiento: ");
              fNac = lector.readLine();
              regionSeleccionada = regiones.get(opcion - 1);
              regionSeleccionada.agregarPersona(rut, nombre, fNac);
            }
            else
            {
              System.out.println("Selección de región inválida. Volviendo al menú.");
              System.out.println();
            }
            break;
          case 2:
            System.out.println();
            System.out.println("Selecciona la región:");
            System.out.println("1. Región de Tarapacá");
            System.out.println("2. Región de Antofagasta");
            System.out.println("3. Región de Atacama");
            System.out.println("4. Región de Coquimbo");
            System.out.println("5. Región de Valparaíso");
            System.out.println("6. Región de O'Higgins");
            System.out.println("7. Región Metropolitana de Santiago");
            System.out.println("8. Región del Maule");
            System.out.println("9. Región de Biobío");
            System.out.println("10. Región de La Araucanía");
            System.out.println("11. Región de Los Lagos");
            System.out.println("12. Región de Aysén del General Carlos Ibáñez del Campo");
            System.out.println("13. Región de Magallanes y de la Antártica Chilena");
            System.out.println("14. Región de Los Ríos");
            System.out.println("15. Región de Arica y Parinacota");
            System.out.println("16. Región de Ñuble");
            opcion = Integer.parseInt(lector.readLine());
            if(opcion<=16 && opcion>=1)
            {
              regionSeleccionada = regiones.get(opcion - 1);
              regionSeleccionada.mostrarDatosPoblacion();
            }
            else
            {
              System.out.println("Selección de región inválida. Volviendo al menú.");
              System.out.println();
            }
            break;

          case 3:
            return;
          default: 
            System.out.println("Opción invalida.");
            break;
        }
      }
    }
}