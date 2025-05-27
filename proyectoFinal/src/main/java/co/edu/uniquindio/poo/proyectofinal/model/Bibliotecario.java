package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.ArrayList;
import java.util.List;
/**
 * Representa un empleado tipo bibliotecario.
 */
public class Bibliotecario extends Empleado {

    private List<Usuario> listUsuarios;
    private List<Libro> listLibros;
    private List<Prestamo> listPrestamos;

    /**
     * Metodo constructor de la clase Bibliotecario
     * @param credencial
     * @param nombre
     */
    public Bibliotecario(String credencial, String nombre) {
        super(credencial, nombre);
        this.listUsuarios = new ArrayList<>();
        this.listLibros = new ArrayList<>();
        this.listPrestamos = new ArrayList<>();
    }

    /**
     * Registra un nuevo libro.
     *
     * @param libro Libro a registrar.
     */
    public void registrarLibro(Libro libro) {
        this.listLibros.add(libro);
    }

    /**
     * Registra un nuevo usuario.
     * @param usuario Usuario a registrar.
     */
    public void registrarUsuario(Usuario usuario) {
        this.listUsuarios.add(usuario);
    }
    //metodo que permite buscar un usuario por su credencial

    private Usuario buscarUsuarioPorCredencial(String credencial) {
        for (Usuario usuario : listUsuarios) {
            if (usuario.getCredencial().equals(credencial)) {
                return usuario;
            }
        }
        return null; // No encontrado
    }
    // metodo que permite buscar un libro por su titulo
    private Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : listLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null; // No encontrado
    }

    /**
     * Registra un prestamo
     * @param credencialUsuario
     * @param titulosLibros
     * @param fechaInicio
     * @param fechaFin
     */
    public void registrarPrestamo(String credencialUsuario, List<String> titulosLibros, String fechaInicio, String fechaFin) {
        Usuario usuario = buscarUsuarioPorCredencial(credencialUsuario);
        if (usuario == null) {
            System.out.println("Usuario no encontrado.");
            return;
        }

        List<Libro> ListLibrosPrestados = new ArrayList<>();
        for (String titulo : titulosLibros) {
            Libro libro = buscarLibroPorTitulo(titulo);
            if (libro != null && libro.getEstado() == Estado.DISPONIBLE) {
                libro.setEstado(Estado.PRESTADO);
                ListLibrosPrestados.add(libro);
            } else {
                System.out.println("Libro no disponible o no encontrado: " + titulo);
            }
        }

        if (ListLibrosPrestados.isEmpty()) {
            Prestamo prestamo = new Prestamo(fechaInicio, fechaFin, usuario, ListLibrosPrestados);
            listPrestamos.add(prestamo);
            System.out.println("Préstamo registrado con éxito.");
        } else {
            System.out.println("No se pudo registrar el préstamo. Ningún libro válido.");
        }
    }

    /**
     * Registra una devolucion de un Libro
     * @param usuario
     * @param tituloLibro
     */

    public void devolucionLibro(Usuario usuario, String tituloLibro) {
            for (Prestamo prestamo : new ArrayList<>(usuario.getPrestamosActivos())) {
                Libro libro = prestamo.getLibro();

                if (libro.getTitulo().equalsIgnoreCase(tituloLibro) && libro.getEstado() == Estado.PRESTADO) {
                    libro.setEstado(Estado.DISPONIBLE);
                    System.out.println("Libro '" + libro.getTitulo() + "' devuelto correctamente.");
                    return;
                }
            }
            System.out.println("No se encontró el préstamo activo del libro '" + tituloLibro + "' para este usuario.");
    }
}
















