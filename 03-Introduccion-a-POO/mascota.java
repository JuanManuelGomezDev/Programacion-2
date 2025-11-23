
package tp3_programacion2_gomezjuanmanuel;

public class mascota {
    private String nombre;
    private String especie;
    private int edad;

    public mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }

    public void cumplirAnios() {
        edad++;
    }
}
