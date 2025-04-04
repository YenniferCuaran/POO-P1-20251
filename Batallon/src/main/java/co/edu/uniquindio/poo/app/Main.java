package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Batallon batallon = new Batallon("Batallón de infanteria 124");
        Vehiculo tropa = new TransporteTropa("M1", "V702", 2005, 80,10, 26);
        Vehiculo blindado = new VehiculoBlindado("Humvee M11", "V356", 2010, 80, 51, "medio");
        Vehiculo apoyo = new VehiculoApoyo("Bradley M2", "V548", 2008, 60, 49, TipoFuncion.LOGISTICA);
        Vehiculo apoyoUrbano = new VehiculoApoyo("Brad", "V548", 2008, 60, 12, TipoFuncion.LOGISTICA);

        Vehiculo[] vehiculos = {tropa, blindado, apoyo};

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("-------------------");
            System.out.println(vehiculo.toString());

        }
        Mision mision1= new Mision("12/01", "Armenia", 34, List.of(apoyoUrbano,blindado));
        Mision mision2= new Mision("26/01", "Bogotá", 30, List.of(apoyo, tropa));
        Mision mision3= new Mision("12/02", "Barranquilla", 15, List.of(blindado));

        Mision[] misiones = {mision1, mision2, mision3};
        for (Mision mision : misiones) {
            System.out.println(mision.toString());

        }

        System.out.println("------------------");
        batallon.registrarMision(mision1);
        batallon.registrarMision(mision2);
        batallon.registrarMision(mision3);


        System.out.println("------------------");
        batallon.agregarVehiculo(tropa);
        batallon.agregarVehiculo(blindado);
        batallon.agregarVehiculo(apoyo);
        batallon.agregarVehiculo(apoyoUrbano);

        System.out.println("Lista de vehiculos que han estado en mas de 50 misiones");
        System.out.println(batallon.vehiculos50Misiones(tropa));
        System.out.println(batallon.vehiculos50Misiones(blindado));
        System.out.println(batallon.vehiculos50Misiones(apoyo));
        System.out.println(batallon.vehiculos50Misiones(apoyoUrbano));




    }
}