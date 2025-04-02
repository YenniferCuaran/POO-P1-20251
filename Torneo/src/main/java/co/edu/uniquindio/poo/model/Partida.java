package co.edu.uniquindio.poo.model;

public class Partida {
    private String hora;
    private String id;
    private Equipo equipo1;
    private Equipo equipo2;
    private Resultado resultado;

    public Partida(String hora, String id, Equipo equipo1, Equipo equipo2, Resultado resultado) {
        this.hora = hora;
        this.id = id;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado = resultado;
    }
    public String getHora(){
        return hora;
    }
    public void setHora(String hora){
        this.hora = hora;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "hora='" + hora + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
