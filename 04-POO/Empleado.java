
package tp4_programacion2_gomezjuanmanuel;

public class Empleado {

    // Atributos de la clase
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;  // Atributo estático para contar los empleados

    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;  // Usando 'this' para distinguir el atributo 'id' del parámetro 'id'
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;  // Incrementar el contador de empleados
    }

    // Constructor sobrecargado que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados;  // Asignar un id único basado en el total de empleados
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000;  // Salario por defecto
        totalEmpleados++;  // Incrementar el contador de empleados
    }

    // Métodos sobrecargados para actualizar el salario
    public void actualizarSalario(double porcentajeAumento) {
        salario += salario * porcentajeAumento / 100;  // Aumento basado en porcentaje
    }


    // Método toString() para mostrar la información del empleado
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: " + salario;
    }

    // Método estático para mostrar el total de empleados creados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters para los atributos, aplicando encapsulamiento
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
