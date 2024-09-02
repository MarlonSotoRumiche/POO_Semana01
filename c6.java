/*Escribir un programa en JAVA que calcule la media de tres números introducidos
 *por teclado.
 */
package casos;
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Marlon
 */
public class c6 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        DecimalFormat df = new DecimalFormat("#.##");
        int op,n1=0,n2=0,n3=0;
        double prom;
        boolean validInput;

        do {
            do {
                try {
                    String input1 = showInputDialog(null,"Ingrese el primer número:","Datos",1);
                    String input2 = showInputDialog(null,"Ingrese el segundo número:","Datos",1);
                    String input3 = showInputDialog(null,"Ingrese el tercer número:","Datos",1);
                    
                    validInput=true;
                    
                    if (input1==null){
                        showMessageDialog(null,"Operación cancelada. Saliendo del programa.","Cancelado",1);
                        return;   
                    }else{
                        if(input2==null){
                            showMessageDialog(null,"Operación cancelada. Saliendo del programa.","Cancelado",-1);
                            return;
                        }else{
                            if(input3==null){
                                showMessageDialog(null,"Operación cancelada. Saliendo del programa.","Cancelado",-1);
                                return;
                            }
                        }
                    }    
                    
                    n1 = Integer.parseInt(input1);
                    n2 = Integer.parseInt(input2);
                    n3 = Integer.parseInt(input3);
                    
                }catch(NumberFormatException e){
                    showMessageDialog(null,"Introduce un número (entero) correcto.","Error",2);
                    validInput=false;
                }
               
            }while (validInput==false);
            
            prom=(double)(n1+n2+n3)/3;
            
            try{
                showMessageDialog(null, "Los números son: \n"
                        +">Número 1: "+n1+ "\n"
                        +">Número 1: "+n1+ "\n"
                        +">Número 3: "+n3+ "\n"
                        +"El promedio de estos números es: "+df.format(prom),"Cálculos",-1);
                
            }catch (Exception e){
                showMessageDialog(null, "Error: " + e, "Error", 2);
            }
            
            op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);
            
        }while(op==YES_OPTION);
        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
        
    } 
} 
   
       
                    