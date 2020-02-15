// Integrantes: Nohelia L, Diana S.
package taller_repeticion;
import java.util.Scanner;

public class EjecutaMultiplicacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int result;

        System.out.println("Ingrese el primer numero:");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = entrada.nextInt();

        MultiplicacionVariosNumeros multiplicacion = new MultiplicacionVariosNumeros(num1, num2);
        result = multiplicacion.obtenerResultado();
        System.out.printf("\nEl resultado de la Multiplicacion %d x %d es igual a %.2f", num1, num2, result);
    }
}

