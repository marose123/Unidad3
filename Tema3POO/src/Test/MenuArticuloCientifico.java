package Test;
import TDA.ArticuloCientifico;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class MenuArticuloCientifico {
    public static void main(String[] args) {
        List<String> menu = Arrays.asList(
            "Crear art�culo cient�fico",
            "Mostrar informaci�n de art�culo cient�fico",
            "Salir"
        );
        menuArticuloCientifico(menu);
    }

    public static String mostrarMenu(List<String> menu) {
        String[] opciones = menu.toArray(new String[0]);
        String opcion = (String) JOptionPane.showInputDialog(
            null,
            "Selecciona una opci�n:",
            "Men� de Art�culos Cient�ficos",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );
        return opcion;
    }

    public static void menuArticuloCientifico(List<String> menu) {
        ArticuloCientifico articulo = null;

        String opcion = "";
        do {
            opcion = mostrarMenu(menu);
            switch (opcion) {
                case "Crear art�culo cient�fico":
                    String nombreArticulo = JOptionPane.showInputDialog("Ingrese el nombre del art�culo cient�fico:");
                    String nombreAutor = JOptionPane.showInputDialog("Ingrese el nombre del autor del art�culo cient�fico:");
                    String[] palabrasClave = JOptionPane.showInputDialog("Ingrese las palabras clave del art�culo cient�fico (separadas por comas):").split(",");
                    String nombrePublicacion = JOptionPane.showInputDialog("Ingrese el nombre de la publicaci�n del art�culo cient�fico:");
                    byte año = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el a�o de publicaci�n del art�culo cient�fico:"));
                    String resumen = JOptionPane.showInputDialog("Ingrese el resumen del art�culo cient�fico:");
                    articulo = new ArticuloCientifico(nombreArticulo, nombreAutor, palabrasClave, nombrePublicacion, año, resumen);
                    JOptionPane.showMessageDialog(null, "El art�culo cient�fico ha sido creado exitosamente.");
                    break;

                case "Mostrar informaci�n de art�culo cient�fico":
                    if (articulo != null) {
                        articulo.imprimirAtributos();
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay art�culo cient�fico para mostrar.");
                    }
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
}
