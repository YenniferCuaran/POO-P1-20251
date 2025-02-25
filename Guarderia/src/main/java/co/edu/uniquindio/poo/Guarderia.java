package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Guarderia {

    private String nombres;
    private List<Ninio> listNinios;

    public Guarderia(String nombres) {
        this.nombres = nombres;
        this.listNinios = new ArrayList<>();
    }

    public void almacenarNinios(Ninio ninio) {
        listNinios.add(ninio);
    }

    int contador=0;
    public void cantidadNiniosMayores5(Ninio ninio) {
        if (edad >=   5){
            contador++;

            System.out.println("Hay" + contador + "niños mayores a 5 años");

        }
    }

    @Override
    public String toString() {
        return "Guarderia{" +
                "nombres='" + nombres + '\'' +
                ", listNinios=" + listNinios +
                '}';
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public List<Ninio> getListNinios() {
        return listNinios;
    }

    public void setListNinios(List<Ninio> listNinios) {
        this.listNinios = listNinios;
    }
}