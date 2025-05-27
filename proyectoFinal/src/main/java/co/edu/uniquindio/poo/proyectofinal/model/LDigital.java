package co.edu.uniquindio.poo.proyectofinal.model;
/**
 * Representa un libro tipo Libro Digital.
 */
public class LDigital extends Libro {
    private String enlaceDescarga;
    private Formato formato;
    /** Metodo constructor de la Libro Digital.
     * @param titulo
     * @param autor
     * @param genero
     * @param anioPublicacion
     * @param estado
     * @param enlaceDescarga
     * @param formato
     */
    public LDigital(String titulo, String autor, String genero, int anioPublicacion,Estado estado, String enlaceDescarga, Formato formato) {
        super(titulo, autor, genero, anioPublicacion,estado);
        this.enlaceDescarga = enlaceDescarga;
        this. formato=formato;
    }

    @Override
    public String getTipo() {
        return "Digital";
    }

    //se cree q tambien tiene los metodos prestar y devolver de la clase LFisico
}

