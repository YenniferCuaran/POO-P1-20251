package co.edu.uniquindio.poo.proyectofinal.model;
/**
 * Representa un libro tipo Libro Fisico
 */
public class LFisico extends Libro {

    private int numeroPaginas;
    private String editorial;
    private String ubicacion;
    /**
     * Metodo constructor de la clase Libro
     * @param titulo
     * @param autor
     * @param genero
     * @param anioPublicacion
     * @param estado
     * @param numeroPaginas
     * @param editorial
     * @param ubicacion
     */
    public LFisico(String titulo, String autor, String genero, int anioPublicacion, Estado estado, int numeroPaginas, String editorial, String ubicacion) {
        super(titulo, autor, genero, anioPublicacion,estado);
        this.numeroPaginas = numeroPaginas;
        this.editorial = editorial;
        this.ubicacion = ubicacion;
    }


}
