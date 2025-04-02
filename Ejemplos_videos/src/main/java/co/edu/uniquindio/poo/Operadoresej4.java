package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Operadoresej4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //ingresamos los datos de un vendedor
        System.out.println("Ingresar los siguientes datos del vendedor: ");
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();//
        System.out.println("Cantidad de carros vendidos: ");
        int ncarros= entrada.nextInt();


        int salario=1000;
        int comision=150*ncarros;


    }
}
