package co.edu.uniquindio.poo.model;

public class Especialista extends Persona {
    private int anioExp;

    private Area area;

    public Especialista(String nombre, String cedula, String direccion, String telf,int anioExp, Area area) {
        super(nombre, cedula,direccion,telf);

        this.anioExp = anioExp;
        this.area = area;
    }


}
