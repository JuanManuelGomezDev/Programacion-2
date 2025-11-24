
package tp7_programacion2_gomezjuanmanuel;

public class Circulo extends abstracta {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;  // Área de un círculo
    }
}

