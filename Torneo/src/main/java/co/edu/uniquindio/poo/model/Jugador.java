package co.edu.uniquindio.poo.model;

public class Jugador {
    private String nombre;
    private String alias;
    private Rol rol;

    public Jugador(String nombre, String alias, Rol rol) {
        this.nombre = nombre;
        this.alias = alias;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }
}
