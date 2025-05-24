package co.edu.uniquindio.poo.model;

public class MedicoGeneral extends Persona {
    private int nConsultas;

    private Especialidad especialidad;

    public MedicoGeneral(String nombre, String cedula, String direccion, String telf,int nConsultas, Especialidad especialidad) {
        super(nombre, cedula, direccion, telf);
        this.nConsultas = nConsultas;
        this.especialidad = especialidad;
    }



}
