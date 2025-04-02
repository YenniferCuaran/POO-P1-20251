package co.edu.uniquindio.poo.model;

import java.util.List;

public class juego {

    public static void main(String[] args) {

        //Creamos los jugadores
        Jugador jugador1 = new Jugador("Jhon", "jhonsito", Rol.ATACANTE);
        Jugador jugador2 = new Jugador("Camila", "cami10", Rol.LIDER);
        Jugador jugador4 = new Jugador("Messi", "La pulga", Rol.ATACANTE);
        Jugador jugador5 = new Jugador("Cristiano", "CR7", Rol.ATACANTE);
        Jugador jugador6 = new Jugador("Casillas", "Casi", Rol.SOPORTE);
        Jugador jugador7 = new Jugador("Neymar", "Payaso", Rol.ATACANTE);

        //Creamos los equipos
        Equipo equipo1 = new Equipo("Quindio FC", List.of(jugador4, jugador5, jugador6));
        Equipo equipo2 = new Equipo("Real Madrid", List.of(jugador1, jugador2, jugador7));
        Equipo equipo3 = new Equipo("Barcelona FC", List.of(jugador4, jugador5, jugador6));
        Equipo equipo4 = new Equipo("Sevilla FC", List.of(jugador1, jugador2, jugador7));

        //Creamos el torne
        Torneo torneo = new Torneo("La Liga", "2024-2025", List.of(equipo1, equipo2));

        //Creamos el resultado

        //Creamos el partido
        Partida partida = new Partida("9:00 am - 20/03/2025", "1", equipo1, equipo4,resultado1);

    }

}
