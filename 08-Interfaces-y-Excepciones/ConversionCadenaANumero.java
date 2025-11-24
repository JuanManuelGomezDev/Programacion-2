
package tp8_programacion2_gomezjuanmanuel;

import java.util.Scanner;

public class ConversionCadenaANumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce un número: ");
            String input = scanner.nextLine();
            int numero = Integer.parseInt(input);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada inválida. No es un número entero.");
        } finally {
            scanner.close();
        }
    }
}