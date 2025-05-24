package co.edu.uniquindio.poo.model;

public class Camion extends Vehiculo {
    private int capCarga;

    protected int nPeajes;
    protected int sumaPesoPaquetes;

    public Camion(String placa, String marca, String modelo, int capCarga, int npeajes, int sumaPesoPaquetes) {
        super(placa, marca, modelo);

        this.capCarga = capCarga;
        this.nPeajes = npeajes;
        this.sumaPesoPaquetes = sumaPesoPaquetes;
    }

    public int calcularCostoPeajes() {
        int costoPeajes = nPeajes * 12000;
        return costoPeajes;
    }

    public int calcularCostoPesoPaquetes() {
        int costoPesoPaquetes = sumaPesoPaquetes * 7000;
        return costoPesoPaquetes;
    }

    //1
    @Override
    public void calcularCostoEnvio() {
        int costoEnvio = calcularCostoPeajes() + calcularCostoPesoPaquetes();
        System.out.println("Costo total del envío: " + costoEnvio);
    }




}




