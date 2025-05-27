package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario tipo estudiante
 */
public class Estudiante extends Usuario implements ISolicitudes {
    private int cantMaxLibros;
    private String carrera;
    private int apellido;

    /**
     * Metodo constructor de la clase Usuario
     *
     * @param credencial
     * @param nombre
     * @param correo
     * @param cantMaxLibros
     * @param carrera
     * @param apellido
     */
    public Estudiante(String credencial, String nombre, String correo, int prestamosActivos, List<Prestamo> prestamos, int cantMaxLibros, String carrera, int apellido) {
        super(credencial, nombre, correo, prestamosActivos, prestamos);
        this.cantMaxLibros = 3;
        this.carrera = carrera;
        this.apellido = apellido;
    }

    public int getCantMaxLibros() {
        return cantMaxLibros;
    }


    public boolean solicitarPrestamo(Libro libro) {
        // Verifica cantidad máxima permitida
        if (cantMaxLibros > 3) {
            System.out.println("No puedes solicitar más de 3 libros.");
            return false;
        }

        // Verifica si el libro está disponible
        if (libro.getEstado() != Estado.DISPONIBLE) {
            System.out.println("El libro no está disponible.");
            return false;
        }
        return true;
    }
}
    



