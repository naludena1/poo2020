package herenciaEmpleado;
import herencia.Estudiante;
import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, cargo, dependecia;
        int horas;
        double valorHora, valorMensual;
        // Menú para ingreso de datos
        System.out.println("----------------- Empleado -------------------------------");
        System.out.println(" 1: Sueldo del empleado por hora   ");
        System.out.println(" 2: Sueldo de empleado mensual ");
        System.out.println("-----------------------------------------------------------");
        int op = entrada.nextInt();
        // Opciones de datos
        switch (op) {
            case 1:
                System.out.println("Ingrese el nombre: ");
                entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.println("Ingrese el cargo: ");
                cargo = entrada.nextLine();
                System.out.println("Ingrese la dependencia: ");
                dependecia = entrada.nextLine();
                System.out.println("Ingrese las horas trabajadas: ");
                horas = entrada.nextInt();
                System.out.println("Ingrese el valor por hora: ");
                valorHora = entrada.nextDouble();
                EmpleadoPorHora empleadoHoras = new EmpleadoPorHora(nombre, cargo, dependecia, horas, valorHora);

                System.out.println("------------------------------");
                System.out.println("Datos empleado por horas");
                System.out.println("Nombre: " +empleadoHoras.getNombre());
                System.out.println("Cargo: " +empleadoHoras.getCargo());
                System.out.println("Dependencia: " +empleadoHoras.getDependencia());
                System.out.println("Sueldo: " +empleadoHoras.CalcularSueldoHoras());
                break;

            case 2:
                System.out.println("Ingrese el nombre: ");
                entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.println("Ingrese el cargo: ");
                cargo = entrada.nextLine();
                System.out.println("Ingrese la dependencia: ");
                dependecia = entrada.nextLine();
                System.out.println("Ingrese el valor mensual: ");
                valorMensual = entrada.nextDouble();
                EmpleadoAsalariado empleadoAsa = new EmpleadoAsalariado(nombre, cargo, dependecia, valorMensual);

                System.out.println("------------------------------");
                System.out.println("Datos empleado por valor mensual");
                System.out.println("Nombre: " +empleadoAsa.getNombre());
                System.out.println("Cargo: " +empleadoAsa.getCargo());
                System.out.println("Dependencia: " +empleadoAsa.getDependencia());
                System.out.println("Sueldo: " +empleadoAsa.getVal_mensual());

                break;
            default:
                System.out.println("No existe la opción");
        }

    }
}
