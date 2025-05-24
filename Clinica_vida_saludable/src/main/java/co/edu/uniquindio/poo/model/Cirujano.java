package co.edu.uniquindio.poo.model;

public class Cirujano extends Persona {
    private int nIntervenciones;

    public Cirujano(String nombre, String cedula, String direccion, String telf, int nIntervenciones) {
        super(nombre, cedula, direccion, telf);

        this.nIntervenciones = nIntervenciones;
    }

}
