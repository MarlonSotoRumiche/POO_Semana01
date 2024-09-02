
/* Escribir un programa en JAVA que permita encontrar el factorial de un número.
 */
package casos;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Marlon
 */
public class c15 {
    public static void main(String[] args) {
        int op;
        boolean validInput;

        do {
            validInput = true;
            int numero = 0;
            long factorial = 1; 

            do {
                validInput = true;
                try {
                    String input = showInputDialog(null, "Ingrese un número entero no negativo:", "Datos", -1);

                    if (input == null) {
                        showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                        return;
                    }

                    numero = Integer.parseInt(input);

                    if (numero < 0) {
                        showMessageDialog(null, "El número debe ser no negativo.", "Error", 2);
                        validInput = false;
                    }

                } catch (NumberFormatException e) {
                    showMessageDialog(null, "Introduce un número entero válido.", "Error", 2);
                    validInput = false;
                }

            } while (!validInput);

            // Calcular el factorial
            try {
                for (int i = 1; i <= numero; i++) {
                    factorial *= i;
                }

                showMessageDialog(null, "El factorial de " + numero + " es: " + factorial, "Resultado", -1);

            } catch (Exception e) {
                showMessageDialog(null, "Error al calcular el factorial: " + e.getMessage(), "Error", 2);
            }

            op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);

        } while (op == YES_OPTION);

        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
    }
}


