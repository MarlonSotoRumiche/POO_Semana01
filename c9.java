/*Escribir un programa que pida al usuario dos números y muestre por pantalla su
 *división. Si el divisor es cero el programa debe mostrar un error.
 */
package casos;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Marlon
 */
public class c9 {
    public static void main(String[] args) {
        int op;
        double numerador = 0, denominador = 0, resultado;
        boolean validInput;

        do {
            do {
                validInput = true;

                try {
                    String inputNumerador = showInputDialog(null, "Ingrese el numerador:", "Datos", -1);
                    
                    if (inputNumerador == null) {
                        showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                        return;   
                    } 
                    
                    numerador = Double.parseDouble(inputNumerador);

                    String inputDenominador = showInputDialog(null, "Ingrese el denominador:", "Datos", -1);
                    
                    if (inputDenominador == null) {
                        showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                        return;   
                    } 
                        
                    denominador = Double.parseDouble(inputDenominador);

                        if (denominador == 0) {
                            showMessageDialog(null, "El denominador no puede ser cero. La división no es posible.", "Error", 2);
                            validInput = false;
                        }
                    
                } catch (NumberFormatException e) {
                    showMessageDialog(null, "Introduce un número válido.", "Error", 2);
                    validInput = false;
                }
                
            } while (validInput==false);

            //División
            resultado = numerador / denominador;
            
            showMessageDialog(null, "El resultado de la división es: " + resultado, "Resultado", -1);
            
            op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);
            
        } while (op == YES_OPTION);
        
        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
    }
}

