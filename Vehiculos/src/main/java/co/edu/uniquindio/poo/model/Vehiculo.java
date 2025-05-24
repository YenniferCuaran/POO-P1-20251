// actividad del tema: Interface y Encapsulamiento
// Actividad: Vehiculos
package co.edu.uniquindio.poo.model;

public class Vehiculo {
    private String marca, color;

    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
    //metodos getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
