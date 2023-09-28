package com.mycompany.registrocivil.Clases;

import java.util.*;

public class ConjuntoVotantes extends ConjuntoPersonas {
    private int totalVotantes;
    private ArrayList<Votante> votantes;
    private HashMap<String, Votante> mapaVot;

    public ConjuntoVotantes() {
        super();
        this.totalVotantes = 0;
        votantes = new ArrayList<>();
        mapaVot = new HashMap<>();
    }

    public ArrayList<Votante> getVotantes() {
        return votantes;
    }

    public Votante buscarVotante(String rut) {
        if (mapaVot.containsKey(rut))
            return mapaVot.get(rut);
        return null;
    }

    public Votante eliminarVotante(String rut) {
        if (!mapaVot.containsKey(rut))
            return null;
        Votante aux = mapaVot.get(rut);
        votantes.remove(aux);
        mapaVot.remove(rut);
        totalVotantes--;
        return aux;
    }

    public boolean agregarVotante(String rut, String nombre, int estado, String fNac, String def, int anioRegistro, String partidoPolitico) {
        if (mapaVot.containsKey(rut))
            return false;
        Votante aux = new Votante(rut, nombre , estado,fNac,def, anioRegistro, partidoPolitico);
        mapaVot.put(rut, aux);
        votantes.add(aux);
        totalVotantes++;
        return true;
    }

    @Override
    public int getCant() {
        return totalVotantes;
    }
    
    @Override
    public String[][] mostrarPersonas() {
        String[][] arr = new String[votantes.size()][7];
        for (int i = 0; i < votantes.size(); i++) {
            Votante persona = votantes.get(i);
            arr[i][0] = persona.getRut();
            arr[i][1] = persona.getNombre();
            arr[i][2] = persona.getFNac();
            arr[i][3] = persona.getDef();
            arr[i][4] = persona.getEstadoCivil();
            arr[i][5] = ""+persona.getAnioRegistro();
            arr[i][6] = persona.getPartido();
        }
        return arr;
    }
}
