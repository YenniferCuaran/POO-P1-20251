package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una prestamo
 */
public class Prestamo {
    private String fecha;
    private String fechaFin;
    private Usuario usuario;
    private List<Prestamo> ListLibrosPrestados;
    private Libro libro;

    /**
     * Metodo constructor de la clase Prestamo
     * @param fechaInicio
     * @param fechaFin
     */
    public Prestamo(String fechaInicio, String fechaFin, Usuario usuario, List<Libro> ListLibrosPrestados) {
        this.fecha = fechaInicio;
        this.fechaFin = fechaFin;
        this.usuario = usuario;
        this.ListLibrosPrestados = new ArrayList<Prestamo>();
        this.libro = libro;

    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
