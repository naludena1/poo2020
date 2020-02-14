package deber_seleccion;
import java.util.Scanner;

public class EjecutaEjercicio2 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Ingrese el nombre del Empleado");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el numero de horas trabajadas");
            int horas = entrada.nextInt();
            System.out.println("Ingrese el valor por cada hora trabajada");
            double valor = entrada.nextDouble();

            Ejercicio2 ejercicio = new Ejercicio2(nombre, horas, valor);
            String imprimir = ejercicio.presentar();
            System.out.println(imprimir);
        }

}
