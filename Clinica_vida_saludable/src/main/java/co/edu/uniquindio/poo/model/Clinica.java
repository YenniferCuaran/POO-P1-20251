package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nombre, nit;

    private List<Persona> listPersonas;
    private List<Paciente> listPacientes;

    public Clinica(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listPersonas = new ArrayList<>();
        this.listPacientes = new ArrayList<>();
    }

    public void registrarPersona(Persona persona){
        listPersonas.add(persona);

    }
    public void eliminarPersona(Persona persona ) {
        listPersonas.remove(persona);

    }

}
