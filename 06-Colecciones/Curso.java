
package tp6_programacion2_gomezjuanmanuel;

public class Curso {
    private final String codigo;
    private final String nombre;
    private Profesor profesor;

    // Constructor
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;  // Inicializamos sin profesor
    }

    // Métodos
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void mostrarInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());  // Muestra el nombre del profesor
        } else {
            System.out.println("Profesor: No asignado");
        }
    }
}
