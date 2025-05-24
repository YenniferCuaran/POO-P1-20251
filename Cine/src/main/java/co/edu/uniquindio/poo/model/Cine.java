// actividad_Polimorfismo
// CASO: Cine
package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cine {
    private String nombre, nit;

    private List<Funcion> listFunciones;

    public Cine(String nombre, String nit){
        this.nombre = nombre;
        this.nit = nit;
        this.listFunciones = new ArrayList<>();
    }

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
    //
    public  void  agregarFuncion(Funcion funcion){
        listFunciones.add(funcion);
    }

    @Override
    public String toString() {
        return "Cine{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", listFunciones=" + listFunciones +
                '}';
    }
}
