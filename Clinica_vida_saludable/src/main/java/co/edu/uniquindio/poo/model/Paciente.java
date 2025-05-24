package co.edu.uniquindio.poo.model;

import java.util.Date;

public class Paciente {
    private String nombre, cedula, correo, direccion;
    private Date fechaN;

    public Paciente(String nombre,String cedula,String correo,String direccion, Date fechaN) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.direccion = direccion;
        this.fechaN = fechaN;
    }



}
