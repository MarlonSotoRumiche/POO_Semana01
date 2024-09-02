/*Escribir un programa donde el usuario pueda pedir usando un menú de opciones la
 *bebida que requiera, el programa debe solicitar si el usuario desea helada, al tiempo,
 *caliente, sin azúcar u otras alternativas que usted pueda plantear, por cada opción
 *debe tener un precio, el programa solicita la cantidad de bebidas y deberá mostrar el
 *precio a pagar. También deberá tener en cuenta si paga en efectivo, tarjeta o yape.
 */
package casos;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Marlon
 */
public class c12 {
    public static void main(String[] args) {
        int op;
        boolean validInput;

        do {
            // Menú de opciones de bebidas
            String[] bebidas = {"Café", "Té", "Jugo", "Agua"};
            String bebidaSeleccionada = (String) showInputDialog(null, "Seleccione la bebida que desea:", "Menú de Bebidas", QUESTION_MESSAGE, null, bebidas, bebidas[0]);
            
            if (bebidaSeleccionada == null) {
                showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                return;
            }

            // Menú de opciones para las características de la bebida
            String[] opciones;
            switch (bebidaSeleccionada) {
                case "Café":
                    opciones = new String[]{"Helada", "Al tiempo", "Caliente", "Con azúcar", "Sin azúcar"};
                    break;
                case "Té":
                    opciones = new String[]{"Helado", "Al tiempo", "Caliente", "Con limón", "Sin azúcar"};
                    break;
                case "Jugo":
                    opciones = new String[]{"Frío", "A temperatura ambiente", "Con pulpa", "Sin pulpa"};
                    break;
                case "Agua":
                    opciones = new String[]{"Fría", "A temperatura ambiente"};
                    break;
                default:
                    opciones = new String[]{};
            }

            String opcionSeleccionada = (String) showInputDialog(null, "Seleccione cómo desea la bebida:", "Opciones de Bebida", QUESTION_MESSAGE, null, opciones, opciones[0]);
            
            if (opcionSeleccionada == null) {
                showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                return;
            }

            // Asignación de precios según la bebida y la opción seleccionada
            double precioBase = 0;

            switch (bebidaSeleccionada) {
                case "Café":
                    precioBase = 5.00;
                    break;
                case "Té":
                    precioBase = 4.00;
                    break;
                case "Jugo":
                    precioBase = 3.50;
                    break;
                case "Agua":
                    precioBase = 2.00;
                    break;
            }

            double precioOpcion = 0;

            switch (opcionSeleccionada) {
                case "Helada":
                    precioOpcion = 1.00;
                    break;
                case "Al tiempo":
                    precioOpcion = 0.50;
                    break;
                case "Caliente":
                    precioOpcion = 1.50;
                    break;
                case "Con azúcar":
                    precioOpcion = 0.30;
                    break;
                case "Sin azúcar":
                    precioOpcion = 0.20;
                    break;
                case "Con limón":
                    precioOpcion = 0.40;
                    break;
                case "Sin pulpa":
                    precioOpcion = 0.20;
                    break;
                case "Con pulpa":
                    precioOpcion = 0.30;
                    break;
                case "Fría":
                    precioOpcion = 0.10;
                    break;
                case "A temperatura ambiente":
                    precioOpcion = 0.05;
                    break;
                default:
                    precioOpcion = 0;
            }

            double precioTotalPorBebida = precioBase + precioOpcion;

            // Solicitar la cantidad de bebidas
            int cantidad = 0;
            do {
                validInput = true;
                try {
                    String inputCantidad = showInputDialog(null, "Ingrese la cantidad de bebidas que desea:", "Cantidad", QUESTION_MESSAGE);
                    
                    if (inputCantidad == null) {
                        showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                        return;
                    }
                    
                    cantidad = Integer.parseInt(inputCantidad);
                    
                    if (cantidad <= 0) {
                        showMessageDialog(null, "La cantidad debe ser mayor a 0.", "Error", ERROR_MESSAGE);
                        validInput = false;
                    }

                } catch (NumberFormatException e) {
                    showMessageDialog(null, "Ingrese un número válido para la cantidad.", "Error", ERROR_MESSAGE);
                    validInput = false;
                }
                
            } while (validInput==false);

            // Calcular el precio total
            double precioTotal = precioTotalPorBebida * cantidad;

            // Menú de opciones para el método de pago
            String[] metodosPago = {"Efectivo", "Tarjeta", "Yape"};
            String metodoPagoSeleccionado = (String) showInputDialog(null, "Seleccione el método de pago:", "Método de Pago", QUESTION_MESSAGE, null, metodosPago, metodosPago[0]);
            
            if (metodoPagoSeleccionado == null) {
                showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                return;
            }

            showMessageDialog(null, "---BOLETA DE VENTA---\n" +
                    "Bebida: " + bebidaSeleccionada + "\n" +
                    "Opción: " + opcionSeleccionada + "\n" +
                    "Cantidad: " + cantidad + "\n" +
                    "Método de Pago: " + metodoPagoSeleccionado + "\n" +
                    "Precio Total: S/." + String.format("%.2f", precioTotal), "Compra", INFORMATION_MESSAGE);

            op = showConfirmDialog(null, "¿Desea realizar otro pedido?", "Continuar", YES_NO_OPTION);
            
        } while (op == YES_OPTION);

        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
    }
}


