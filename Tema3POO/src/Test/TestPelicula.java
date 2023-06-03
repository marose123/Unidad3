package Test;

import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import EntradaSalida.Tools;
import TDA.Pelicula;

public class TestPelicula {
    public static void main(String[] args) {
        List<String> menu = Arrays.asList(
            "Agregar pel�cula",
            "Mostrar pel�culas",
            "Buscar pel�cula",
            "Salir"
        );
        menuOrdenamiento(menu);
    }

    public static String boton(List<String> menu) {
        String[] valores = menu.toArray(new String[0]);
        String opcion = (String) JOptionPane.showInputDialog(null, "SELECCIONA UNA OPCI�N", "M E N U",
                JOptionPane.QUESTION_MESSAGE, null,
                valores, valores[0]);
        return opcion;
    }

    public static void menuOrdenamiento(List<String> menu) {
        Pelicula[] peliculas = new Pelicula[100];
        int contador = 0;

        String sel = "";
        do {
            sel = boton(menu);
            switch (sel) {
                case "Agregar pel�cula":
                    if (contador < peliculas.length) {
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la pel�cula:");
                        String director = JOptionPane.showInputDialog("Ingrese el nombre del director:");
                        String genero = JOptionPane.showInputDialog("Ingrese el g�nero de la pel�cula:");
                        int duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duraci�n de la pel�cula (en minutos):"));
                        int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el a�o de la pel�cula:"));
                        double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificaci�n de la pel�cula:"));

                        peliculas[contador] = new Pelicula(nombre, director, genero, duracion, año, calificacion);
                        contador++;
                        JOptionPane.showMessageDialog(null, "La pel�cula se ha agregado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pueden agregar m�s pel�culas. El l�mite ha sido alcanzado.");
                    }
                    break;

                case "Mostrar pel�culas":
                    if (contador > 0) {
                        StringBuilder listaPeliculas = new StringBuilder("LISTA DE PEL�CULAS:\n");
                        for (int i = 0; i < contador; i++) {
                            listaPeliculas.append(peliculas[i].toString()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, listaPeliculas.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay pel�culas para mostrar.");
                    }
                    break;

                case "Buscar pel�cula":
                    if (contador > 0) {
                        String nombreBusqueda = JOptionPane.showInputDialog("Ingrese el nombre de la pel�cula a buscar:");
                        boolean encontrada = false;
                        for (int i = 0; i < contador; i++) {
                            if (peliculas[i].getNombre().equalsIgnoreCase(nombreBusqueda)) {
                                JOptionPane.showMessageDialog(null, "La pel�cula fue encontrada:\n" + peliculas[i].toString());
                                encontrada = true;
                                break;
                            }
                        }
                        if (!encontrada) {
                            JOptionPane.showMessageDialog(null, "La pel�cula no fue encontrada.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay pel�culas para buscar.");
                    }
                    break;

                case "Salir":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opci�n inv�lida");
                    break;
            }
        } while (!sel.equals("Salir"));
    }
}