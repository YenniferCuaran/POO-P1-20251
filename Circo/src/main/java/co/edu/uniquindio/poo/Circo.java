package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Circo {
    /**
     *atributos
     */
    private String nombre;

    private List<Funcion> listFunciones;
    private List<Cliente> listClientes;
    private List<Artista> listArtistas;


    /**
     * Metodo constructor de la clase Circo
     */

    public Circo(String nombre) {
        this.nombre = nombre;

        this. listFunciones= new ArrayList<>();
        this. listClientes= new ArrayList<>();
        this. listArtistas= new ArrayList<>();

    }
    //Metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Funcion> getListFunciones() { return listFunciones;}

    public void setListFunciones (List<Funcion> listFunciones){
        this.listFunciones=listFunciones;
    }

}



