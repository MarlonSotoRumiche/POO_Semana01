/*Escribir un programa que permite encontrar las raíces de una ecuación cuadrática.
 */
package casos;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Marlon
 */
public class c11 {
    public static void main(String[] args) {
        int op;
        double a = 0, b = 0, c = 0;
        boolean validInput;

        do {
            do {
                validInput = true;

                try {
                    String inputA = showInputDialog(null, "Ingrese el coeficiente a:", "Datos", -1);
                    if (inputA == null) {
                        showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                        return;
                    } 
                        
                    a = Double.parseDouble(inputA);
                    
                    if (a == 0) {
                        showMessageDialog(null, "El coeficiente 'a' no puede ser 0 en una ecuación cuadrática.", "Error", 2);
                        validInput = false;
                    }

                    String inputB = showInputDialog(null, "Ingrese el coeficiente b:", "Datos", -1);
                    if (inputB == null) {
                        showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                        return;
                    } 
                        
                    b = Double.parseDouble(inputB);
 
                    String inputC = showInputDialog(null, "Ingrese el coeficiente c:", "Datos", -1);
                    if (inputC == null) {
                        showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                        return;
                    } 
                        
                    c = Double.parseDouble(inputC);
                    
                } catch (NumberFormatException e) {
                    showMessageDialog(null, "Introduce un número válido.", "Error", 2);
                    validInput = false;
                }

            } while (validInput==false);

            // Calcular el discriminante
            double discriminante = Math.pow(b, 2) - 4 * a * c;
            String resultado;

            if (discriminante > 0) {
                double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                resultado = "Las raíces son reales y diferentes.\nRaíz 1: " + raiz1 + "\nRaíz 2: " + raiz2;
            } else if (discriminante == 0) {
                double raiz = -b / (2 * a);
                resultado = "Las raíces son reales e iguales.\nRaíz: " + raiz;
            } else {
                resultado = "Las raíces son complejas y diferentes.\nNo hay soluciones reales.";
            }

            showMessageDialog(null, resultado, "Resultado", -1);

            op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);

        } while (op == YES_OPTION);

        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
    }
}
