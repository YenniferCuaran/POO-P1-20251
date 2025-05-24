package co.edu.uniquindio.poo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {

    @Test
    public void calcularCostoEnvio() {
        Vehiculo vehiculo1=new Camion("ewr54", "chevrolet", "FRR 1119", 7600, 3, 12);
        assertEquals(12000,vehiculo1.calcularCostoEnvio);
    }


}