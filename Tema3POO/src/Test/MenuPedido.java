package Test;
import TDA.Pedido;

import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class MenuPedido {
    public static void main(String[] args) {
        List<String> menu = Arrays.asList(
            "Calcular pedido con un plato y una bebida",
            "Calcular pedido con dos platos y una bebida",
            "Calcular pedido con dos platos, una bebida y un postre",
            "Salir"
        );
        menuPedido(menu);
    }

    public static String mostrarMenu(List<String> menu) {
        String[] opciones = menu.toArray(new String[0]);
        String opcion = (String) JOptionPane.showInputDialog(
            null,
            "Selecciona una opción:",
            "Menú de Pedido",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );
        return opcion;
    }

    public static void menuPedido(List<String> menu) {
        Pedido pedido = new Pedido();
        String opcion = "";
        do {
            opcion = mostrarMenu(menu);
            switch (opcion) {
                case "Calcular pedido con un plato y una bebida":
                    String primerPlato = JOptionPane.showInputDialog("Ingrese el primer plato:");
                    double costoPrimerPlato = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del primer plato:"));
                    String bebida = JOptionPane.showInputDialog("Ingrese la bebida:");
                    double costoBebida = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de la bebida:"));
                    pedido.calcularPedido(primerPlato, costoPrimerPlato, bebida, costoBebida);
                    break;

                case "Calcular pedido con dos platos y una bebida":
                    String primerPlato2 = JOptionPane.showInputDialog("Ingrese el primer plato:");
                    double costoPrimerPlato2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del primer plato:"));
                    String segundoPlato2 = JOptionPane.showInputDialog("Ingrese el segundo plato:");
                    double costoSegundoPlato2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del segundo plato:"));
                    String bebida2 = JOptionPane.showInputDialog("Ingrese la bebida:");
                    double costoBebida2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de la bebida:"));
                    pedido.calcularPedido(primerPlato2, costoPrimerPlato2, segundoPlato2, costoSegundoPlato2, bebida2, costoBebida2);
                    break;

                case "Calcular pedido con dos platos, una bebida y un postre":
                    String primerPlato3 = JOptionPane.showInputDialog("Ingrese el primer plato:");
                    double costoPrimerPlato3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del primer plato:"));
                    String segundoPlato3 = JOptionPane.showInputDialog("Ingrese el segundo plato:");
                    double costoSegundoPlato3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del segundo plato:"));
                    String bebida3 = JOptionPane.showInputDialog("Ingrese la bebida:");
                    double costoBebida3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de la bebida:"));
                    String postre3 = JOptionPane.showInputDialog("Ingrese el postre:");
                    double costoPostre3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del postre:"));
                    pedido.calcularPedido(primerPlato3, costoPrimerPlato3, segundoPlato3, costoSegundoPlato3, bebida3, costoBebida3, postre3, costoPostre3);
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
}