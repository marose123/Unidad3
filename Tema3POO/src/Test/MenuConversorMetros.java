package Test;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class MenuConversorMetros {
    public static void main(String[] args) {
        List<String> menu = Arrays.asList(
            "Convertir metros a cent�metros",
            "Convertir metros a mil�metros",
            "Salir"
        );
        menuConversorMetros(menu);
    }

    public static String mostrarMenu(List<String> menu) {
        String[] opciones = menu.toArray(new String[0]);
        String opcion = (String) JOptionPane.showInputDialog(
            null,
            "Selecciona una opci�n:",
            "Men� de Conversor de Metros",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );
        return opcion;
    }

    public static void menuConversorMetros(List<String> menu) {
        String opcion = "";
        do {
            opcion = mostrarMenu(menu);
            switch (opcion) {
                case "Convertir metros a cent�metros":
                    double metrosCentimetros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en metros:"));
                    double centimetros = convertirMetrosToCentimetros(metrosCentimetros);
                    JOptionPane.showMessageDialog(null, metrosCentimetros + " metros equivalen a " + centimetros + " cent�metros.");
                    break;

                case "Convertir metros a mil�metros":
                    double metrosMilimetros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en metros:"));
                    double milimetros = convertirMetrosToMilimetros(metrosMilimetros);
                    JOptionPane.showMessageDialog(null, metrosMilimetros + " metros equivalen a " + milimetros + " mil�metros.");
                    break;

                case "Salir":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opci�n inv�lida");
                    break;
            }
        } while (!opcion.equals("Salir"));
    }

    public static double convertirMetrosToCentimetros(double metros) {
        final int FACTOR_METROS_CM = 100;
        return FACTOR_METROS_CM * metros;
    }

    public static double convertirMetrosToMilimetros(double metros) {
        final int FACTOR_METROS_MILIM = 1000;
        return FACTOR_METROS_MILIM * metros;
    }
}