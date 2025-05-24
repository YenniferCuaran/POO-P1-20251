package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Envio {
    private String codigo, fecha;

    private List<Paquete> listPaquetes;
    private ZonaEntrega zona;

    public Envio(String codigo, String fecha, ZonaEntrega zona) {
        this.codigo = codigo;
        this.fecha = fecha;

        this.listPaquetes=new ArrayList<>();
        this.zona = zona;


    }
    //getters y setters


    public ZonaEntrega getZona() {
        return zona;
    }

    public void setZona(ZonaEntrega zona) {
        this.zona = zona;
    }


}
