package co.edu.uniquindio.poo;

public class Cliente {
    private String nombre, apellidos, Id, correo;

    public Cliente(String nombre, String apellidos, String Id, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Id = Id;
        this.correo = correo;

    }
    //metodos Get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
