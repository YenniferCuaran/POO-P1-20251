package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.List;

/**
 * Representa un usuario tipo Docente
 */
public class Docente extends Usuario {
    private int cantMaxLibros;
    private String facultad;
    /**
     * Metodo constructor de la clase Docente
     * @param credencial
     * @param nombre
     * @param correo
     * @param cantMaxLibros
     * @param facultad
     */
    public Docente(String credencial, String nombre, String correo, int prestamosActivos, List<Prestamo> prestamos, int cantMaxLibros, String facultad) {
        super(credencial, nombre, correo,prestamosActivos, prestamos);
        this.cantMaxLibros = 5;
        this.facultad = facultad;
    }

    public int getCantMaxLibros() {
        return cantMaxLibros;
    }

    public boolean solicitarPrestamo(Libro libro) {
        // Verificar cantidad máxima permitida
        if (cantMaxLibros > 3) {
            System.out.println("No puedes solicitar más de 3 libros.");
            return false;
        }

        // Verificar si el libro está disponible
        if (libro.getEstado() != Estado.DISPONIBLE) {
            System.out.println("El libro no está disponible.");
            return false;
        }
        return true;
    }
}
