
package tp8_programacion2_gomezjuanmanuel;

public class Paypal implements PagoConDescuento {
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal: $" + monto);
    }

    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento de " + porcentaje + "% con PayPal.");
    }
}
