package co.edu.uniquindio.poo.model;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private String id;
    private int cantidadTotal;
    private List<Producto> listProductos;

    public Inventario(String id, int cantidadTotal) {
        this.id = id;
        this.cantidadTotal = cantidadTotal;
        this.listProductos = new ArrayList<>();
    }
    //metodo que agrega un producto a la lista de productos
    public void agregarProducto(Producto producto) {
        listProductos.add(producto);
    }
    //
    // metodo que  busca un producto por codigo

    public Producto buscarPorCodigo(String codigo) {
        for(Producto producto : listProductos) {
            if(producto.getCodigo().equalsIgnoreCase(codigo)){
                return producto;
            }
        }
        return null; //no se encontro el producto
    }

}
