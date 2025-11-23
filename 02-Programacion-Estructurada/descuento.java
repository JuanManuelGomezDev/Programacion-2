package tp2_programacion2_gomezjuanmanuel;
import java.util.Scanner;

public class descuento{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scan.next().charAt(0);

        double descuento = 0;

        switch (categoria) {
            case 'A', 'a' -> descuento = 0.10;
            case 'B', 'b' -> descuento = 0.15;
            case 'C', 'c' -> descuento = 0.20;
            default -> {
                System.out.println("Categoría no válida.");
                return;
            }
        }

        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}
