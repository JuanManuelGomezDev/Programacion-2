
package tp8_programacion2_gomezjuanmanuel;

public class ValidarEdad {
    public static void main(String[] args) {
        try {
            int edad = -5;  // Valor de ejemplo
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("La edad debe estar entre 0 y 120 años.");
            }
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
