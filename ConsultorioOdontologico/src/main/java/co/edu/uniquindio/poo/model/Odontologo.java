package co.edu.uniquindio.poo.model;

import java.util.List;

public class Odontologo {
    private String ID, nombre;
    private int numLicencia;

    private List<Paciente> listPaciente;
    private List<Cita>listCitas;
    private Cita cita;

    //constructor
    public Odontologo (String ID, String nombre, int numLicencia, List<Paciente> listPaciente,List<Cita>listCitas, Cita cita ) {
        this.ID = ID;
        this.nombre = nombre;
        this.numLicencia = numLicencia;
        this.listPaciente = listPaciente;
        this.listCitas = listCitas;
        this.cita=cita;

    }
    //getter y setter
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }
    //get y set de listas
    public List<Paciente> getListPaciente() {
        return listPaciente;
    }

    public void setListPaciente(List<Paciente> listPaciente) {
        this.listPaciente = listPaciente;
    }

    public List<Cita> getListCitas() {
        return listCitas;
    }

    public void setListCitas(List<Cita> listCitas) {
        this.listCitas = listCitas;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    //metodo
}
