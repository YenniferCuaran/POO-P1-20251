package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Asistente {
    private String id,nombre, apellidos, correo, telef;
    private List<Entrada>listEntradas;

    public Asistente(String id, String nombre, String apellidos, String correo, String telef) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telef = telef;
        this.listEntradas = new ArrayList<>();
    }
}
