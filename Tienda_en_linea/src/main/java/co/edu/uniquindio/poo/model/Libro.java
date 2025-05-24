package co.edu.uniquindio.poo.model;


public class Libro extends Producto{
    private String titulo, autor;
    private int numPaginas;

    public Libro(String nombre, String codigoUnico, double precio, Estado estado, String titulo, String autor, int numPaginas) {
        super(nombre, codigoUnico, precio, estado);
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;

    }
    public void mostrarDescripcionDetallada() {


    }



}

