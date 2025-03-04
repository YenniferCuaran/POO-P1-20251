package co.edu.uniquindio.poo;

public class Estudiante {

    private String nombre, identificacion;
    private double conjuntoNotas;

    public Estudiante(String nombre, String identificacion, double conjuntoNotas){

        this.nombre=nombre;
        this.identificacion=identificacion;
        this.conjuntoNotas= conjuntoNotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public double getConjuntoNotas() {
        return conjuntoNotas;
    }

    public void setConjuntoNotas(double conjuntoNotas) {
        this.conjuntoNotas = conjuntoNotas;
    }

}
