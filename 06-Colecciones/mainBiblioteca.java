
package tp6_programacion2_gomezjuanmanuel;

public class mainBiblioteca {
    public static void main(String[] args) {
        // Crear autores
        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A2", "J.K. Rowling", "Británica");

        // Crear libros
        Libro libro1 = new Libro("ISBN001", "Cien años de soledad", 1967, autor1);
        Libro libro2 = new Libro("ISBN002", "Harry Potter y la piedra filosofal", 1997, autor2);

        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Listar libros
        biblioteca.listarLibros();

        // Buscar un libro por ISBN
        Libro encontrado = biblioteca.buscarLibroPorIsbn("ISBN001");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }

        // Filtrar libros por año de publicación
        biblioteca.filtrarLibrosPorAnio(1997);

        // Eliminar un libro por ISBN
        biblioteca.eliminarLibro("ISBN002");
        System.out.println("Lista de libros después de eliminar el ISBN002:");
        biblioteca.listarLibros();

        // Mostrar cantidad de libros
        System.out.println("Cantidad de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());

        // Mostrar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
}
