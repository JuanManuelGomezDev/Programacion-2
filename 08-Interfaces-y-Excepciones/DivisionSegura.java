
package tp8_programacion2_gomezjuanmanuel;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce el numerador: ");
            int numerador = scanner.nextInt();
            System.out.print("Introduce el denominador: ");
            int denominador = scanner.nextInt();
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}
