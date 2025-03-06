package co.edu.uniquindio.poo;

public class Venta {
    private String fechaVenta;
    private String clienteRealizacionCompra, producto;
    private int cantidad;
    private double totalVenta;


    public Venta(String fechaVenta, String clienterealizacionventa, String producto, int cantidad, double totalventa){
        this fechaVenta = fechaVenta;
        this.clienteRealizacionCompra = clienterealizacionventa;
        this.producto = producto;
        this.cantidad = cantidad;
        this.totalVenta = totalventa;

    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getClienteRealizacionCompra() {
        return clienteRealizacionCompra;
    }

    public void setClienteRealizacionCompra(String clienteRealizacionCompra) {
        this.clienteRealizacionCompra = clienteRealizacionCompra;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "fechaVenta=" + fechaVenta +
                ", clienteRealizacionCompra='" + clienteRealizacionCompra + '\'' +
                ", producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                ", totalVenta=" + totalVenta +
                '}';
    }
}
