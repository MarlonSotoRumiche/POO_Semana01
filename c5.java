/*Escribir un programa en JAVA que convierta un valor dado en grados Fahrenheit
 *a grados Celsius.
*/
package casos;
import static javax.swing.JOptionPane.*;
import java.text.DecimalFormat;
/**
 *
 * @author Marlon
 */
public class c5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DecimalFormat df = new DecimalFormat("#.##");
        int op,gF = 0;
        double gC;
        boolean validInput;
        
        do{
           do{
                try{
                String input1 = showInputDialog(null,"Ingrese los grados Fahrenheit (°F): ","Dato",1);
                validInput=true;
                
                if (input1==null) {
                        showMessageDialog(null,"Operación cancelada. Saliendo del programa.","Cancelado",1);
                        return;   
                }
                
                gF = Integer.parseInt(input1);
                
                }catch(NumberFormatException e){
                    showMessageDialog(null, "Introduce un número (entero) correcto.", "Error", 2);
                    validInput = false; 
                }
            
            }while (validInput==false); 
            
            gC=((gF-32)/1.8);
            
            try{
                showMessageDialog(null, "Convirtiendo en grados Celsius (°C): \n"
                        +">>>(°F -32)/1.8 = °C \n"
                        +"Conversión: "+ gF+" °F son "+ df.format(gC)+" °C.","Cálculos",-1);
               
           }catch(Exception e){
               showMessageDialog(null, "Error: " + e, "Error", 2);  
           }
            
            op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);
            
        }while (op == YES_OPTION);

        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);   
    }        
}          
            
    
    

