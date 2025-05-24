package co.edu.uniquindio.poo.model;

public abstract class  Persona {
    private String nombre,cedula,direccion,telf;

    public Persona(String nombre, String cedula, String direccion, String telf) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telf = telf;
    }


}
