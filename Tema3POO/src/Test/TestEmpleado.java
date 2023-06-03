package Test;

import TDA.Empleado;

import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class TestEmpleado {
    public static void main(String[] args) {
        List<String> menu = Arrays.asList(
            "Crear empleado",
            "Mostrar información de empleados",
            "Comparar empleados",
            "Salir"
        );
        menuEmpleado(menu);
    }

    public static String mostrarMenu(List<String> menu) {
        String[] opciones = menu.toArray(new String[0]);
        String opcion = (String) JOptionPane.showInputDialog(
            null,
            "Selecciona una opción:",
            "Menú de Empleados",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );
        return opcion;
    }

    public static void menuEmpleado(List<String> menu) {
        Empleado emp1 = null;
        Empleado emp2 = null;

        String opcion = "";
        do {
            opcion = mostrarMenu(menu);
            switch (opcion) {
                case "Crear empleado":
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                    byte edad = Byte.parseByte(JOptionPane.showInputDialog("Ingrese la edad del empleado:"));
                    byte horasTrabajadas = Byte.parseByte(JOptionPane.showInputDialog("Ingrese las horas trabajadas del empleado:"));
                    double pagoHoras = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el pago por horas del empleado:"));
                    if (emp1 == null) {
                        emp1 = new Empleado(nombre, edad, horasTrabajadas, pagoHoras);
                        JOptionPane.showMessageDialog(null, "El empleado 1 ha sido creado exitosamente.");
                    } else if (emp2 == null) {
                        emp2 = new Empleado(nombre, edad, horasTrabajadas, pagoHoras);
                        JOptionPane.showMessageDialog(null, "El empleado 2 ha sido creado exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pueden agregar más empleados. El límite ha sido alcanzado.");
                    }
                    break;

                case "Mostrar información de empleados":
                    StringBuilder infoEmpleados = new StringBuilder();
                    if (emp1 != null) {
                        infoEmpleados.append("Empleado 1:\n");
                        infoEmpleados.append("Nombre: ").append(emp1.getNombEmp()).append("\n");
                        infoEmpleados.append("Edad: ").append(emp1.getEdadEmp()).append("\n");
                        infoEmpleados.append("Horas trabajadas: ").append(emp1.getHrstrabEmp()).append("\n");
                        infoEmpleados.append("Pago por horas: ").append(emp1.getPagohrsEmp()).append("\n");
                        infoEmpleados.append("\n");
                    }
                    if (emp2 != null) {
                        infoEmpleados.append("Empleado 2:\n");
                        infoEmpleados.append("Nombre: ").append(emp2.getNombEmp()).append("\n");
                        infoEmpleados.append("Edad: ").append(emp2.getEdadEmp()).append("\n");
                        infoEmpleados.append("Horas trabajadas: ").append(emp2.getHrstrabEmp()).append("\n");
                        infoEmpleados.append("Pago por horas: ").append(emp2.getPagohrsEmp()).append("\n");
                    }
                    if (infoEmpleados.length() > 0) {
                        JOptionPane.showMessageDialog(null, infoEmpleados.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay empleados para mostrar.");
                    }
                    break;

                case "Comparar empleados":
                    if (emp1 != null && emp2 != null) {
                        Empleado empleadoMayorEdad = Empleado.mayorEdad(emp1, emp2);
                        Empleado empleadoMayorHorasTrabajadas = Empleado.mayorHrsTrabajas(emp1, emp2);
                        StringBuilder comparacionEmpleados = new StringBuilder();
                        comparacionEmpleados.append("Empleado de mayor edad:\n");
                        comparacionEmpleados.append("Nombre: ").append(empleadoMayorEdad.getNombEmp()).append("\n");
                        comparacionEmpleados.append("Edad: ").append(empleadoMayorEdad.getEdadEmp()).append("\n");
                        comparacionEmpleados.append("\n");
                        comparacionEmpleados.append("Empleado de mayor horas trabajadas:\n");
                        comparacionEmpleados.append("Nombre: ").append(empleadoMayorHorasTrabajadas.getNombEmp()).append("\n");
                        comparacionEmpleados.append("Horas trabajadas: ").append(empleadoMayorHorasTrabajadas.getHrstrabEmp()).append("\n");
                        JOptionPane.showMessageDialog(null, comparacionEmpleados.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay suficientes empleados para comparar.");
                    }
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
