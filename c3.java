/*Escribir un programa en JAVA que calcule la hipotenusa de un triángulo
 *rectángulo conociendo sus catetos.
 */
package casos;
import static javax.swing.JOptionPane.*;
import java.text.DecimalFormat;
/**
 *
 * @author Marlon
 */
public class c3 {
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("#.##");
        int op,ca,co;
        double hipo;

        do {
            ca = (int)(Math.random() * 50 + 1);
            co = (int)(Math.random() * 50 + 1);
            
            hipo = Math.sqrt(ca * ca + co * co);  
            
            try {
                // Mostrar datos y calculos del triángulo
                showMessageDialog(null, "Los datos del triángulo son: \n"
                        + "Cateto Adyacente: " + ca + "\n"
                        + "Cateto Opuesto: " + co+ "\n"
                        + ">>>Aplicando el Teorema de Pitágoras (h²=ca²+co²):  \n" 
                        + "Hipotenusa = " + df.format(hipo) + "\n", "Datos", -1);
                
            } catch (Exception e) {
                showMessageDialog(null, "Error: " + e, "Error", 2);
            }

            op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);

        } while (op == YES_OPTION);
        
        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
    }
}
