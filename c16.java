/* Escribir un programa en JAVA que permita encontrar si al ingresar tres números 
 * muestra con un mensaje cuál es primo, par o impar.
 */
package casos;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Marlon
 */
public class c16 {
    public static void main(String[] args) {
        int op;
        boolean validInput;

        do {
            String[] resultados = new String[3];

            for (int j = 1; j <= 3; j++) {
                validInput = true;
                int numero = 0;

                do {
                    validInput = true;
                    try {
                        String input = showInputDialog(null, "Ingrese el número " + j + ":", "Datos", -1);

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

                } while (validInput==false);

                // Determinar si el número es primo
                boolean esPrimo = true;
                if (numero < 2) {
                    esPrimo = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(numero); i++) {
                        if (numero % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                }

                // Determinar si el número es par o impar
                String tipoNumero = (numero % 2 == 0) ? "par" : "impar";

                // Construir el mensaje para el número actual
                String mensaje = "El número " + numero + " es " + tipoNumero;
                if (esPrimo && numero > 1) {
                    mensaje += " y también es primo.";
                } else {
                    mensaje += " y no es primo.";
                }

                resultados[j - 1] = mensaje;
            }

            String resultadosFinales = String.join("\n", resultados);
            showMessageDialog(null, resultadosFinales, "Resultados", -1);

            op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);

        } while (op == YES_OPTION);

        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
    }
}


