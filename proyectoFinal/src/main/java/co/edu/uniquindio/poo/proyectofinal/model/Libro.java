package co.edu.uniquindio.poo.proyectofinal.model;
/**
 * Representa un libro
 */
public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int anioPublicacion;
    private Estado estado;
    /**
     * Metodo constructor de la clase Libro
     * @param titulo
     * @param autor
     * @param genero
     * @param anioPublicacion
     * @param estado
     */

    public Libro(String titulo, String autor, String genero, int anioPublicacion, Estado estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
        this.estado = estado;
    }

    /**
     * Metodos getters y setters de los atributos de la clase Libro
     */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
