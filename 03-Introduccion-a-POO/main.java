
package tp3_programacion2_gomezjuanmanuel;

public class main {

    public static void main(String[] args) {

        // Ejercicio 1: Registro de Estudiantes
        estudiante estudiante = new estudiante("Martín", "Pérez", "Java 101", 8.5);
        estudiante.mostrarInfo();
        estudiante.subirCalificacion(1.5);
        estudiante.mostrarInfo();
        estudiante.bajarCalificacion(2);
        estudiante.mostrarInfo();

        // Ejercicio 2: Registro de Mascotas
        mascota mascota = new mascota("Rex", "Perro", 3);
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        mascota.mostrarInfo();

        // Ejercicio 3: Encapsulamiento con la Clase Libro
        libro libro = new libro("Java para Todos", "Juan Pérez", 2020);
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año de publicación: " + libro.getAñoPublicacion());
        libro.setAñoPublicacion(2025);  // Intentar poner un año inválido

        // Ejercicio 4: Gestión de Gallinas en Granja Digital
        gallina gallina1 = new gallina(1, 2);
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina1.mostrarEstado();

        // Ejercicio 5: Simulación de Nave Espacial
        nave nave = new nave("Apollo", 50);
        nave.despegar();
        nave.avanzar(40);
        nave.recargarCombustible(30);
        nave.avanzar(40);
        nave.mostrarEstado();
    }
}
