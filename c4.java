/*Escribir un programa en java que dado dos numeros,muestre la suma,
 *resta,division y multiplicacion de ambos
 */
package casos;
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Marlon
 */
public class c4 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        int op,n1 = 0,n2 = 0,sum, res, mul; 
        double div;
        boolean validInput;

        do {
            do {
                try {
                    String input1 = showInputDialog(null, "Ingrese el primer número:", "Datos", 1);
                    String input2 = showInputDialog(null, "Ingrese el segundo número:", "Datos", 1);
                    
                    validInput=true;
                    
                    if (input1==null){
                        showMessageDialog(null,"Operación cancelada. Saliendo del programa.","Cancelado",1);
                        return;   
                    }else{
                        if(input2==null){
                            showMessageDialog(null,"Operación cancelada. Saliendo del programa.","Cancelado",-1);
                            return;
                        }
                    }
                    
                    n1 = Integer.parseInt(input1); 
                    n2 = Integer.parseInt(input2); 
                    
                } catch (NumberFormatException e) {
                    showMessageDialog(null, "Introduce un número (entero) correcto.", "Error", 2);
                    validInput = false;
                }
            } while (validInput==false);

            try {
                showMessageDialog(null, "Los números ingresados son: \n"
                        + ">Número 1: " + n1 + "\n"
                        + ">Número 2: " + n2, "Datos", -1);

                // Cálculos
                sum = n1 + n2;
                res = n1 - n2;
                mul = n1 * n2;
                
                if (n2 == 0) {
                    showMessageDialog(null, "No se puede dividir entre cero", "ERROR", 2);
                } else {
                    div = (double) n1 / n2;
                    showMessageDialog(null, "Suma: " + sum + "\n"
                            + "Resta: " + res + "\n"
                            + "Multiplicación: " + mul + "\n"
                            + "División: " + df.format(div) + "\n", "Cálculos", -1);
                }

            } catch (Exception e) {
                showMessageDialog(null, "Error: " + e, "Error", 2);
            }

            op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);

        } while (op == YES_OPTION);

        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
    }
}
