package co.edu.uniquindio.poo.proyectofinal.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BibliotecaTest {

    @Test
    void testRegistrarEmpleado() {

        Empleado emp1 = new Administrador("001", "Jose");
        Empleado emp2 = new Bibliotecario("002", "Fabian");

        assertNotEquals(emp1.getCredencial(), emp2.getCredencial(), "Las credenciales de los empleados no deben ser iguales");


    }
}
