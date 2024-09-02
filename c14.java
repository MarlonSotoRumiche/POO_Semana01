/*Escribir un programa en JAVA que permita  que los estudiantes de un curso se han dividido en dos grupos A y B de acuerdo al género y
 *el nombre. El grupo A está formado por las mujeres con un nombre anterior a la M y
 *los hombres con un nombre posterior a la N y el grupo B por el resto. Escribir un
 *programa que pregunte al usuario su nombre y género, y muestre por pantalla el grupo
 *que le corresponde.
 */
package casos;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Marlon
 */
public class c14{
    public static void main(String[] args) {
        int op;
        boolean validInput;
        String nombre = "";
        String genero = "";
        
    do{
        do {
            validInput = true;
            try {
                nombre = showInputDialog(null, "Ingrese su nombre:", "Datos", -1);
                
                if (nombre == null) {
                    showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                    return;
                }

                if (nombre.trim().isEmpty()) {
                    showMessageDialog(null, "El nombre no puede estar vacío.", "Error", 2);
                    validInput = false;
                }
                
            } catch (Exception e) {
                showMessageDialog(null, "Error al ingresar el nombre.", "Error", 2);
                validInput = false;
            }
        } while (validInput==false);

        // Solicitar el género del usuario
        do {
            validInput = true;
            try {
                genero = showInputDialog(null, "Ingrese su género (M/F):", "Datos", -1);
                
                if (genero == null) {
                    showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                    return;
                }

                genero = genero.toUpperCase(); // Convertir a mayúsculas para uniformidad
                
                if (!genero.equals("M") && !genero.equals("F")) {
                    showMessageDialog(null, "Género no válido. Ingrese 'M' para masculino o 'F' para femenino.", "Error", 2);
                    validInput = false;
                }
                
            } catch (Exception e) {
                showMessageDialog(null, "Error al ingresar el género.", "Error", 2);
                validInput = false;
            }
        } while (validInput==false);

        // Determinar el grupo
        char primeraLetraNombre = nombre.toUpperCase().charAt(0); // Convertir la primera letra a mayúscula para comparación
        String grupo;

        if (genero.equals("F") && primeraLetraNombre < 'M' || genero.equals("M") && primeraLetraNombre > 'N') {
            grupo = "A";
        } else {
            grupo = "B";
        }

        // Mostrar el grupo correspondiente
        showMessageDialog(null, "Su grupo es el Grupo " + grupo + ".", "Resultado", -1);
        
        op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);
            
        } while (op == YES_OPTION); 
    
        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
    }
}

