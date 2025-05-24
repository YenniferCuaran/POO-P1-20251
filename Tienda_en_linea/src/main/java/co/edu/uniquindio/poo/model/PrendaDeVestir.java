package co.edu.uniquindio.poo.model;

public class PrendaDeVestir extends Producto{
    private int talla;
    private String color;

    private Tipo tipo;

    public PrendaDeVestir(String nombre, String codigoUnico, double precio, Estado estado, int talla, String color, Tipo tipo) {
        super(nombre, codigoUnico, precio, estado);
        this.talla = talla;
        this.color = color;
        this.tipo=tipo;
    }
    public void mostrarDescripcionDetallada(){


    }
}
