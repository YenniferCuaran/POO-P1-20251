package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Escuela {
    private String nombre;
    private List<Estudiante>listEstudiantes;

    public Escuela(String nombre){

        this.nombre=nombre;
        this. listEstudiantes=new ArrayList<>();

    }

    public void almacenarEstudiante (Estudiante estudiante){
        listEstudiantes.add(estudiante);



    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }

    public void setListEstudiantes(List<Estudiante> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }

    @Override
    public String toString() {
        return "Escuela{" +
                "nombre='" + nombre + '\'' +
                ", listEstudiantes=" + listEstudiantes +
                '}';
    }
}

