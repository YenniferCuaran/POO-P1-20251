package co.edu.uniquindio.poo;

public class Artista {

    private String nombre;
    private int edad;


    public Artista(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }


    //Metodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
