package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.ArrayList;
import java.util.List;
/**
 * Representa a la Biblioteca Universidad del Quindio
 */
public class Biblioteca {
    private String nombre;
    private String nit;
    private List<Empleado> listEmpleados;
    /** Metodo constructor de la clase Biblioteca
     * @param nombre
     * @param nit
     */
    public Biblioteca(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listEmpleados=new ArrayList<>();
    }

    /**
     * Registra un nuevo empleado.
     * @param empleado Empleado a registrar.
     */
    public void registrarEmpleado(Empleado empleado){
        this.listEmpleados.add(empleado);
    }
    /**
     * Metodo que modifica el nombre de un empleado
     */
    public void modificarEmpleado(String credencial, String nuevoNombre) {
        for (Empleado emp : listEmpleados) {
            if (emp.getCredencial().equals(credencial)) {
                emp.setNombre(nuevoNombre);
                System.out.println("Empleado modificado correctamente.");
                return;
            }
        }
        System.out.println("Empleado con credencial " + credencial + " no encontrado.");
    }
    /**
     * Metodo que elimina un empleado
     */
    public void eliminarEmpleado(Empleado empleado){
        this.listEmpleados.remove(empleado);
    }







}
