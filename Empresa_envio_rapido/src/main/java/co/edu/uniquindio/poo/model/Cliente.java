package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cliente {
    private String nombre, cedula, correo, direccion;

    private List<Envio> listEnvios;

    public Cliente(String nombre,String cedula, String correo, String direccion ){
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.direccion = direccion;
        this.listEnvios = new ArrayList<>();


    }

    public List<Envio> getListEnvios() {
        return listEnvios;
    }

    public void setListEnvios(List<Envio> listEnvios) {
        this.listEnvios = listEnvios;
    }
}
