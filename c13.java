/*Escribir un programa en JAVA que permite tributar impuestos, se debe ser mayor de 18 años y tener unos
 *ingresos iguales o superiores a 1300 soles mensuales. Escribir un programa que
 *pregunte al usuario su edad y sus ingresos mensuales, muestre por pantalla si el
 *usuario tiene que tributar o no.
 */
package casos;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Marlon
 */
public class c13 {
    public static void main(String[] args) {
        boolean validInput;
        int edad = 0,op;
        double ingresos = 0;
    
    do{
        do {
            validInput = true;
            try {
                String inputEdad = showInputDialog(null, "Ingrese su edad:", "Datos", -1);
                
                if (inputEdad == null) {
                    showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                    return;
                }
                
                edad = Integer.parseInt(inputEdad);
                
                if (edad <= 0) {
                    showMessageDialog(null, "La edad debe ser mayor a 0.", "Error", 2);
                    validInput = false;
                }

            } catch (NumberFormatException e) {
                showMessageDialog(null, "Ingrese una edad válida (número entero).", "Error", 2);
                validInput = false;
            }
        } while (validInput==false);
        
        // Solicitar los ingresos
        do {
            validInput = true;
            try {
                String inputIngresos = showInputDialog(null, "Ingrese sus ingresos mensuales (en soles):", "Datos", 3);
                
                if (inputIngresos == null) {
                    showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                    return;
                }
                
                ingresos = Double.parseDouble(inputIngresos);
                
                if (ingresos < 0) {
                    showMessageDialog(null, "Los ingresos no pueden ser negativos.", "Error", 2);
                    validInput = false;
                }

            } catch (NumberFormatException e) {
                showMessageDialog(null, "Ingrese una cantidad válida para los ingresos.", "Error", 2);
                validInput = false;
            }
        } while (validInput==false);
        
        // Determinar si debe tributar
        if (edad > 18 && ingresos >= 1300) {
            showMessageDialog(null, "Debe tributar impuestos.", "Resultado", -1);
        } else {
            showMessageDialog(null, "No debe tributar impuestos.", "Resultado", -1);   
        }
        
        op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);
            
        } while (op == YES_OPTION); 
    
        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
    }
}


