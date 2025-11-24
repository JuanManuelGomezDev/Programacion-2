
package tp7_programacion2_gomezjuanmanuel;

public abstract class abstracta {
    private String nombre;

    public abstracta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularArea();
}
