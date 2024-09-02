/*Escribir un programa que pida al usuario un número entero y muestre por pantalla si
 *es par o impar.
 */
package casos;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Marlon
 */
public class c10 {
    public static void main(String[] args) {
        int op;
        int numero = 0;
        boolean validInput;

        do {
            do {
                validInput = true;

                try {
                    String inputNumero = showInputDialog(null, "Ingrese un número entero:", "Datos", -1);
                    
                    if (inputNumero == null) {
                        showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                        return;
                    } 
                        
                    numero = Integer.parseInt(inputNumero);
                    
                } catch (NumberFormatException e) {
                    showMessageDialog(null, "Introduce un número entero válido.", "Error", 2);
                    validInput = false;
                }

            } while (validInput==false);

            // Determinar si el número es par o impar
            if (numero % 2 == 0) {
                showMessageDialog(null, "El número " + numero + " es par.", "Resultado", -1);
            } else {
                showMessageDialog(null, "El número " + numero + " es impar.", "Resultado", -1);
            }

            op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);

        } while (op == YES_OPTION);

        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
    }
}

