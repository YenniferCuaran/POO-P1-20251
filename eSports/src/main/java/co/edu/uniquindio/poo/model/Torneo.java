package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private String nombre;
    private String fechaInicio;
    private List<Equipo> listEquipo;

    public Torneo(String nombre, String fechaInicio, List<Equipo> listEquipo) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.listEquipo = listEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public List<Equipo> getListEquipo() {
        return listEquipo;
    }
    public void setListEquipo(List<Equipo> listEquipo) {
        this.listEquipo = listEquipo;
    }

    @Override
    public String toString() {
        return "Torneo{" +
                "nombre='" + nombre + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", listEquipo=" + listEquipo +
                '}';
    }
}
