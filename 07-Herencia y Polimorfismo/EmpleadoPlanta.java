
package tp7_programacion2_gomezjuanmanuel;

public class EmpleadoPlanta extends Empleado {
    private double salarioBase;

    public EmpleadoPlanta(String nombre, double salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSueldo() {
        return salarioBase;  // Sueldo fijo
    }
}
