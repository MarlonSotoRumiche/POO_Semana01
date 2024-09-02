/*
 */
package casos;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Marlon
 */
public class c19 {
    public static void main(String[] args) {
        int op;
        boolean validInput;

        do {
            validInput = true;
            double renta = 0;

            do {
                try {
                    String inputRenta = showInputDialog(null, "Ingrese su renta anual (S/.):", "Datos", -1);
                    
                    if (inputRenta == null) {
                        showMessageDialog(null, "Operación cancelada. Saliendo del programa.", "Cancelado", 1);
                        return;
                    }
                    
                    renta = Double.parseDouble(inputRenta);

                    if (renta < 0) {
                        showMessageDialog(null, "La renta no puede ser negativa.", "Error", 2);
                        validInput = false;
                    }

                } catch (NumberFormatException e) {
                    showMessageDialog(null, "Introduce un número válido para la renta.", "Error", 2);
                    validInput = false;
                }

            } while (!validInput);

            // Determinar el tipo impositivo
            String tipoImpositivo;
            if (renta < 10000) {
                tipoImpositivo = "5%";
            } else if (renta <= 20000) {
                tipoImpositivo = "15%";
            } else if (renta <= 35000) {
                tipoImpositivo = "20%";
            } else if (renta <= 60000) {
                tipoImpositivo = "30%";
            } else {
                tipoImpositivo = "45%";
            }

            showMessageDialog(null, "Para una renta anual de S/ " + renta + ", el tipo impositivo es: " + tipoImpositivo, "Tipo Impositivo", -1);

            op = showConfirmDialog(null, "¿Desea realizar otro cálculo?", "Continuar", YES_NO_OPTION);

        } while (op == YES_OPTION);

        showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!", "Mensaje", -1);
    }
}

