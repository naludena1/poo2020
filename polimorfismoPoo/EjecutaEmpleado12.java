package polimorfismoPoo;
import java.util.Scanner;

public class EjecutaEmpleado12 {


    public static void main(String[] args) {
        // Obtener el sueldo quincenal de un empleado por horas
        EmpleadoPorHoras2  empHoras = new EmpleadoPorHoras2();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculo del sueldo quincenal del empleado por Horas");
        System.out.println("Ingrese las horas trabajadas: ");
        empHoras.setHorasTrabajadas(entrada.nextDouble());
        System.out.println("Ingrese la cuota por Hora");
        empHoras.setCuotaPorHora(entrada.nextDouble());
        empHoras.calcularSueldoQuinc();
        System.out.println("El sueldo quincenal es: " + empHoras.getSueldo());


        EmpleadoAsalariado2 empAs = new EmpleadoAsalariado2();
        System.out.println("Calculo del sueldo quincenal del empleado asalariado");
        System.out.println("Ingrese el sueldo mensual: ");
        empAs.setSueldoMensual(entrada.nextDouble());
        empAs.calcularSueldoQuinc();
        System.out.println("El sueldo quincenl es: " + empAs.getSueldo());

    }
}
