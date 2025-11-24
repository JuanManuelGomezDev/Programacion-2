
package tp6_programacion2_gomezjuanmanuel;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Métodos para manipular libros
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println("--------------------");
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                System.out.println("--------------------");
            }
        }
    }

    public void mostrarAutoresDisponibles() {
        for (Libro libro : libros) {
            libro.getAutor().mostrarInfo();
            System.out.println("--------------------");
        }
    }
}
