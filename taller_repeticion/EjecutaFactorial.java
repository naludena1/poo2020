// Integrantes: Nohelia L, Diana S.
package taller_repeticion;
import java.util.Scanner;

public class EjecutaFactorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Boolean bandera= true;
        String opcion = "";

        do {
            System.out.println("Ingrese un numero ");
            int numero = entrada.nextInt();
            entrada.nextLine();
            Factorial factorial= new Factorial(numero);
            int presentar = factorial.calcularFactorial();
            System.out.println(presentar);
            System.out.println("\nDesea calcular el factorial de otro numero ? si / no:");
            opcion = entrada.nextLine();
            if (opcion.equals("no")) {
                bandera = false;
            }else{
                bandera = true;
            }
        }while (bandera == true);
    }
}
