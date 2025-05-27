package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario de la biblioteca.
 */
public class Usuario {
    private String credencial;
    private String nombre;
    private String correo;
    private int prestamosActivos;
    private List<Prestamo> prestamos;


    /**
     * Metodo constructor de la clase Usuario
     * @param credencial
     * @param nombre
     * @param correo
     * @param prestamosActivos
     */
    public Usuario(String credencial, String nombre, String correo, int prestamosActivos, List<Prestamo> prestamos) {
        this.credencial = credencial;
        this.nombre = nombre;
        this.correo = correo;
        this.prestamosActivos = prestamosActivos;
        this.prestamos = new ArrayList<Prestamo>();

    }
    /**
     *Metodos getters y setters
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Metodo que devuelve una lista con los préstamos activos
     */
    public List<Prestamo> getPrestamosActivos() {
        List<Prestamo> prestamosActivos = new ArrayList<>();
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().getEstado() == Estado.PRESTADO) {
                prestamosActivos.add(prestamo);
            }
        }
        return prestamosActivos;
    }

}
