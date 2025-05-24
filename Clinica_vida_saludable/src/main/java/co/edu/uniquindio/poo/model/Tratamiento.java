package co.edu.uniquindio.poo.model;

import java.util.Date;

public class Tratamiento {
    private Date fecha;
    private int cant;
    private String tipo;

    Tratamiento(Date fecha, int cant, String tipo) {
        this.fecha = fecha;
        this.cant = cant;
        this.tipo = tipo;
    }

}
