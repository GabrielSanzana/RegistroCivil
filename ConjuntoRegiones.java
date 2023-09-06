import java.util.*;
import java.io.*;
public class ConjuntoRegiones {
    private int totalRegiones;
    private ArrayList<Region> regiones;
    private HashMap<String, Region> mapaRegiones;

    public ConjuntoRegiones() {
        this.totalRegiones = 0;
        regiones = new ArrayList<>();
        mapaRegiones = new HashMap<>();
    }

    public void agregarRegion(String nombreRegion) {
        Region nuevaRegion = new Region(nombreRegion);
        regiones.add(nuevaRegion);
        mapaRegiones.put(nombreRegion, nuevaRegion);
        totalRegiones++;
        System.out.println("Se ha agregado exitosamente la región: " + nombreRegion + ".");
    }

    public void agregarPersona(String nombreRegion, String rut, String nombre, String fNac, int estado) {
        Region region = buscarRegion(nombreRegion);
        if (region == null) {
            System.out.println("No existe la región buscada: " + nombreRegion);
            return;
        }
        region.agregarPersona(rut, nombre, fNac, estado);
    }

    public void agregarPersona(String nombreRegion, String rut, String nombre, String fNac) {
        Region region = buscarRegion(nombreRegion);
        if (region == null) {
            System.out.println("No existe la región buscada: " + nombreRegion);
            return;
        }
        region.agregarPersona(rut, nombre, fNac);
    }

    public void agregarPersona(String nombreRegion, String rut, String nombre, String fNac, int estado, String def) {
        Region region = buscarRegion(nombreRegion);
        if (region == null) {
            System.out.println("No existe la región buscada: " + nombreRegion);
            return;
        }
        region.agregarPersona(rut, nombre, fNac, estado, def);
    }

    public Region buscarRegion(String nombreRegion) {
        return mapaRegiones.get(nombreRegion);
    }

    public int getTotalRegiones() {
        return totalRegiones;
    }

    // Métodos para manipular objetos Región
    public void eliminarRegion(String nombreRegion) {
        Region region = mapaRegiones.get(nombreRegion);
        if (region != null) {
            regiones.remove(region);
            mapaRegiones.remove(nombreRegion);
            totalRegiones--;
            System.out.println("Se ha eliminado exitosamente la región: " + nombreRegion + ".");
        } else {
            System.out.println("No existe la región buscada: " + nombreRegion);
        }
    }

    public void mostrarRegiones() {
        System.out.println("Regiones disponibles:");
        for (Region region : regiones) {
            System.out.println(region.getName());
        }
    }

    public int getCantidadPersonasEnRegion(String nombreRegion) {
        Region region = buscarRegion(nombreRegion);
        if (region != null) {
            return region.getCant();
        } else {
            System.out.println("No existe la región buscada: " + nombreRegion);
            return 0;
        }
    }

    public void mostrarDatosPersonaEnRegion(String nombreRegion, String rut) {
        Region region = buscarRegion(nombreRegion);
        if (region != null) {
            region.mostrarDatosPersona(rut);
        } else {
            System.out.println("No existe la región buscada: " + nombreRegion);
        }
    }

    public void mostrarDatosPoblacionEnRegion(String nombreRegion) {
        Region region = buscarRegion(nombreRegion);
        if (region != null) {
            region.mostrarDatosPoblacion();
        } else {
            System.out.println("No existe la región buscada: " + nombreRegion);
        }
    }
}