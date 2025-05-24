package co.edu.uniquindio.poo.model;

public class VehiculoApoyo extends Vehiculo{

    private TipoFuncion tipoFuncion;

    public VehiculoApoyo(String modelo, String  id, int anioFabricacion, int kilometraje, int cantidadMisiones, TipoFuncion tipoFuncion) {
        super(modelo, id, anioFabricacion, kilometraje, cantidadMisiones, EstadoOperativo.DISPONIBLE);
        this.tipoFuncion = tipoFuncion;
    }

    @Override
    public String toString() {
        return "VehiculoApoyo{" +
                "tipoFuncion=" + tipoFuncion +
                '}';
    }
}