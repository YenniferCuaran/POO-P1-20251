package co.edu.uniquindio.poo.proyectofinal.model;
/**
 * Representa un libro tipo Libro de Referencia
 */
public class LReferencia extends Libro {
    private String ubicacion;


    /**
     * Metodo constructor de la clase Libro de Referencia
     * @param titulo
     * @param autor
     * @param genero
     * @param anioPublicacion
     * @param estado
     * @param ubicacion
     */
    public LReferencia(String titulo, String autor, String genero, int anioPublicacion,Estado estado, String ubicacion) {
        super(titulo, autor, genero, anioPublicacion,estado);
        this.ubicacion = ubicacion;
    }

    public void consultar() {
        throw new UnsupportedOperationException("Los libros de referencia no se pueden prestar.");
    }
}
