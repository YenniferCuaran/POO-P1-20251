package co.edu.uniquindio.poo.model;

import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> listJugadores;

    public Equipo(String nombre, List<Jugador> listJugadores) {
        this.nombre = nombre;
        this.listJugadores = listJugadores;
    }
    public String getNombre() {

        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Jugador> getListJugadores() {
        return listJugadores;
    }
    public void setListJugadores(List<Jugador> listJugadores) {
        this.listJugadores = listJugadores;
    }
    public void agregarJugador(Jugador jugador) {
        listJugadores.add(jugador);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", listJugadores=" + listJugadores +
                '}';
    }
}
