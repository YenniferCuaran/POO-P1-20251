//Preparcial 3 Diurnno
//
package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.List;


public class Empresa {
    private String nombre, nit;
    private List<Electrodomestico> listElectrodomesticos;
    private SubEmpresa subEmpresa;

    public Empresa(String nombre, String nit, SubEmpresa subEmpresa) {
        this.nombre = nombre;
        this.nit = nit;
        this.listElectrodomesticos = new ArrayList<>();
        this.subEmpresa=subEmpresa;

    }
    public void agregarElectrodomestico(Electrodomestico electrodomestico){
        listElectrodomesticos.add(electrodomestico);

    }

}
