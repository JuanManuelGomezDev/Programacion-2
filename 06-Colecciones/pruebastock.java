
package tp6_programacion2_gomezjuanmanuel;

public class pruebastock {
    public static void main(String[] args) {
        // Crear inventario
        Inventario inventario = new Inventario();

        // Crear productos
        Producto p1 = new Producto("1", "Laptop", 1500, 10, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("2", "Camiseta", 50, 20, CategoriaProducto.ROPA);
        Producto p3 = new Producto("3", "Arroz", 2.5, 100, CategoriaProducto.ALIMENTOS);
        Producto p4 = new Producto("4", "Sofá", 500, 5, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("5", "Celular", 800, 15, CategoriaProducto.ELECTRONICA);

        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // Listar productos
        inventario.listarProductos();

        // Buscar un producto por ID
        Producto encontrado = inventario.buscarProductoPorId("2");
        if (encontrado != null) {
            System.out.println("Producto encontrado:");
            encontrado.mostrarInfo();
        }

        // Filtrar productos por categoría
        System.out.println("Filtrar productos por categoría ELECTRONICA:");
        java.util.ArrayList<Producto> electronica = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for (Producto p : electronica) {
            p.mostrarInfo();
        }

        // Eliminar un producto por ID
        inventario.eliminarProducto("3");
        System.out.println("Lista después de eliminar el producto con ID 3:");
        inventario.listarProductos();

        // Actualizar stock de un producto
        inventario.actualizarStock("2", 25);
        System.out.println("Stock actualizado del producto con ID 2:");
        inventario.listarProductos();

        // Mostrar total de stock
        System.out.println("Total de stock disponible: " + inventario.obtenerTotalStock());

        // Obtener producto con mayor stock
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println("Producto con mayor stock:");
        mayorStock.mostrarInfo();

        // Filtrar productos por precio
        System.out.println("Filtrar productos con precios entre $1000 y $3000:");
        java.util.ArrayList<Producto> filtrados = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : filtrados) {
            p.mostrarInfo();
        }

        // Mostrar categorías disponibles
        inventario.mostrarCategoriasDisponibles();
    }
}
