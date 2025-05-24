package co.edu.uniquindio.poo.model;

import java.util.Date;

public abstract class Funcion {
    protected String titulo, duracion;
    protected Date horario;
    protected  double precioBase;

    public Funcion(String titulo, String duracion, Date horario, double precioBase){
        this.titulo=titulo;
        this.duracion=duracion;
        this.horario=horario;
        this.precioBase=precioBase;

    }
    public abstract void calcularEntrada();


}
