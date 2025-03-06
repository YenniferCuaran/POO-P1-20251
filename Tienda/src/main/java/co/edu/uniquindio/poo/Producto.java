package co.edu.uniquindio.poo;

public class Producto {

    private String nombre, codigoProducto, categoria;
    private Double precio;
    private int stockDisponible;


    public Producto(String nombre, String codigoProducto, String categoria, Double precio, int stockDisponible){
        this.nombre = nombre;
        this. codigoProducto = codigoProducto;
        this.categoria = categoria;
        this.precio = precio;
        this.stockDisponible = stockDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(Int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", codigoProducto='" + codigoProducto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", stockDisponible=" + stockDisponible +
                '}';
    }
}
