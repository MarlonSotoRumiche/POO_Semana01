/*Escribir un programa en JAVA que calcule el 
 *perímetro y área de un rectángulo
 */
package casos;
import static javax.swing.JOptionPane.*;
import java.text.DecimalFormat;
/**
 *
 * @author Marlon
 */
public class c2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        int b, alt, op;
        double hipo, a, p;

        do {
            b = (int)(Math.random() * 15 + 1);
            alt = (int)(Math.random() * 15 + 1);
            
            hipo = Math.sqrt(b * b + alt * alt);
            p = b + alt + hipo;
            a = ((double)b * (double)alt) / 2;  
            
            try {
                // Mostrar datos del triángulo
                showMessageDialog(null, "Los datos del triángulo son: \n"
                        + "Base: " + b + "\n"
                        + "Altura: " + alt + "\n"
                        + ">>>Aplicando el Teorema de Pitágoras (c²=a²+b²):  \n" 
                        + "Hipotenusa = " + df.format(hipo) + "\n", "Datos", -1);
                
                // Mostrar cálculos
                showMessageDialog(null, "Calculando... \n"
                        + "Perímetro del triángulo: " + b + " + " + alt + " + " + df.format(hipo) + " = " + df.format(p) + "\n"
                        + "Base del triángulo: " + b + "\n"        
                        + "Altura del triángulo: " + alt + "\n"
                        + "Área del triángulo ((b*h)/2): " + df.format(a), "Cálculos", 1);
            } catch (Exception e) {
                showMessageDialog(null, "Error: " + e, "Error", 2);
            }

            op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);

        } while (op == YES_OPTION);
        
        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
    }
}



