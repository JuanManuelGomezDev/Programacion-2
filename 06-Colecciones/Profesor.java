
package tp6_programacion2_gomezjuanmanuel;
import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private final String id;
    private final String nombre;
    private final String especialidad;
    private final List<Curso> cursos;

    // Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Implementación correcta del método getNombre()
    public String getNombre() {
        return nombre;  // Aquí debe devolver el nombre del profesor, no lanzar excepción.
    }

    // Otros métodos
    public String getId() {
        return id;
    }

    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            curso.setProfesor(this);  // Sincroniza el lado del curso
        }
    }

    public void eliminarCurso(Curso curso) {
        if (cursos.contains(curso)) {
            cursos.remove(curso);
            curso.setProfesor(null);  // Elimina la referencia del profesor en el curso
        }
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println("Curso: " + curso.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cursos: ");
        listarCursos();
    }
}
