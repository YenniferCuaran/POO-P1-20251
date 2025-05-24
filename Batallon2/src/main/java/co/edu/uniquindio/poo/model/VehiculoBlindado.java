package co.edu.uniquindio.poo.model;

public class VehiculoBlindado extends Vehiculo {
    private String nivelBlindaje;

    public VehiculoBlindado(String modelo, String id, int anioFabricacion, int kilometraje, int cantidadMisiones,String nivelBlindaje) {
        super(modelo, id, anioFabricacion, kilometraje, cantidadMisiones, EstadoOperativo.ENMANTENIMIENTO);
        this.nivelBlindaje = nivelBlindaje;
    }

    @Override
    public String toString() {
        return "VehiculoBlindado{" +
                "nivelBlindaje='" + nivelBlindaje + '\'' +
                '}';
    }
}