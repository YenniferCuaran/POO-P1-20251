package co.edu.uniquindio.poo.model;

public class Cita {
    private String fecha;
    private String hora;
    private String lugar;

    //constructor
    public Cita(String fecha, String hora, String lugar) {
        this.fecha=fecha;
        this.hora=hora;
        this.lugar=lugar;
    }
    //getter y setter

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    //metodo

}
