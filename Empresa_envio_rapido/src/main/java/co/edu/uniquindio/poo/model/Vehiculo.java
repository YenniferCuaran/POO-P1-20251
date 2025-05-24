package co.edu.uniquindio.poo.model;

public abstract class Vehiculo {
    protected String placa, marca, modelo;


    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;

    }

    public abstract void  calcularCostoEnvio();

}
