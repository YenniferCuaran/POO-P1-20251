package co.edu.uniquindio.poo.model;

public abstract class Producto {
    private String nombre, codigoUnico;
    private double precio;

    private Estado estado;

    public Producto(String nombre, String codigoUnico, double precio, Estado estado) {
        this.nombre=nombre;
        this.codigoUnico=codigoUnico;
        this.precio=precio;
        this.estado=estado;
    }
    public abstract void mostrarDescripcionDetallada();

    //metodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
