package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Equipo;
import co.edu.uniquindio.poo.model.Jugador;
import co.edu.uniquindio.poo.model.Torneo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Torneo torneo = new Torneo("E-Sport", "25/03/25");
        /*Scanner scanener = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("\n1. Agregar Equipo: ");
            System.out.println("2. Agregar Jugador: ");
            System.out.println("3. Agregar partida: ");
            System.out.println("4. Eliminar Equipo: ");
            System.out.println("5. Eliminar Jugador: ");
            System.out.println("6. Eliminar partida: ");
            System.out.println("7. Salir: ");
            opcion = scanener.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1:
            }
         */
        Equipo equipo1 = new Equipo("Quindio", new ArrayList<>());
        Equipo equipo2 = new Equipo("Real Madrid", new ArrayList<>());
        torneo.agregarEquipo(equipo1);
        torneo.agregarEquipo(equipo2);



        Jugador jugador1 = new Jugador("Juan", "El flaco");
        Jugador jugador2 = new Jugador("Raul", "El profe");
        Jugador jugador3 = new Jugador("Messi", "La pulga");
        Jugador jugador4 = new Jugador("Ronaldo", "CR7");
        Jugador jugador5 = new Jugador("Neymar", "El llorón");
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);
        equipo.agregarJugador(jugador4);
        equipo.agregarJugador(jugador5);



        }
    }
}