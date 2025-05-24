package co.edu.uniquindio.poo.model;

public class NeveraConvencional extends Electrodomestico {

    public NeveraConvencional(String modelo, String color, int capacKL, double precioBase) {
        super(modelo, color, capacKL, precioBase);
    }
    @Override
    public double calcularPrecioVenta(){
        return getPrecioBase();

    }
    @Override
    public  void inspeccion(){

    }

}
