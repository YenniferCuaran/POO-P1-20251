package co.edu.uniquindio.poo.model;

public class Motocicleta extends Vehiculo {
    private String cilindrada;
    private int nPaquetes;

    public Motocicleta(String placa, String marca, String modelo, String cilindrada, int nPaquetes) {
        super(placa, marca, modelo);
        this.cilindrada = cilindrada;
        this.nPaquetes = nPaquetes;
    }


    //3
    @Override
    public void calcularCostoEnvio(Envio envio) {
        int costoEnvio;
        if (envio.getZona() == ZonaEntrega.RURAL) {   //if (Envio.getZona().equals("RURAL"))

            costoEnvio = 15000 * nPaquetes;

        } else {
            costoEnvio = 8000 * nPaquetes;

        }
        System.out.println("El costo de envio es: " + costoEnvio);





    }
}
    /*
     System.out.println("el  costo del envio es: "+);


     if (cliente.getNombre().equals(nombre)) {
                cantidadVocales = contarVocales2(cliente.getNombre());
            }
     */



