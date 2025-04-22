package co.edu.uniquindio.poo.model;

public class Medico extends Persona {
    Especializacion especializacion;

    //metodo constructor de la clase Medico
    public (String  nombreCommpleto, String id, String nombreContacto,String numContacto, Especializacion especializacion ){
        super(String  nombreCommpleto, String id, String nombreContacto,String numContacto);

        this.especializacion=especializacion;
    }

}
