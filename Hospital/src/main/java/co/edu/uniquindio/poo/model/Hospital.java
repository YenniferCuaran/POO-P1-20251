package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String nombre;
    private int nit;
    private String telf;

    private List<Persona> listPersonas;

    //metodo constructor de la clase Hospital

    public Hospital(String nombre, int nit, String telf) {
        this.nombre = nombre;
        this.nit = nit;
        this.telf = telf;
        this.listPersonas = new ArrayList<>();
    }









}
