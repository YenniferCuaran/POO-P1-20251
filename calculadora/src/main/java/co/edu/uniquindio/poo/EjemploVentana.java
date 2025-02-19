package co.edu.uniquindio.poo;

//entrada y salida de datos con JOptionPane
import javax.swing.*;

public class EjemploVentana {
    public static void main(String[] args) {
        int edad;
        double altura;
        char iapellido;
        String nombre;

        nombre= JOptionPane.showInputDialog("Ingrese su nombre");
        iapellido=JOptionPane.showInputDialog("Ingrese la inicial de su apellido").charAt(0);
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura"));
        //para tipo float: reemplaza float en double

        JOptionPane.showMessageDialog(null,"Su nombre es: " +nombre);
        JOptionPane.showMessageDialog(null,"La inicial de su apellido es: " +iapellido);
        JOptionPane.showMessageDialog(null,"Su edad es: " +edad);
        JOptionPane.showMessageDialog(null,"Su altura es: "+altura);


    }


}
