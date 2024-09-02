/*Escribir un programa en JAVA que permita mostrar usando mensajes cuando es un 
 *triángulo isósceles, escaleno y equilátero.
 */
package casos;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Marlon
 */
public class c17 {
    public static void main(String[] args) {
        int op;
        boolean validInput;

        do {
            validInput = true;
            double lado1 = 0, lado2 = 0, lado3 = 0;

            do {
                try {
                    String inputLado1 = showInputDialog(null, "Ingrese la longitud del primer lado:", "Datos", -1);
                    
                    if (inputLado1 == null) {
                        showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                        return;
                    }
                    
                    lado1 = Double.parseDouble(inputLado1);
                    
                    String inputLado2 = showInputDialog(null, "Ingrese la longitud del segundo lado:", "Datos", -1);
                    
                    if (inputLado2 == null) {
                        showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                        return;
                    }
                    
                    lado2 = Double.parseDouble(inputLado2);
                    
                    String inputLado3 = showInputDialog(null, "Ingrese la longitud del tercer lado:", "Datos", -1);
                    
                    if (inputLado3 == null) {
                        showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                        return;
                    }
                    
                    lado3 = Double.parseDouble(inputLado3);
                    
                    if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
                        showMessageDialog(null, "Las longitudes deben ser mayores a cero.", "Error", 2);
                        validInput = false;
                    }
                } catch (NumberFormatException e) {
                    showMessageDialog(null, "Introduce números válidos para las longitudes.", "Error", 2);
                    validInput = false;
                }
            } while (!validInput);

            // Determinar el tipo de triángulo
            String tipoTriangulo;
            if (lado1 == lado2 && lado2 == lado3) {
                tipoTriangulo = "equilátero";
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                tipoTriangulo = "isósceles";
            } else {
                tipoTriangulo = "escaleno";
            }

            showMessageDialog(null, "El triángulo con lados " + lado1 + ", " + lado2 + " y " + lado3 + " es " + tipoTriangulo + ".", "Resultado", -1);

            op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);

        } while (op == YES_OPTION);

        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
    }
}

