
package tp8_programacion2_gomezjuanmanuel;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;

    public Pedido(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
}
