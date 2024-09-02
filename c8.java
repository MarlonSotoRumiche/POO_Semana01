/*Escribir un programa en JAVA que permita que una tienda haga descuento del 15% 
 *sobre el total de la compra.
 */
package casos;
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Marlon
 */
public class c8 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        int op;
        double totalCompra = 0, totalConDescuento, descuento;
        boolean validInput;

        do {
            do {
                validInput = true;

                try {
                    String input = showInputDialog(null, "Ingrese el total de la compra:", "Datos", -1);
                    
                    if (input == null) {
                        showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                        return;
                    }
                    
                    totalCompra = Double.parseDouble(input);
                    
                    if (totalCompra < 0) {
                        showMessageDialog(null, "El total de la compra no puede ser negativo.", "Error", 2);
                        validInput = false;
                    }

                } catch (NumberFormatException e) {
                    showMessageDialog(null, "Introduce un número válido para el total de la compra.", "Error", 2);
                    validInput = false;
                }

                if (validInput==false) {
                    op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);
                    if (op != YES_OPTION) {
                        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
                        return;
                    }
                }
                
            } while (validInput==false);

            // Calcular el descuento y el total con descuento
            descuento = totalCompra * 0.15;
            totalConDescuento = totalCompra - descuento;
            
            showMessageDialog(null, "Total de compra: S/." + df.format(totalCompra) + "\n"
                    + "Descuento: S/." + df.format(descuento) + "\n"
                    + "Total a pagar: S/." + df.format(totalConDescuento), "Descuento Aplicado", -1);
            
            op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);
            
        } while (op == YES_OPTION);
        
        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
    }
}


