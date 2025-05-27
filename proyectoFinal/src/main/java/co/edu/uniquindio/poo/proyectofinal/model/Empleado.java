package co.edu.uniquindio.poo.proyectofinal.model;
/**
 * Representa a un empleado de la Biblioteca
 */
public class Empleado {
    private String credencial;
    private String nombre;
    /** Metodo constructor de la clase Empleado
     * @param credencial
     * @param nombre
     */
    public Empleado(String credencial, String nombre) {
        this.credencial = credencial;
        this.nombre = nombre;
    }
    /**
     * Metodos getters y setters
     */
    public String getCredencial() {
        return credencial;
    }

    public void setCredencial(String credencial) {
        this.credencial = credencial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
