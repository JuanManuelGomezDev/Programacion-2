
package tp7_programacion2_gomezjuanmanuel;

public class Mainarea {
    public static void main(String[] args) {
        abstracta[] figuras = new abstracta[] {
            new Circulo("Círculo 1", 5),
            new Rectangulo("Rectángulo 1", 4, 6)
        };

        for (abstracta figura : figuras) {
            System.out.println("Área de " + figura.getNombre() + ": " + figura.calcularArea());
        }
    }
}
