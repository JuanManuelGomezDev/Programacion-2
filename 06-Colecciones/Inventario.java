
package tp6_programacion2_gomezjuanmanuel;

import java.util.ArrayList;

public class Inventario {
    private final ArrayList<Producto> productos;

    // Constructor
    public Inventario() {
        productos = new ArrayList<>();
    }

    // Métodos para manipular los productos
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
            System.out.println("--------------------");
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;  // Si no se encuentra
    }

    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
        }
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        Producto mayorStock = null;
        for (Producto p : productos) {
            if (mayorStock == null || p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria.name() + ": " + categoria.getDescripcion());
        }
    }
}
