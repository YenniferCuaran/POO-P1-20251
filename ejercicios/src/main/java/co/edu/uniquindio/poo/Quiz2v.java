// Crear un programa en Java que pida al usuario ingresar 10 números enteros.
// El programa debe sumar solo los
//números positivos e ignorar los negativos. Al final, debe mostrar la suma total acumulada y
// cuántos números positivos fueron ingresados.

package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Quiz2v {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese 10 numeros enteros: ");

        int numeros = scanner.nextInt();
        scanner.close();

        boolean cNumeros=1;
        int sumar=0;
        int npositivos=0;

        while(cNumeros) {


            if (numeros > 0) {
                sumar = numeros;
                npositivos = 0;

            } else {
                System.out.println("El numero es negativo");
            }

        }
    }
}
