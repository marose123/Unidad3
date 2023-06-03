package Test;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class MenuConversorMetros {
    public static void main(String[] args) {
        List<String> menu = Arrays.asList(
            "Convertir metros a centímetros",
            "Convertir metros a milímetros",
            "Salir"
        );
        menuConversorMetros(menu);
    }

    public static String mostrarMenu(List<String> menu) {
        String[] opciones = menu.toArray(new String[0]);
        String opcion = (String) JOptionPane.showInputDialog(
            null,
            "Selecciona una opción:",
            "Menú de Conversor de Metros",
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
                case "Convertir metros a centímetros":
                    double metrosCentimetros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en metros:"));
                    double centimetros = convertirMetrosToCentimetros(metrosCentimetros);
                    JOptionPane.showMessageDialog(null, metrosCentimetros + " metros equivalen a " + centimetros + " centímetros.");
                    break;

                case "Convertir metros a milímetros":
                    double metrosMilimetros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en metros:"));
                    double milimetros = convertirMetrosToMilimetros(metrosMilimetros);
                    JOptionPane.showMessageDialog(null, metrosMilimetros + " metros equivalen a " + milimetros + " milímetros.");
                    break;

                case "Salir":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
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