/*Tabla de multiplicar de un número
Pide al usuario un número e imprime su tabla de multiplicar del 1 al 10 usando un bucle for. */


package co.edu.uniquindio.poo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.print(" Ingrese un numero entero: ");
        int numero= scanner.nextInt();
        scanner.close();

        System.out.println("Tabla de multiplicar");

        for(int i=1; i<=10; i++){

            System.out.println(numero +"x" + i +"=" +(numero*i));
        }


    }
}
