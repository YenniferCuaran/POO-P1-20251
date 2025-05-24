package co.edu.uniquindio.poo.model;

import java.util.Date;

public class Consulta {
    private String codigo;
    private Date fecha;

    private Tipo tipo;

    public Consulta(String codigo, Date fecha, Tipo tipo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.tipo = tipo;
    }
    //metodo calcular costoConsulta
}
