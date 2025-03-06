package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Tienda tienda = new Tienda("la esquina", "133");
        //Creamos a los productos
        Producto producto1 = new Producto("frijoles", "111", "legumbres", 2.500, 3);
        Producto producto2 = new Producto("salchicha", "112", "embutidos", 2.000, 4);
        Producto producto3= new Producto("yogurt", "113", "lacteos", 2.300, 2);


        Venta venta1 = new Venta("6/03", "Jose", "salchicha", 1, 2.000);
        Venta venta2= new Venta("2/03", "Luisa", "salchicha", 1, 2.000);


        Cliente cliente1 = new Cliente("Jose", "1565", "crr18", "65478", "jose@gmail.com");
        Cliente cliente2 = new Cliente("Maria", "1588", "crr12", "58256", "maria@gmail.com");







        System.out.printf("Hello and welcome!");


    }
}