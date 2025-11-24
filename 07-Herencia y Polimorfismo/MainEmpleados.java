
package tp7_programacion2_gomezjuanmanuel;

import java.util.ArrayList;

public class MainEmpleados {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Juan", 3000));
        empleados.add(new EmpleadoTemporal("Pedro", 20, 160));

        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + " tiene un sueldo de: " + empleado.calcularSueldo());
            if (empleado instanceof EmpleadoTemporal) {
                System.out.println(empleado.getNombre() + " es un empleado temporal.");
            }
        }
    }
}
