
package tp3_programacion2_gomezjuanmanuel;
public class nave {
    private String nombre;
    private double combustible;

    public nave(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar() {
        if (combustible > 0) {
            System.out.println("La nave " + nombre + " ha despegado.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(double distancia) {
        double combustibleNecesario = distancia * 0.5;
        if (combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
            System.out.println("La nave avanzó " + distancia + " unidades.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar.");
        }
    }

    public void recargarCombustible(double cantidad) {
        combustible += cantidad;
        System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible restante: " + combustible);
    }
}
