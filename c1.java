/* Escribir un programa en JAVA que pida al usuario su nombre 
 * y luego lo salude.
 */
/* Escribir un programa en JAVA que pida al usuario su nombre 
 * y luego lo salude.
 */
package casos;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Marlon
 */
public class c1 {
    public static void main(String[] args) {
        int op;
        String nombre;
        boolean validInput;

        do {
            do {
                validInput = true;
                nombre = showInputDialog(null, "Ingrese su nombre:", "Registro de nombre", -1);

                if (nombre == null) {
                    showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                    return;
                }

                if (nombre.trim().isEmpty()) {
                    showMessageDialog(null, "No se ha ingresado un nombre válido.", "Error", 2);
                    validInput = false;
                }

                for (char c : nombre.toCharArray()) {
                    if (Character.isDigit(c)) {
                        showMessageDialog(null, "El nombre no puede contener números.", "Error", 2);
                        validInput = false;
                        break;
                    }
                }

            } while (validInput==false);

            showMessageDialog(null, "Hola " + nombre + ", bienvenido(a).", "Bienvenido(a)", -1);

            op = showConfirmDialog(null, "¿Desea continuar?", "Continuar", YES_NO_OPTION, 2);

        } while (op == YES_OPTION);

        showMessageDialog(null, "Adiós " + nombre + ".", "Hasta Luego", -1);
    }
}


