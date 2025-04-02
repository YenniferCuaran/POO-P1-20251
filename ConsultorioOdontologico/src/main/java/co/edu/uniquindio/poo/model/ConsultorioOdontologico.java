package co.edu.uniquindio.poo.model;

import java.util.List;

public class ConsultorioOdontologico {
    private String nombre, nit;
    private List<Odontologo> listOdontologos;

    //constructor
    public ConsultorioOdontologico (String nombre, String nit, List<Odontologo> listOdontologos){
        this.nombre = nombre;
        this.nit= nit;
        this. listOdontologos= listOdontologos;
    }
    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<Odontologo> getListOdontologos() {
        return listOdontologos;
    }

    public void setListOdontologos(List<Odontologo> listOdontologos) {
        this.listOdontologos = listOdontologos;
    }

    //metodos
    //public void

}
