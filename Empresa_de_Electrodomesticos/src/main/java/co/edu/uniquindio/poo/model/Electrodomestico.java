package co.edu.uniquindio.poo.model;

public abstract class Electrodomestico {
    private String modelo, color;
    private int capacKL;
    private double precioBase;

    public Electrodomestico(String modelo, String color, int capacKL, double precioBase) {
        this.modelo = modelo;
        this.color = color;
        this.capacKL = capacKL;
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double preciBase) {
        this.precioBase = preciBase;
    }

    public abstract double calcularPrecioVenta();
    public abstract void inspeccion();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
