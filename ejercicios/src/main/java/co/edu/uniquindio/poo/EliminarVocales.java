package co.edu.uniquindio.poo;


import java.util.Scanner;

public class EliminarVocales {

        public static void Vocales() {


            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine(); // Leer la línea completa, incluyendo espacios

            scanner.close();

            String nombreSinVocales = nombre.replaceAll("[aeiouAEIOU]", ""); // Eliminar vocales

            System.out.println("El nombre "+nombre + "sin vocales es: "+ nombreSinVocales);
        }

        public static void main(String[] args){
            Vocales();
        }
}


