package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Batallon {

    private String nombre;
    private List<Mision> listMisiones;
    private List<Vehiculo> listVehiculos;

    public Batallon(String nombre) {
        this.nombre = nombre;
        this.listMisiones=new ArrayList<>();
        this.listVehiculos = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Mision> getListMisiones() {
        return listMisiones;
    }

    public void setListMisiones(List<Mision> listMisiones) {
        this.listMisiones = listMisiones;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        listVehiculos.add(vehiculo);
    }

    public void registrarMision(Mision mision) {
        listMisiones.add(mision);
    }

    public List<Vehiculo> vehiculos50Misiones(Vehiculo vehiculo){
        List<Vehiculo> vehiculos50Misiones = new ArrayList<>();
        for(Vehiculo vehiculos: listVehiculos){
            if(vehiculo.getCantidadMisiones()>50){
                vehiculos50Misiones.add(vehiculos);
            }
        }
        return vehiculos50Misiones;
    }



}

