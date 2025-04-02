package co.edu.uniquindio.poo.model;

public class Partida {
    private String hora;
    private String id;
    private String fecha;
    private Equipo equipo1;
    private Equipo equipo2;
    private Resultado resultado;

    public Partida(String hora, String id, String fecha, Equipo equipo1, Equipo equipo2, Resultado resultado) {
        this.hora = hora;
        this.id = id;
        this.fecha = fecha;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado = resultado;

    }

    public void jugarPartido(){

    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Equipo getEquipo1() {
        return equipo1;
    }
    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }
    public Equipo getEquipo2() {
        return equipo2;
    }
    public void setEquipo2(Equipo equipo2) {

    }

    @Override
    public String toString() {
        return "Partida{" +
                "hora='" + hora + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
