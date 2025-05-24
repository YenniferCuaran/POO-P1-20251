package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Mision {

    private String fecha, ubicacion;
    private int personalAsignado;
    private List<Vehiculo> listVhiculoPorMision;


    public Mision(String fecha, String ubicacion, int personalAsignado, List<Vehiculo> listVhiculoPorMision) {
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.personalAsignado = personalAsignado;
        this.listVhiculoPorMision = listVhiculoPorMision;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPersonalAsignado() {
        return personalAsignado;
    }

    public void setPersonalAsignado(int personalAsignado) {
        this.personalAsignado = personalAsignado;
    }

    public List<Vehiculo> getListVhiculoPorMision() {
        return listVhiculoPorMision;
    }

    @Override
    public String toString() {
        return "Mision{" +
                "fecha='" + fecha + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", personalAsignado=" + personalAsignado +
                '}';
    }
}

