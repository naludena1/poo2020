package diseniopoo;
import java.util.Scanner;

public class EjecutaDeber {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el nombre de la materia");
        String materia = entrada.nextLine();
        System.out.println("Ingrese la nota del primer bimestre");
        Double notaBim1 = entrada.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre");
        Double notaBim2 = entrada.nextDouble();

        Deber deber = new Deber(nombre,materia,notaBim1,notaBim2);
        String ap_rp = deber.obtener_mensaje();
        System.out.println(ap_rp);
    }
}

