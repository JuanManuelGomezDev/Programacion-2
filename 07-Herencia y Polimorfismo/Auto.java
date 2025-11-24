
package tp7_programacion2_gomezjuanmanuel;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);  // Llamada al constructor de la superclase
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Llamada al método de la superclase
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }
}
