package co.edu.uniquindio.poo.model;

import java.util.Date;

public class F3D extends Funcion {
    private boolean usoTecnologia;

    public F3D(String titulo, String duracion, Date horario, double precioBase, double precioTecnologia, boolean usoTecnologia) {
        super(titulo,duracion,horario,precioBase);
        this.usoTecnologia = usoTecnologia;
    }

    //metodos get y set

    public boolean getUsoTecnologia() {
        return usoTecnologia;
    }

    public void setUsoTecnologia(boolean usoTecnologia) {
        this.usoTecnologia = usoTecnologia;
    }
    public void calcularEntrada(F3D entrada) {
        if (entrada.usoTecnologia) {}

    }


}
