package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tienda tienda=new Tienda("Fantasy", "www.fantasy");
        Inventario inventario=new Inventario("45", 6);

        //creamos los productos
        Producto libro1=new Libro("lIBRO ", "111", 32000, Estado.DISPONIBLE, "El principito", "Antoine de Saint", 50 );
        Producto libro2=new Libro("lIBRO ", "222", 32000, Estado.DISPONIBLE, "Rayuela", "Julio Cortázar", 48 );

        Producto prenda1=new PrendaDeVestir("PRENDA DE VESTIR", "333", 15000, Estado.DISPONIBLE, 10, "avano", Tipo.CAMISA);
        Producto prenda2=new PrendaDeVestir("PRENDA DE VESTIR", "444", 18000, Estado.AGOTADO, 8, "rojo", Tipo.CHAQUETA);

        Producto dispositivo1=new DispositivoElectronico("Tableta", "555", 950000, Estado.DISPONIBLE, "Apple", "iPad Pro", 5);
        Producto dispositivo2=new DispositivoElectronico("Auriculares", "666", 120000, Estado.DESCONTINUADO, "Sony", "wh-100", 3);

        //agregamos los productos a la lista









    }
}