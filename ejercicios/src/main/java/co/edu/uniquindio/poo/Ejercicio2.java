/* Sumar los primeros N números naturales
Escribe un programa que pida un número N al usuario y calcule
 la suma de los primeros N números naturales usando un bucle while.
      */
package co.edu.uniquindio.poo;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();
        scanner.close();

        int suma=0;
        int i=1;

        while (i<=numero){
           suma+=i; // suma el valor de i a la variable suma.//
           //  Es equivalente a suma = suma + i;.//
            i++; //equivalente a i = i + 1;.//
        }
        System.out.print("La suma de los primeros "+ numero + " numeros naturales es: " +suma);


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
