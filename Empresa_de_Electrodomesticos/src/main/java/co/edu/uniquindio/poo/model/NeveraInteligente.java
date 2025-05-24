package co.edu.uniquindio.poo.model;

public class NeveraInteligente extends Electrodomestico {

    public NeveraInteligente(String modelo, String color, int capacKL, double precioBase) {
        super(modelo, color, capacKL, precioBase);
    }

    @Override
    public double calcularPrecioVenta() {
        return getPrecioBase()*0.3;
    }
    @Override
    public  void inspeccion(){

    }



}
