package arreglosDeberPoo;
import java.util.Scanner;

public class EjecutaVerificarCedula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su numero de cédula: ");
        int cedula = scan.nextInt();
        VerificarCedula ejercicio3 = new VerificarCedula(cedula);
        ejercicio3.validacion();
        System.out.println(ejercicio3.obtenerCedula());
        System.out.println(ejercicio3.obtenerValidador());
        System.out.println(ejercicio3.obtenerEstado());
    }

}
