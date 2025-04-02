/* Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales
 trabajadas y de su salario por hora */

package co.edu.uniquindio.poo;
import java.util.Scanner;

public class Operadoresej2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese las horas semanales trabajadas: ");
        int hsemanales= scanner.nextInt(); //guardamos las horas semanales

        System.out.println("Ingrese el salrio por hora: ");
        double salarioh= scanner.nextDouble(); //guardamos el salario por hora

        scanner.close(); //Cerramos el objeto Scanner para liberar los recursos del sistema

        /*[La regla general es cerrar el Scanner una vez que hayas terminado de leer la entrada que
        necesitabas.Esto es especialmente crucial cuando trabajas con flujos de archivos.*/

        double salarioSemanal=salarioh*hsemanales;//calculamos el salario semanal

        System.out.print("El salario semanal del empleado es: " +salarioSemanal);


    }
}
