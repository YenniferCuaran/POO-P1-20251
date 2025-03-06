package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private String nombre;
    private Long nit;

    private List<Producto> listProductos;
    private List<Cliente> listClientes;
    private List<Venta> listVentas;

    public Tienda(String nombre, Long nit){

        this.nombre = nombre;
        this.nit = nit;

        this.listProductos = new ArrayList<>();
        this.listClientes = new ArrayList<>();
        this.listVentas = new ArrayList<>();

    }


    public void registrarProducto(Producto producto) {
        listProductos.add(producto);
    }
    public void registrarCliente(Cliente cliente) {
        listClientes.add(cliente);
    }
    public void registrarVenta(Venta venta) {
        listVentas.add(venta);
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public List<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(List<Producto> listProductos) {
        this.listProductos = listProductos;
    }



    public List<Cliente> getListClientes() {
        return listClientes;
    }

    public void setListClientes(List<Cliente> listClientes) {
        this.listClientes = listClientes;
    }

    public List<Venta> getListVentas() {
        return listVentas;
    }

    public void setListVentas(List<Venta> listVentas) {
        this.listVentas = listVentas;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", nit=" + nit +
                ", listProductos=" + listProductos +
                ", listClientes=" + listClientes +
                ", listVentas=" + listVentas +
                '}';
    }
}
