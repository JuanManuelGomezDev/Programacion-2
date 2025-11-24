
package tp8_programacion2_gomezjuanmanuel;

public class Cliente implements Notificable {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificarCambio(String estado) {
        System.out.println("El cliente " + nombre + " ha sido notificado del cambio de estado: " + estado);
    }
}

