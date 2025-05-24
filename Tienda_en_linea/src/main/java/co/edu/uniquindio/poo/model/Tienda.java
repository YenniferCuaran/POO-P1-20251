//Tema: Interface
// Caso: Sistema de gestion de productos para una tienda (en linea)
//
package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre, url;
    private List<Inventario>listInventarios;

    public Tienda(String nombre, String url){
        this.nombre = nombre;
        this.url=url;
        this.listInventarios=new ArrayList<>();

    }

}
