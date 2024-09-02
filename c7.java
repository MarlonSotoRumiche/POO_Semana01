/*Escribir un programa en JAVA que reciba una cantidad de minutos y lo convierta
 *a horas y minutos.
 */
package casos;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Marlon
 */
public class c7 {
    public static void main(String[] args) {
        
        int op, minutos = 0;
        boolean validInput;

        do {
            do {
                validInput = true;

                try {
                    String input = showInputDialog(null, "Ingrese la cantidad de minutos:", "Datos", -1);
                    
                    if (input == null) {
                        showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                        return;
                    }
                    
                    minutos = Integer.parseInt(input);

                    if (minutos < 0) {
                        showMessageDialog(null, "Los minutos no pueden ser negativos.", "Error", 2);
                        validInput = false;
                    }

                } catch (NumberFormatException e) {
                    showMessageDialog(null, "Introduce un número (entero) correcto.", "Error", 2);
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

            // Conversión de minutos a horas y minutos
            int horas = minutos / 60;
            int minutosRestantes = minutos % 60;

            showMessageDialog(null, "La cantidad de minutos es: " + minutos + "\n" +
                    "Equivale a: " + horas + " horas y " + minutosRestantes + " minutos.", 
                    "Resultado", -1);

            op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);

        } while (op == YES_OPTION);

        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
    }
}


