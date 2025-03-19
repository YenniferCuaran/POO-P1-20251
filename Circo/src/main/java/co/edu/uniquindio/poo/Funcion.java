package co.edu.uniquindio.poo;

public class Funcion {
    /**
     * atributos
     */
    private String fecha, lugar;
    private String hora;


    /**
     * metodo constructor de la clase Funcion
     */

    public Funcion(String fecha, String lugar, String hora) {
        this.fecha = fecha;
        this. lugar=lugar;
        this.hora=hora;

    }
    //Metodos get y set
    public String getHora(){ return hora; }
    public void setHora (String hora){
        this.hora=hora;
    }





}
