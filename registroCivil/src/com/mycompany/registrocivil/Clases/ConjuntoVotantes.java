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
    
    
}
