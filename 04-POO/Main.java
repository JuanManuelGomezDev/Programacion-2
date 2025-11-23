
package tp4_programacion2_gomezjuanmanuel;

public class Main {

    public static void main(String[] args) {

        // Instanciación de objetos usando ambos constructores
        Empleado e1 = new Empleado("Ana", "Gerente");
        Empleado e2 = new Empleado("Luis", "Programador");
        Empleado e3 = new Empleado(3, "Carlos", "Analista", 50000);

        // Aplicar el método actualizarSalario() sobre distintos empleados
        e1.actualizarSalario(10);  // Aumento del 10% para Ana
        e2.actualizarSalario(2000);  // Aumento fijo de 2000 para Luis
        e3.actualizarSalario(5);  // Aumento del 5% para Carlos

        // Imprimir la información de cada empleado con toString()
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrar el total de empleados creados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
