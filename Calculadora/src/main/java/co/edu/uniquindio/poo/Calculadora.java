//ejemplo de sobrecarga de datos
package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Calculadora {

        public int sumar(int a, int b) {
            return a + b;
        }

        public double sumar(double a, double b) {
            return a + b;
        }

        public int sumar(int a, int b, int c) {
            return a + b + c;
        }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor 1: ");
        int valor1 = scanner.nextInt();

        System.out.println("Ingrese el valor 2: ");
        int valor2 = scanner.nextInt();

        System.out.println(valor1, valor2);
    }



}
