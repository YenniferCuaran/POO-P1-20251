package co.edu.uniquindio.poo.model;

public class Lavadora extends Electrodomestico {
    private boolean cargaFrontal;

    public Lavadora(String modelo, String color, int capacKL, double precioBase, boolean cargaFrontal) {
        super(modelo, color, capacKL, precioBase);
        this.cargaFrontal = cargaFrontal;
    }
    @Override
    public double calcularPrecioVenta(){
        double precioF=(getPrecioBase() * 0.15)+getPrecioBase();
        return precioF;
    }
    @Override
    public  void inspeccion(){

    }


}
