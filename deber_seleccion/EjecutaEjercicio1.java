package deber_seleccion;
import java.util.Scanner;

public class EjecutaEjercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del Estudiante:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese Calificacion 1:");
        double calific1 = entrada.nextDouble();
        System.out.println("Ingrese Calificacion 2:");
        double calific2 = entrada.nextDouble();
        System.out.println("Ingrese Calificacion 3:");
        double calific3 = entrada.nextDouble();
        System.out.println("Ingrese Calificacion 4:");
        double calific4 = entrada.nextDouble();

        Ejercicio1 calificaciones = new Ejercicio1(nombre, calific1, calific2, calific3, calific4);
        String presentacion = calificaciones.presentar();
        System.out.println(presentacion);
    }

}
