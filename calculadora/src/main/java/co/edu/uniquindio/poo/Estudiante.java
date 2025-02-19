package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Estudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su identificacion: ");
        String identificacion = scanner.nextLine();

        System.out.print("Ingrese sus nombres: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese sus apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Ingrese su correo: ");
        String correo = scanner.next();

        System.out.print("Ingrese su telefono: ");
        long telefono = Long.highestOneBit(scanner.nextLong()); // debo escribir esto: Long.highestOneBit(scanner.nextLong());
                                                                //para que no me de error
                                                                //es diferente esa parte porque es tipo de dato long

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();


        System.out.println("INFORMACION DEL ESTUDIANTE:");
        System.out.println("Identificación: " + identificacion);
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Correo electrónico: " + correo);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);

    }
}
