
package tp7_programacion2_gomezjuanmanuel;

public class Rectangulo extends abstracta {
    private double largo;
    private double ancho;

    public Rectangulo(String nombre, double largo, double ancho) {
        super(nombre);
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return largo * ancho;  // Área de un rectángulo
    }
}
