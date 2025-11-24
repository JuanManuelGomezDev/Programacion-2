
package tp6_programacion2_gomezjuanmanuel;

public class MainUniversidad {
    public static void main(String[] args) {
        // Crear universidad
        Universidad universidad = new Universidad("Universidad Nacional");

        // Crear profesores
        Profesor profesor1 = new Profesor("P1", "Juan Pérez", "Matemáticas");
        Profesor profesor2 = new Profesor("P2", "Ana López", "Física");

        // Crear cursos
        Curso curso1 = new Curso("C1", "Álgebra");
        Curso curso2 = new Curso("C2", "Cálculo");

        // Agregar profesores y cursos a la universidad
        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);

        // Asignar profesor a curso
        universidad.asignarProfesorACurso("C1", "P1");
        universidad.asignarProfesorACurso("C2", "P2");

        // Listar cursos y profesores
        universidad.listarCursos();  // Esto debería llamar a mostrarInfo() de cada curso
        universidad.listarProfesores();  // Esto debería llamar a mostrarInfo() de cada profesor
    }
}
