package co.edu.uniquindio.poo.model;

public class Vehiculo {
    //atributos
    private String modelo, id ;
    private int  aniofabricacion, kilometraje, cantidadMisiones;
    private EstadoOperativo estadoOperativo;
    //constructor
    public Vehiculo(String modelo, String  id, int anioFabricacion, int kilometraje, int cantidadMisiones,EstadoOperativo estado){
        this.modelo = modelo;
        this.id = id;
        this.aniofabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.cantidadMisiones = cantidadMisiones;
        this.estadoOperativo = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAniofabricascion() {
        return aniofabricacion;
    }

    public void setAniofabricascion(int aniofabricascion) {
        this.aniofabricacion = aniofabricascion;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(EstadoOperativo estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }

    public int getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }

    public int getCantidadMisiones() {
        return cantidadMisiones;
    }

    public void setCantidadMisiones(int cantidadMisiones) {
        this.cantidadMisiones = cantidadMisiones;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", id='" + id + '\'' +
                ", aniofabricacion=" + aniofabricacion +
                ", kilometraje=" + kilometraje +
                ", cantidadMisiones=" + cantidadMisiones +
                ", estadoOperativo=" + estadoOperativo +
                '}';
    }
}