/*
Contar dígitos de un número
Escribe un programa que pida un número entero positivo y cuente cuántos dígitos tiene
usando un while.

package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Ejercicio4 {

    public static void digitosNumero() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite un numero entero positivo: ");
        int numero = scanner.nextInt();

        scanner.close();

        if (numero < 0) {
            System.out.println("El numero no puede ser negativo");
        }
        else {

            int contadorDigitos = 0;
            int temp = numero;

            while (temp > 0) {

                temp /= 10;
                contadorDigitos++;


            }
            System.out.println("el numero " + numero + " tiene " + contadorDigitos + " digitos");
        }


        public static void main (String []args) {
            digitosNumero();
        }

    }
}
*/