
package tp8_programacion2_gomezjuanmanuel;

public class TarjetaCredito implements PagoConDescuento {
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito: $" + monto);
    }

    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento de " + porcentaje + "% en la tarjeta de crédito.");
    }
}

