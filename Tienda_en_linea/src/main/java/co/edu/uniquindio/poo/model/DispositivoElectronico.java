package co.edu.uniquindio.poo.model;

public class DispositivoElectronico extends Producto {
    private String marca, modelo;
    private int tiempoGArantia;

    public DispositivoElectronico(String nombre, String codigoUnico, double precio, Estado estado,  String marca, String modelo, int tiempoGArantia) {
        super(nombre,codigoUnico, precio, estado);
        this.marca = marca;
        this.modelo = modelo;
        this.tiempoGArantia = tiempoGArantia;
    }
    public void mostrarDescripcionDetallada (){

    }
}
