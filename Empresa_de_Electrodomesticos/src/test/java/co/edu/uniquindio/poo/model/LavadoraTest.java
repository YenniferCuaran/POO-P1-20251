package co.edu.uniquindio.poo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LavadoraTest {


    //test correcto
    @Test
    public void calcularPrecioVenta() {
        Electrodomestico lavadora1=new Lavadora("543", "gris", 85, 200000, false);
            assertEquals(230000, lavadora1.calcularPrecioVenta());
    }


}
