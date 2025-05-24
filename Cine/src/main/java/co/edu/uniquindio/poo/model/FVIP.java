package co.edu.uniquindio.poo.model;

import java.util.Date;

public class FVIP extends Funcion {
    private double asientosReclinables, servicioComida;

    public FVIP(String titulo, String duracion, Date horario, double precioBase, double asientosReclinables, double servicioComida){
        super(titulo, duracion, horario,precioBase);

        this.asientosReclinables = precioBase;
        this.servicioComida=servicioComida;
    }
    public void calcularEntrada(){

    }

}
