
/* Sumar los primeros N números naturales
Escribe un programa que pida un número N al usuario y calcule
 la suma de los primeros N números naturales usando un bucle while.
      */
package co.edu.uniquindio.poo;


import java.util.Scanner;

public class Ejercicio2 {

        public void suma(){
                Scanner scanner = new Scanner(System.in);

                System.out.println("Ingrese un numero");
                int numero = scanner.nextInt();

                while (i<=numero){

                        suma=suma+numero //=suma ++
                                        //suma iterativa
                }
        public static void main(String[] args) {


        }

}

/* import java.util.Scanner;

        public class SumaNPrimerosNaturales {

                public static void main(String[] args) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Ingrese un número entero N: ");
                        int n = scanner.nextInt();
                        scanner.close();

                        int suma = 0;
                        int i = 1;

                        while (i <= n) {
                                suma += i;
                                i++;
                        }

                        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
                }
        }


        */
