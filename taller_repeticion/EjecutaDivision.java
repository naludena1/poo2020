// Integrantes: Nohelia L, Diana S.
package taller_repeticion;
import java.util.Scanner;

public class EjecutaDivision {
    public static void main(String[] args) {
        String opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Desea realizar una division a traves de restas repetitivas? 1. Si/2. No");
        opcion = entrada.nextLine();

        while (opcion.equals("si")) {
            System.out.println("Ingresar dividendo");
            int dividendo = entrada.nextInt();
            System.out.println("Ingresar divisor");
            int divisor = entrada.nextInt();

            Division division = new Division(dividendo, divisor);
            division.calcular_division();
            System.out.println("El resultado de la division es: " + division.obteber_division());
            entrada.nextLine();
            System.out.println("Desea seguir realizando division?  1. Si/2. No");
            opcion = entrada.nextLine();
        }
    }
}

