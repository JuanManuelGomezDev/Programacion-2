
package tp6_programacion2_gomezjuanmanuel;
import java.util.ArrayList;  // Importación correcta de ArrayList
import java.util.List;  // Importación de List

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    // Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();  // Usamos ArrayList de java.util
        this.cursos = new ArrayList<>();  // Usamos ArrayList de java.util
    }

    // Métodos
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            profesor.agregarCurso(curso);
        } else {
            System.out.println("No se pudo asignar el profesor al curso.");
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }

    public void listarProfesores() {
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
}
