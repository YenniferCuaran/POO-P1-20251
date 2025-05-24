package co.edu.uniquindio.poo.model;

public class TransporteTropa extends Vehiculo{
    private int capacidadSoldados;


    public  TransporteTropa (String modelo, String  id, int anioFabricacion, int kilometraje, int cantidadMisiones, int capacidadSoldados) {
        super(modelo, id, anioFabricacion, kilometraje, cantidadMisiones,  EstadoOperativo.DISPONIBLE);
        this.capacidadSoldados=capacidadSoldados;
    }

    @Override
    public String toString() {
        return "TransporteTropa{" +
                "capacidadSoldados=" + capacidadSoldados +
                '}';
    }
}