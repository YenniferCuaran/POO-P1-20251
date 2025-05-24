package co.edu.uniquindio.poo.model;

public class Furgoneta extends Vehiculo {
    private Transmision transmision;
    private int kmRecorridos;

    public Furgoneta(String placa, String marca, String modelo, Transmision transmision,  int kmRecorridos) {
        super(placa, marca,modelo);
        this.transmision = transmision;
        this.kmRecorridos = kmRecorridos;


    }
    //get y set
    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    //2
    @Override
    public void calcularCostoEnvio(){
        int CostoEnvio= kmRecorridos*3000;
        System.out.println("El costo de envio en una furgoneta es: "+ CostoEnvio);

    }
}
