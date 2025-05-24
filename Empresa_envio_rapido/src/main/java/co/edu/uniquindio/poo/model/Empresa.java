package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre, nit;

    private List<Vehiculo>listVehiculos;
    private List<Cliente> listClientes;

    public Empresa(String nombre, String nit){
        this.nombre = nombre;
        this.nit = nit;
        this.listVehiculos = new ArrayList<>();
        this.listClientes = new ArrayList<>();


    }
    public void agregarVehiculo(Vehiculo vehiculo){
        listVehiculos.add(vehiculo);

    }
    public void eliminarVehiculo(Vehiculo vehiculo){
        listVehiculos.remove(vehiculo);
    }





    //getters y setters
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

    public List<Vehiculo> getListVehiculos() {
        return listVehiculos;
    }

    public void setListVehiculos(List<Vehiculo> listVehiculos) {
        this.listVehiculos = listVehiculos;
    }

    public List<Cliente> getListClientes() {
        return listClientes;
    }

    public void setListClientes(List<Cliente> listClientes) {
        this.listClientes = listClientes;
    }

}
