package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.List;

/**
 * Representa un usuario tipo visitante
 */
public class Visistante extends Usuario{
    /**
     * Metodo constructor de la clase Visistante
     * @param credencial
     * @param nombre
     * @param correo
     */
    public Visistante(String credencial, String nombre, String correo,  int prestamosActivos, List<Prestamo> prestamos) {
        super(credencial, nombre, correo, prestamosActivos, prestamos);
    }

}
