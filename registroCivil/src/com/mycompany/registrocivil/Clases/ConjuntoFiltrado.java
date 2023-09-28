/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.registrocivil.Clases;
import java.util.*;
/**
 *
 * @author patru
 */
public class ConjuntoFiltrado extends ConjuntoPersonas {
    private Region r; 
    private String atributo;
    private String entrada;
    public ConjuntoFiltrado (Region reg, String a, String e)
    {
        super();
        this.r = reg;
        this.atributo = a;
        this.entrada = e;
    }
    
    @Override
    public String[][] mostrarPersonas() {
        String[] aux = { "Nombre", "Fecha de nacimiento", "Defunción", "Soltero/a", "Casado/a", "Divorciado/a", "Viudo/a", "Separado/a" };
        int ee = 0;
        for (int i = 0; i < 8; i++) {
            if (atributo.equals(aux[i])) {
                ee = i;
                break;
            }
        }
        ArrayList<Persona> filtrado = new ArrayList<>();
        String[][] arr;
        switch (ee) {
            case 0:
                filtrado = r.getConjuntoPersonas().getMapas(0).get(entrada);
                arr = new String[filtrado.size()][5];
                for (int i = 0; i < filtrado.size(); i++) {
                    Persona persona = filtrado.get(i);
                    arr[i][0] = persona.getRut();
                    arr[i][1] = persona.getNombre();
                    arr[i][2] = persona.getFNac();
                    arr[i][3] = persona.getDef();
                    arr[i][4] = persona.getEstadoCivil();
                }
                break;
            case 1:
                filtrado = r.getConjuntoPersonas().getMapas(1).get(entrada);
                arr = new String[filtrado.size()][5];
                for (int i = 0; i < filtrado.size(); i++) {
                    Persona persona = filtrado.get(i);
                    arr[i][0] = persona.getRut();
                    arr[i][1] = persona.getNombre();
                    arr[i][2] = persona.getFNac();
                    arr[i][3] = persona.getDef();
                    arr[i][4] = persona.getEstadoCivil();
                }
                break;
            case 2:
                filtrado = r.getConjuntoPersonas().getMapas(2).get(entrada);
                arr = new String[filtrado.size()][5];
                for (int i = 0; i < filtrado.size(); i++) {
                    Persona persona = filtrado.get(i);
                    arr[i][0] = persona.getRut();
                    arr[i][1] = persona.getNombre();
                    arr[i][2] = persona.getFNac();
                    arr[i][3] = persona.getDef();
                    arr[i][4] = persona.getEstadoCivil();
                }
                break;
            case 3:
                filtrado = r.getConjuntoPersonas().getMapas(3).get("Soltero/a");
                arr = new String[filtrado.size()][5];
                for (int i = 0; i < filtrado.size(); i++) {
                    Persona persona = filtrado.get(i);
                    arr[i][0] = persona.getRut();
                    arr[i][1] = persona.getNombre();
                    arr[i][2] = persona.getFNac();
                    arr[i][3] = persona.getDef();
                    arr[i][4] = persona.getEstadoCivil();
                }
                break;
            case 4:
                filtrado = r.getConjuntoPersonas().getMapas(3).get("Casado/a");
                arr = new String[filtrado.size()][5];
                for (int i = 0; i < filtrado.size(); i++) {
                    Persona persona = filtrado.get(i);
                    arr[i][0] = persona.getRut();
                    arr[i][1] = persona.getNombre();
                    arr[i][2] = persona.getFNac();
                    arr[i][3] = persona.getDef();
                    arr[i][4] = persona.getEstadoCivil();
                }
                break;
            case 5:
                filtrado = r.getConjuntoPersonas().getMapas(3).get("Divorciado/a");
                arr = new String[filtrado.size()][5];
                for (int i = 0; i < filtrado.size(); i++) {
                    Persona persona = filtrado.get(i);
                    arr[i][0] = persona.getRut();
                    arr[i][1] = persona.getNombre();
                    arr[i][2] = persona.getFNac();
                    arr[i][3] = persona.getDef();
                    arr[i][4] = persona.getEstadoCivil();
                }
                break;
            case 6:
                filtrado = r.getConjuntoPersonas().getMapas(3).get("Viudo/a");
                arr = new String[filtrado.size()][5];
                for (int i = 0; i < filtrado.size(); i++) {
                    Persona persona = filtrado.get(i);
                    arr[i][0] = persona.getRut();
                    arr[i][1] = persona.getNombre();
                    arr[i][2] = persona.getFNac();
                    arr[i][3] = persona.getDef();
                    arr[i][4] = persona.getEstadoCivil();
                }
                break;
            case 7:
                filtrado = r.getConjuntoPersonas().getMapas(3).get("Separado/a");
                arr = new String[filtrado.size()][5];
                for (int i = 0; i < filtrado.size(); i++) {
                    Persona persona = filtrado.get(i);
                    arr[i][0] = persona.getRut();
                    arr[i][1] = persona.getNombre();
                    arr[i][2] = persona.getFNac();
                    arr[i][3] = persona.getDef();
                    arr[i][4] = persona.getEstadoCivil();
                }
                break;
            default:
                // Maneja el caso por defecto de acuerdo a tus necesidades
                arr = new String[0][5]; // Por ejemplo, un arreglo vacío
        }
        return arr;
    }

    @Override
    public int getCant() {
    String[] aux = { "Nombre", "Fecha de nacimiento", "Defunción", "Soltero/a", "Casado/a", "Divorciado/a", "Viudo/a", "Separado/a" };
    int ee = 0;
    for (int i = 0; i < 8; i++) {
        if (atributo.equals(aux[i])) {
            ee = i;
            break;
        }
    }
    ArrayList<Persona> filtrado = new ArrayList<>();
    switch (ee) {
        case 0:
            filtrado = r.getConjuntoPersonas().getMapas(0).get(entrada);
            break;
        case 1:
            filtrado = r.getConjuntoPersonas().getMapas(1).get(entrada);
            break;
        case 2:
            filtrado = r.getConjuntoPersonas().getMapas(2).get(entrada);
            break;
        case 3:
            filtrado = r.getConjuntoPersonas().getMapas(3).get("Soltero/a");
            break;
        case 4:
            filtrado = r.getConjuntoPersonas().getMapas(3).get("Casado/a");
            break;
        case 5:
            filtrado = r.getConjuntoPersonas().getMapas(3).get("Divorciado/a");
            break;
        case 6:
            filtrado = r.getConjuntoPersonas().getMapas(3).get("Viudo/a");
            break;
        case 7:
            filtrado = r.getConjuntoPersonas().getMapas(3).get("Separado/a");
            break;
        default:
            // Maneja el caso por defecto de acuerdo a tus necesidades
            filtrado = new ArrayList<>(); // Por ejemplo, un arreglo vacío
    }
    return filtrado.size();
}

}
